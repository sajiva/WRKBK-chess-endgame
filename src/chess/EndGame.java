/* COSC 6368 Fall 2016 Project 1 */
/* Heuristic Search for the White Rook and King versus the Black King Chess Endgame */
/* Sajiva Pradhan 1007766 */

package chess;

import java.util.*;
import java.util.stream.Collectors;

public class EndGame {

    private static int edge = 1; // 1: top edge, 8: bottom edge
    private static int SEXP = 0; // count for number of states explored

    // solve the game and return the solution
    public static Map<Integer, List<List<List<Integer>>>> solve(List<List<Integer>> currentState) {

        Map<Integer, List<List<List<Integer>>>> result = new HashMap<>();
        List<List<List<Integer>>> solution = new ArrayList<>();
        List<List<List<Integer>>> selectedWMoves = new ArrayList<>();

        edge = getEdgePosition(currentState.get(0), currentState.get(1));

        int status = 0; // 0: continue; 1:checkmate 2:stalemate
        SEXP = 0; // initialize for each problem

        while (status == 0 && SEXP < 10000) {

            // explore possible white moves
            List<List<List<Integer>>> expandedNodes = generateValidWhiteMoves(currentState);

            SEXP += expandedNodes.size(); // increment number of states explored

            // remove the moves that have been selected before
            expandedNodes = expandedNodes.stream()
                    .filter(move -> !selectedWMoves.contains(move))
                    .collect(Collectors.toList());

            // select a move from the expanded moves
            List<List<Integer>> wMove = makeWMove(expandedNodes);
            selectedWMoves.add(wMove);

            if (isGoalState(wMove)) { // selected move leads to checkmate position
                status = 1;
                currentState = wMove;
            }
            else {
                currentState = bMove(wMove); // apply black move on the selected move
                if (currentState.isEmpty()) {
                    status = 2; // stalemate
                    currentState = wMove;
                }
            }

            solution.add(currentState);
        }

        result.put(status, solution);

        return result;
    }

    public static List<List<Integer>> getPossibleMovesForKing(List<Integer> currentPosition) {
        List<List<Integer>> possibleMoves = new ArrayList<>();

        int x = currentPosition.get(0);
        int y = currentPosition.get(1);

        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 1 && j >= 1 && i <= 8 && j <= 8 && (i != x || j != y)) {
                    possibleMoves.add(Arrays.asList(i, j));
                }
            }
        }

        return possibleMoves;
    }

    public static List<List<Integer>> getPossibleMovesForRook(List<Integer> currentPosition) {
        List<List<Integer>> possibleMoves = new ArrayList<>();

        int x = currentPosition.get(0);
        int y = currentPosition.get(1);

        for (int i = 1; i <= 8; i++) {
            if (i != x) {
                possibleMoves.add(Arrays.asList(i, y));
            }
        }

        for (int j = 1; j <= 8; j++) {
            if (j != y) {
                possibleMoves.add(Arrays.asList(x, j));
            }
        }

        return possibleMoves;
    }

    public static List<List<Integer>> getValidMovesForBK(List<List<Integer>> currentState) {
        // keep only safe moves for black king that are not in the reach of white king nor white rook
        return getPossibleMovesForKing(currentState.get(0)).stream()
                .filter(move -> isSafeForBK(move, currentState.get(1), currentState.get(2)))
                .collect(Collectors.toList());
    }

    public static boolean isSafeForBK(List<Integer> move_BK, List<Integer> pos_WK, List<Integer> pos_WR) {

        for (int i = 0; i < 2; i++) {
            int j = (i + 1) % 2;

            if (move_BK.equals(pos_WK) || move_BK.equals(pos_WR))
                return true;

            // check if the move is in reach of white rook
            if (move_BK.get(i) == pos_WR.get(i)) {
                if (move_BK.get(i) != pos_WK.get(i))
                    return false;
                else if (!(move_BK.get(j) < pos_WK.get(j) && pos_WK.get(j) < pos_WR.get(j))
                        && !(move_BK.get(j) > pos_WK.get(j) && pos_WK.get(j) > pos_WR.get(j)))
                    return false;
            }
        }

        // check if the move is in reach of white king
        return !(getPossibleMovesForKing(pos_WK).contains(move_BK));

    }

    public static double calculateSafetyIndexBK(List<Integer> pos_BK) {

        return Math.abs(pos_BK.get(0) - 5) * 5 + Math.abs(pos_BK.get(1) - 5) * 3 + (pos_BK.get(0) + pos_BK.get(1)) * 0.1;
    }

    // move the black king and return obtained state
    public static List<List<Integer>> bMove(List<List<Integer>> currentState) {

        List<List<Integer>> moveBK = new ArrayList<>();
        List<List<Integer>> validMoves = getValidMovesForBK(currentState);

        if (!validMoves.isEmpty()) {
            HashMap<Double, List<Integer>> movesIndex = new HashMap<>();

            for (List<Integer> move : validMoves) {
                if (move.equals(currentState.get(1)) || move.equals(currentState.get(2)))
                    return Arrays.asList(move, currentState.get(1), currentState.get(2));
                else
                    movesIndex.put(calculateSafetyIndexBK(move), move);
            }

            moveBK = Arrays.asList(movesIndex.get(Collections.min(movesIndex.keySet())), currentState.get(1), currentState.get(2));
        }

        return moveBK;
    }

    public static List<List<Integer>> getValidMovesForWK(List<List<Integer>> currentState) {
        // return moves that are not in the reach of black king
        return getPossibleMovesForKing(currentState.get(1)).stream()
                .filter(move -> !getPossibleMovesForKing(currentState.get(0)).contains(move) && !move.equals(currentState.get(2)))
                .collect(Collectors.toList());
    }

    public static List<List<Integer>> getValidMovesForWR(List<List<Integer>> currentState) {

        List<Integer> posWR = currentState.get(2);
        List<Integer> posWK = currentState.get(1);
        List<Integer> posBK = currentState.get(0);

        List<List<Integer>> validMoves_WR = getPossibleMovesForRook(posWR);

        for (int i = 0; i <= 1; i++) {
            int j = (i + 1) % 2;
            if (posWR.get(i) == posWK.get(i)) {
                if (posWR.get(j) < posWK.get(j)) {
                    validMoves_WR = validMoves_WR.stream().filter(move -> move.get(j) < posWK.get(j)).collect(Collectors.toList());
                } else if (posWR.get(j) > posWK.get(j)) {
                    validMoves_WR = validMoves_WR.stream().filter(move -> move.get(j) > posWK.get(j)).collect(Collectors.toList());
                }
            }
        }

        return validMoves_WR.stream()
                .filter(move -> !getPossibleMovesForKing(posBK).contains(move))
                .collect(Collectors.toList());
    }

    // generate all possible white moves
    public static List<List<List<Integer>>> generateValidWhiteMoves(List<List<Integer>> currentState) {

        List<List<List<Integer>>> validWhiteMoves = new ArrayList<>();

        for (List<Integer> move : getValidMovesForWK(currentState)) {
            validWhiteMoves.add(Arrays.asList(currentState.get(0), move, currentState.get(2)));
        }

        for (List<Integer> move : getValidMovesForWR(currentState)) {
            validWhiteMoves.add(Arrays.asList(currentState.get(0), currentState.get(1), move));
        }

        return validWhiteMoves;
    }

    // evaluate white move based on heuristics
    public static int evaluateWMove(List<List<Integer>> wMove) {

        int eval = 0;

        List<Integer> BK = wMove.get(0);
        List<Integer> WK = wMove.get(1);
        List<Integer> WR = wMove.get(2);

        List<List<Integer>> BK_validMoves = getValidMovesForBK(wMove);

        if (BK_validMoves.isEmpty()) { // avoid stalemate
            return -400;
        }

        if (BK_validMoves.contains(WK)) { // avoid capture of white king
            return -500;
        }

        if (BK_validMoves.contains(WR)) { // avoid capture of white rook
            return -300;
        }

        // try to minimize distance of black king from the edge of the board
        List<Integer> BK_next = bMove(wMove).get(0);
        int distance_BK_edge = Math.abs(BK_next.get(1) - edge);
        eval += 40 - distance_BK_edge * 8;

        // try to move the white king opposite to the black king
        // keeping difference in rows = 2 and in same column
        int distance_BK_WK_row = Math.abs(BK.get(1) - WK.get(1));
        eval += 35 - Math.abs(distance_BK_WK_row - 2) * 5;

        int distance_BK_WK_col = Math.abs(BK.get(0) - WK.get(0));
        eval += 35 - distance_BK_WK_col * 5;

        // try to move white rook to attack position
        int distance_BK_WR_row = Math.abs(BK.get(1) - WR.get(1));
        eval += 10 - distance_BK_WR_row * 2;

        // keep the white rook safe distance from black king
        int distance_BK_WR_col = Math.abs(BK.get(0) - WR.get(0));
        eval += 5 - Math.abs(distance_BK_WR_col - 5) * 2;

        return eval;
    }

    // select white move from possible moves based on evaluation
    public static List<List<Integer>> makeWMove(List<List<List<Integer>>> expandedNodes) {

        List<List<Integer>> wMove = new ArrayList<>();
        Map<List<List<Integer>>, Integer> movesEvaluation = new HashMap<>();

        for (List<List<Integer>> node : expandedNodes) {
            if (isGoalState(node)) {
                return node;
            } else {
                movesEvaluation.put(node, evaluateWMove(node));
            }
        }

        // select the move with the maximum evaluation
        int maxEval = Collections.max(movesEvaluation.values());
        for (Map.Entry<List<List<Integer>>, Integer> entry : movesEvaluation.entrySet()) {
            if (entry.getValue() == maxEval) {
                wMove = entry.getKey();
                break;
            }
        }

        return wMove;
    }

    public static boolean isGoalState(List<List<Integer>> currentState) {

        // back king has nowhere to move and it is being attacked by rook
        return getValidMovesForBK(currentState).isEmpty() &&
                getValidMovesForWR(currentState).contains(currentState.get(0));
    }

    public static int getEdgePosition(List<Integer> posBK, List<Integer> posWK) {

        // determine the edge (1: top or 8: bottom) of the board where the black king can be driven to
        return (posBK.get(1) <= posWK.get(1)) ? 1 : 8;
    }

    public static int getSEXP() {
        return SEXP;
    }
}
