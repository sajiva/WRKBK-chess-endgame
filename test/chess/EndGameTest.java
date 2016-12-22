package chess;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class EndGameTest {

    @Test
    public void canaryTest() {
        assertTrue(true);
    }

    @Test
    public void solveForTr01() {
        List<List<List<Integer>>> solution = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(2, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(3, 1),
                        Arrays.asList(3, 3),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(3, 1),
                        Arrays.asList(3, 3),
                        Arrays.asList(8, 1)
                )
        );

        Map<Integer, List<List<List<Integer>>>> result = new HashMap<>();
        result.put(1, solution);

        assertEquals(result, EndGame.solve(Arrays.asList(
                Arrays.asList(1, 1),
                Arrays.asList(5, 3),
                Arrays.asList(8, 2)
        )));
    }

    @Test
    public void solveForTr02() {
        List<List<List<Integer>>> solution = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(6, 1),
                        Arrays.asList(2, 3),
                        Arrays.asList(2, 2)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(3, 3),
                        Arrays.asList(2, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(2, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(2, 1)
                )
        );

        Map<Integer, List<List<List<Integer>>>> result = new HashMap<>();
        result.put(1, solution);

        assertEquals(result, EndGame.solve(Arrays.asList(
                Arrays.asList(7, 1),
                Arrays.asList(2, 3),
                Arrays.asList(8, 2)
        )));
    }

    @Test
    public void solveForTr03() {
        List<List<List<Integer>>> solution = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(1, 2)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(1, 1)
                )
        );

        Map<Integer, List<List<List<Integer>>>> result = new HashMap<>();
        result.put(1, solution);

        assertEquals(result, EndGame.solve(Arrays.asList(
                Arrays.asList(6, 1),
                Arrays.asList(5, 3),
                Arrays.asList(8, 2)
        )));
    }

    @Test
    public void solveForTr04() {
        List<List<List<Integer>>> solution = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(2, 2),
                        Arrays.asList(5, 3),
                        Arrays.asList(6, 4)
                ),
                Arrays.asList(
                        Arrays.asList(3, 2),
                        Arrays.asList(4, 4),
                        Arrays.asList(6, 4)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(4, 4),
                        Arrays.asList(6, 2)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(6, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(1, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(1, 1)
                )
        );

        Map<Integer, List<List<List<Integer>>>> result = new HashMap<>();
        result.put(1, solution);

        assertEquals(result, EndGame.solve(Arrays.asList(
                Arrays.asList(1, 1),
                Arrays.asList(5, 3),
                Arrays.asList(2, 4)
        )));
    }

    @Test
    public void solveForTr05() {
        List<List<List<Integer>>> solution = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(7, 4),
                        Arrays.asList(5, 3),
                        Arrays.asList(2, 2)
                ),
                Arrays.asList(
                        Arrays.asList(7, 3),
                        Arrays.asList(5, 3),
                        Arrays.asList(2, 5)
                ),
                Arrays.asList(
                        Arrays.asList(7, 2),
                        Arrays.asList(5, 3),
                        Arrays.asList(2, 4)
                ),
                Arrays.asList(
                        Arrays.asList(6, 2),
                        Arrays.asList(6, 4),
                        Arrays.asList(2, 4)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(6, 4),
                        Arrays.asList(2, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(2, 2)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(2, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(1, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(1, 1)
                )
        );

        Map<Integer, List<List<List<Integer>>>> result = new HashMap<>();
        result.put(1, solution);

        assertEquals(result, EndGame.solve(Arrays.asList(
                Arrays.asList(7, 3),
                Arrays.asList(5, 3),
                Arrays.asList(8, 2)
        )));
    }

    @Test
    public void solveForTr06() {
        List<List<List<Integer>>> solution = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(4, 2),
                        Arrays.asList(5, 4),
                        Arrays.asList(8, 3)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(5, 4),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(1, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(1, 1)
                )
        );

        Map<Integer, List<List<List<Integer>>>> result = new HashMap<>();
        result.put(1, solution);

        assertEquals(result, EndGame.solve(Arrays.asList(
                Arrays.asList(3, 2),
                Arrays.asList(5, 4),
                Arrays.asList(4, 3)
        )));
    }

    @Test
    public void solveForTr07() {
        List<List<List<Integer>>> solution = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(5, 4),
                        Arrays.asList(4, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(5, 4),
                        Arrays.asList(1, 2)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(1, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(1, 2)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(8, 1)
                )
        );

        Map<Integer, List<List<List<Integer>>>> result = new HashMap<>();
        result.put(1, solution);

        assertEquals(result, EndGame.solve(Arrays.asList(
                Arrays.asList(6, 2),
                Arrays.asList(5, 4),
                Arrays.asList(4, 3)
        )));
    }

    @Test
    public void solveForTr08() {
        List<List<List<Integer>>> solution = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(4, 2),
                        Arrays.asList(3, 4),
                        Arrays.asList(8, 3)
                ),
                Arrays.asList(
                        Arrays.asList(5, 2),
                        Arrays.asList(4, 4),
                        Arrays.asList(8, 3)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(5, 4),
                        Arrays.asList(8, 3)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(8, 3)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(8, 3)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(8, 1)
                )
        );

        Map<Integer, List<List<List<Integer>>>> result = new HashMap<>();
        result.put(1, solution);

        assertEquals(result, EndGame.solve(Arrays.asList(
                Arrays.asList(3, 2),
                Arrays.asList(3, 4),
                Arrays.asList(4, 3)
        )));
    }

    @Test
    public void solveForTr09() {
        List<List<List<Integer>>> solution = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(4, 2),
                        Arrays.asList(3, 5),
                        Arrays.asList(5, 3)
                ),
                Arrays.asList(
                        Arrays.asList(5, 2),
                        Arrays.asList(3, 5),
                        Arrays.asList(8, 3)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(4, 4),
                        Arrays.asList(8, 3)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(8, 3)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(8, 3)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(8, 1)
                )
        );

        Map<Integer, List<List<List<Integer>>>> result = new HashMap<>();
        result.put(1, solution);

        assertEquals(result, EndGame.solve(Arrays.asList(
                Arrays.asList(3, 3),
                Arrays.asList(3, 5),
                Arrays.asList(5, 5)
        )));
    }

    @Test
    public void solveForTr10() {
        List<List<List<Integer>>> solution = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(2, 1),
                        Arrays.asList(4, 5),
                        Arrays.asList(3, 2)
                ),
                Arrays.asList(
                        Arrays.asList(3, 1),
                        Arrays.asList(4, 5),
                        Arrays.asList(7, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(3, 4),
                        Arrays.asList(7, 2)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(7, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(7, 2)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(8, 1)
                )
        );

        Map<Integer, List<List<List<Integer>>>> result = new HashMap<>();
        result.put(1, solution);

        assertEquals(result, EndGame.solve(Arrays.asList(
                Arrays.asList(1, 1),
                Arrays.asList(4, 5),
                Arrays.asList(3, 8)
        )));
    }

    @Test
    public void solveForTr11() {
        List<List<List<Integer>>> solution = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(4, 3),
                        Arrays.asList(3, 5),
                        Arrays.asList(8, 6)
                ),
                Arrays.asList(
                        Arrays.asList(5, 3),
                        Arrays.asList(4, 5),
                        Arrays.asList(8, 6)
                ),
                Arrays.asList(
                        Arrays.asList(5, 2),
                        Arrays.asList(5, 5),
                        Arrays.asList(8, 6)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(5, 5),
                        Arrays.asList(8, 3)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(5, 5),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(4, 4),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(1, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(1, 1)
                )
        );

        Map<Integer, List<List<List<Integer>>>> result = new HashMap<>();
        result.put(1, solution);

        assertEquals(result, EndGame.solve(Arrays.asList(
                Arrays.asList(3, 3),
                Arrays.asList(3, 5),
                Arrays.asList(3, 6)
        )));
    }

    @Test
    public void solveForTr12() {
        List<List<List<Integer>>> solution = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(5, 1),
                        Arrays.asList(2, 1),
                        Arrays.asList(1, 2)
                ),
                Arrays.asList(
                        Arrays.asList(6, 1),
                        Arrays.asList(3, 1),
                        Arrays.asList(1, 2)
                ),
                Arrays.asList(
                        Arrays.asList(7, 1),
                        Arrays.asList(4, 1),
                        Arrays.asList(1, 2)
                ),
                Arrays.asList(
                        Arrays.asList(8, 1),
                        Arrays.asList(5, 1),
                        Arrays.asList(1, 2)
                ),
                Arrays.asList(
                        Arrays.asList(7, 1),
                        Arrays.asList(5, 1),
                        Arrays.asList(3, 2)
                ),
                Arrays.asList(
                        Arrays.asList(8, 1),
                        Arrays.asList(5, 1),
                        Arrays.asList(2, 2)
                ),
                Arrays.asList(
                        Arrays.asList(8, 2),
                        Arrays.asList(6, 2),
                        Arrays.asList(2, 2)
                ),
                Arrays.asList(
                        Arrays.asList(8, 1),
                        Arrays.asList(6, 2),
                        Arrays.asList(2, 3)
                ),
                Arrays.asList(
                        Arrays.asList(8, 1),
                        Arrays.asList(6, 2),
                        Arrays.asList(8, 3)
                )
        );

        Map<Integer, List<List<List<Integer>>>> result = new HashMap<>();
        result.put(1, solution);

        assertEquals(result, EndGame.solve(Arrays.asList(
                Arrays.asList(4, 1),
                Arrays.asList(2, 1),
                Arrays.asList(1, 1)
        )));
    }

    @Test
    public void solveForTr13() {
        List<List<List<Integer>>> solution = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(3, 7),
                        Arrays.asList(3, 4),
                        Arrays.asList(4, 1)
                ),
                Arrays.asList(
                        Arrays.asList(3, 8),
                        Arrays.asList(3, 5),
                        Arrays.asList(4, 1)
                ),
                Arrays.asList(
                        Arrays.asList(2, 8),
                        Arrays.asList(3, 6),
                        Arrays.asList(4, 1)
                ),
                Arrays.asList(
                        Arrays.asList(3, 8),
                        Arrays.asList(3, 6),
                        Arrays.asList(4, 7)
                ),
                Arrays.asList(
                        Arrays.asList(4, 8),
                        Arrays.asList(3, 6),
                        Arrays.asList(8, 7)
                ),
                Arrays.asList(
                        Arrays.asList(5, 8),
                        Arrays.asList(4, 6),
                        Arrays.asList(8, 7)
                ),
                Arrays.asList(
                        Arrays.asList(4, 8),
                        Arrays.asList(5, 6),
                        Arrays.asList(8, 7)
                ),
                Arrays.asList(
                        Arrays.asList(5, 8),
                        Arrays.asList(4, 5),
                        Arrays.asList(8, 7)
                ),
                Arrays.asList(
                        Arrays.asList(4, 8),
                        Arrays.asList(4, 6),
                        Arrays.asList(8, 7)
                ),
                Arrays.asList(
                        Arrays.asList(4, 8),
                        Arrays.asList(4, 6),
                        Arrays.asList(8, 8)
                )
        );

        Map<Integer, List<List<List<Integer>>>> result = new HashMap<>();
        result.put(1, solution);

        assertEquals(result, EndGame.solve(Arrays.asList(
                Arrays.asList(3, 6),
                Arrays.asList(4, 3),
                Arrays.asList(4, 1)
        )));
    }

    @Test
    public void testPossibleMovesForKing1() {
        List<List<Integer>> possibleMoves = Arrays.asList(
                Arrays.asList(2, 4),
                Arrays.asList(2, 5),
                Arrays.asList(2, 6),
                Arrays.asList(3, 4),
                Arrays.asList(3, 6),
                Arrays.asList(4, 4),
                Arrays.asList(4, 5),
                Arrays.asList(4, 6)
        );

        assertEquals(possibleMoves, EndGame.getPossibleMovesForKing(Arrays.asList(3, 5)));
    }



    @Test
    public void testPossibleMovesForKing2() {
        List<List<Integer>> possibleMoves = Arrays.asList(
                Arrays.asList(1, 6),
                Arrays.asList(1, 8),
                Arrays.asList(2, 6),
                Arrays.asList(2, 7),
                Arrays.asList(2, 8)
        );

        assertEquals(possibleMoves, EndGame.getPossibleMovesForKing(Arrays.asList(1, 7)));
    }

    @Test
    public void testPossibleMovesForKing3() {
        List<List<Integer>> possibleMoves = Arrays.asList(
                Arrays.asList(7, 1),
                Arrays.asList(7, 2),
                Arrays.asList(8, 2)
        );

        assertEquals(possibleMoves, EndGame.getPossibleMovesForKing(Arrays.asList(8, 1)));
    }

    @Test
    public void testPossibleMovesForKing4() {
        List<List<Integer>> possibleMoves = Arrays.asList(
                Arrays.asList(3, 7),
                Arrays.asList(3, 8),
                Arrays.asList(4, 7),
                Arrays.asList(5, 7),
                Arrays.asList(5, 8)
        );

        assertEquals(possibleMoves, EndGame.getPossibleMovesForKing(Arrays.asList(4, 8)));
    }

    @Test
    public void testPossibleMovesForRook1() {
        List<List<Integer>> possibleMoves = Arrays.asList(
                Arrays.asList(1, 5),
                Arrays.asList(2, 5),
                Arrays.asList(3, 5),
                Arrays.asList(5, 5),
                Arrays.asList(6, 5),
                Arrays.asList(7, 5),
                Arrays.asList(8, 5),
                Arrays.asList(4, 1),
                Arrays.asList(4, 2),
                Arrays.asList(4, 3),
                Arrays.asList(4, 4),
                Arrays.asList(4, 6),
                Arrays.asList(4, 7),
                Arrays.asList(4, 8)
        );

        assertEquals(possibleMoves, EndGame.getPossibleMovesForRook(Arrays.asList(4, 5)));
    }

    @Test
    public void testPossibleMovesForRook2() {
        List<List<Integer>> possibleMoves = Arrays.asList(
                Arrays.asList(2, 8),
                Arrays.asList(3, 8),
                Arrays.asList(4, 8),
                Arrays.asList(5, 8),
                Arrays.asList(6, 8),
                Arrays.asList(7, 8),
                Arrays.asList(8, 8),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2),
                Arrays.asList(1, 3),
                Arrays.asList(1, 4),
                Arrays.asList(1, 5),
                Arrays.asList(1, 6),
                Arrays.asList(1, 7)
        );

        assertEquals(possibleMoves, EndGame.getPossibleMovesForRook(Arrays.asList(1, 8)));
    }

    @Test
    public void testPossibleMovesForRook3() {
        List<List<Integer>> possibleMoves = Arrays.asList(
                Arrays.asList(1, 1),
                Arrays.asList(2, 1),
                Arrays.asList(3, 1),
                Arrays.asList(4, 1),
                Arrays.asList(5, 1),
                Arrays.asList(6, 1),
                Arrays.asList(7, 1),
                Arrays.asList(8, 2),
                Arrays.asList(8, 3),
                Arrays.asList(8, 4),
                Arrays.asList(8, 5),
                Arrays.asList(8, 6),
                Arrays.asList(8, 7),
                Arrays.asList(8, 8)
        );

        assertEquals(possibleMoves, EndGame.getPossibleMovesForRook(Arrays.asList(8, 1)));
    }

    @Test
    public void testValidMovesForBK1() {
        List<List<Integer>> validMoves = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(2, 2)
        );

        assertEquals(validMoves, EndGame.getValidMovesForBK(Arrays.asList(
                Arrays.asList(1, 1),
                Arrays.asList(5, 3),
                Arrays.asList(8, 1)
        )));

    }

    @Test
    public void testValidMovesForBK2() {
        List<List<Integer>> validMoves = Arrays.asList(
                Arrays.asList(2, 2),
                Arrays.asList(2, 3),
                Arrays.asList(3, 2)
        );

        assertEquals(validMoves, EndGame.getValidMovesForBK(Arrays.asList(
                Arrays.asList(3, 3),
                Arrays.asList(3, 5),
                Arrays.asList(4, 8)
        )));

    }

    @Test
    public void testIsMoveSafe1() {

        assertTrue(EndGame.isSafeForBK(Arrays.asList(3, 3), Arrays.asList(5, 6), Arrays.asList(6, 4)));
    }

    @Test
    public void testIsMoveSafe2() {

        assertFalse(EndGame.isSafeForBK(Arrays.asList(3, 3), Arrays.asList(5, 6), Arrays.asList(6, 3)));
    }

    @Test
    public void testIsMoveSafe3() {

        assertFalse(EndGame.isSafeForBK(Arrays.asList(3, 3), Arrays.asList(3, 8), Arrays.asList(3, 5)));
    }

    @Test
    public void testIsMoveSafe4() {

        assertTrue(EndGame.isSafeForBK(Arrays.asList(3, 3), Arrays.asList(3, 5), Arrays.asList(3, 8)));
    }

    @Test
    public void testIsMoveSafe5() {

        assertTrue(EndGame.isSafeForBK(Arrays.asList(8, 5), Arrays.asList(5, 5), Arrays.asList(1, 5)));
    }

    @Test
    public void testIsMoveSafe6() {

        assertFalse(EndGame.isSafeForBK(Arrays.asList(8, 5), Arrays.asList(7, 5), Arrays.asList(1, 5)));
    }

    @Test
    public void testIsMoveSafe7() {

        assertFalse(EndGame.isSafeForBK(Arrays.asList(4, 5), Arrays.asList(5, 6), Arrays.asList(1, 4)));
    }

    @Test
    public void testGetValidMovesForWK1() {

        List<List<Integer>> validMoves = Arrays.asList(
                Arrays.asList(4, 2),
                Arrays.asList(4, 3),
                Arrays.asList(4, 4),
                Arrays.asList(5, 2),
                Arrays.asList(5, 4),
                Arrays.asList(6, 2),
                Arrays.asList(6, 3),
                Arrays.asList(6, 4)
        );

        assertEquals(validMoves, EndGame.getValidMovesForWK(Arrays.asList(
                Arrays.asList(1, 1),
                Arrays.asList(5, 3),
                Arrays.asList(8, 2)
        )));
    }

    @Test
    public void testGetValidMovesForWK2() {

        List<List<Integer>> validMoves = Arrays.asList(
                Arrays.asList(4, 4),
                Arrays.asList(5, 2),
                Arrays.asList(5, 4),
                Arrays.asList(6, 2),
                Arrays.asList(6, 3)
        );

        assertEquals(validMoves, EndGame.getValidMovesForWK(Arrays.asList(
                Arrays.asList(3, 2),
                Arrays.asList(5, 3),
                Arrays.asList(6, 4)
        )));
    }

    @Test
    public void testGetValidMovesForWR1() {

        List<List<Integer>> validMoves = Arrays.asList(
                Arrays.asList(1, 5),
                Arrays.asList(2, 5),
                Arrays.asList(3, 5),
                Arrays.asList(5, 5),
                Arrays.asList(6, 5),
                Arrays.asList(7, 5),
                Arrays.asList(8, 5),
                Arrays.asList(4, 1),
                Arrays.asList(4, 2),
                Arrays.asList(4, 3),
                Arrays.asList(4, 4),
                Arrays.asList(4, 6),
                Arrays.asList(4, 7),
                Arrays.asList(4, 8)
        );

        assertEquals(validMoves, EndGame.getValidMovesForWR(Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(5, 3),
                Arrays.asList(4, 5)
        )));
    }

    @Test
    public void testGetValidMovesForWR2() {

        List<List<Integer>> validMoves = Arrays.asList(
                Arrays.asList(1, 5),
                Arrays.asList(2, 5),
                Arrays.asList(3, 5),
                Arrays.asList(5, 5),
                Arrays.asList(6, 5),
                Arrays.asList(7, 5),
                Arrays.asList(8, 5),
                Arrays.asList(4, 1),
                Arrays.asList(4, 2),
                Arrays.asList(4, 3),
                Arrays.asList(4, 4),
                Arrays.asList(4, 6)
        );

        assertEquals(validMoves, EndGame.getValidMovesForWR(Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(4, 7),
                Arrays.asList(4, 5)
        )));
    }

    @Test
    public void testGetValidMovesForWR3() {

        List<List<Integer>> validMoves = Arrays.asList(
                Arrays.asList(4, 5),
                Arrays.asList(5, 5),
                Arrays.asList(7, 5),
                Arrays.asList(8, 5),
                Arrays.asList(6, 1),
                Arrays.asList(6, 2),
                Arrays.asList(6, 3),
                Arrays.asList(6, 4),
                Arrays.asList(6, 6),
                Arrays.asList(6, 7),
                Arrays.asList(6, 8)
        );

        assertEquals(validMoves, EndGame.getValidMovesForWR(Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 5),
                Arrays.asList(6, 5)
        )));
    }

    @Test
    public void testGetValidMovesForWR4() {

        List<List<Integer>> validMoves = Arrays.asList(
                Arrays.asList(1, 5),
                Arrays.asList(2, 5),
                Arrays.asList(3, 5),
                Arrays.asList(5, 5),
                Arrays.asList(6, 5),
                Arrays.asList(7, 5),
                Arrays.asList(8, 5),
                Arrays.asList(4, 1),
                Arrays.asList(4, 6),
                Arrays.asList(4, 7),
                Arrays.asList(4, 8)
        );

        assertEquals(validMoves, EndGame.getValidMovesForWR(Arrays.asList(
                Arrays.asList(3, 3),
                Arrays.asList(5, 3),
                Arrays.asList(4, 5)
        )));
    }

    @Test
    public void testCalculateSafetyIndexBK1() {

        assertEquals(32.2, EndGame.calculateSafetyIndexBK(Arrays.asList(4, 1)), 0.0001);
    }

    @Test
    public void testCalculateSafetyIndexBK2() {

        assertEquals(5.9, EndGame.calculateSafetyIndexBK(Arrays.asList(4, 5)), 0.0001);
    }

//    @Test
//    public void testSelectBMove1() {
//
//        List<Integer> bMove = Arrays.asList(4, 3);
//
//        assertEquals(bMove, EndGame.selectBMove(Arrays.asList(
//                Arrays.asList(2, 1),
//                Arrays.asList(2, 2),
//                Arrays.asList(2, 3),
//                Arrays.asList(3, 1),
//                Arrays.asList(3, 3),
//                Arrays.asList(4, 1),
//                Arrays.asList(4, 2),
//                Arrays.asList(4, 3)
//        )));
//    }
//
//    @Test
//    public void testSelectBMove2() {
//
//        List<Integer> bMove = Arrays.asList(5, 4);
//
//        assertEquals(bMove, EndGame.selectBMove(Arrays.asList(
//                Arrays.asList(4, 4),
//                Arrays.asList(4, 5),
//                Arrays.asList(4, 6),
//                Arrays.asList(5, 4),
//                Arrays.asList(5, 6),
//                Arrays.asList(6, 4),
//                Arrays.asList(6, 5),
//                Arrays.asList(6, 6)
//        )));
//    }

    @Test
    public void testBMove1() {

        List<List<Integer>> moveBK = Arrays.asList(
                Arrays.asList(2, 1),
                Arrays.asList(5, 3),
                Arrays.asList(8, 2)
        );

        assertEquals(moveBK, EndGame.bMove(Arrays.asList(
                Arrays.asList(1, 1),
                Arrays.asList(5, 3),
                Arrays.asList(8, 2)

        )));
    }

    @Test
    public void testBMove2() {

        List<List<Integer>> moveBK = Arrays.asList(
                Arrays.asList(4, 3),
                Arrays.asList(3, 5),
                Arrays.asList(5, 5)
        );

        assertEquals(moveBK, EndGame.bMove(Arrays.asList(
                Arrays.asList(3, 3),
                Arrays.asList(3, 5),
                Arrays.asList(5, 5)

        )));
    }

//    @Test
//    public void testBMove3() {
//
//        List<List<Integer>> moveBK = Arrays.asList(
//                Arrays.asList(4, 3),
//                Arrays.asList(3, 5),
//                Arrays.asList(5, 5)
//        );
//
//        assertEquals(moveBK, EndGame.bMove(Arrays.asList(
//                Arrays.asList(3, 1),
//                Arrays.asList(3, 3),
//                Arrays.asList(8, 1)
//
//        )));
//    }

    @Test
    public void testGenerateValidWhiteMoves() {
        List<List<List<Integer>>> validMoves = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(4, 2),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(4, 3),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(4, 4),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(5, 2),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(5, 4),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(6, 2),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(6, 3),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(6, 4),
                        Arrays.asList(8, 2)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(3, 2)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(4, 2)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(5, 2)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(6, 2)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(7, 2)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(8, 1)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(8, 3)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(8, 4)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(8, 5)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(8, 6)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(8, 7)
                ),
                Arrays.asList(
                        Arrays.asList(1, 1),
                        Arrays.asList(5, 3),
                        Arrays.asList(8, 8)
                )
        );

        assertEquals(validMoves, EndGame.generateValidWhiteMoves(Arrays.asList(
                Arrays.asList(1, 1),
                Arrays.asList(5, 3),
                Arrays.asList(8, 2)
        )));

    }

    @Test
    public void testIsGoalState1() {

        assertTrue(EndGame.isGoalState(Arrays.asList(Arrays.asList(3, 1), Arrays.asList(3, 3), Arrays.asList(8, 1))));
    }

    @Test
    public void testIsGoalState2() {

        assertFalse(EndGame.isGoalState(Arrays.asList(Arrays.asList(3, 1), Arrays.asList(3, 3), Arrays.asList(8, 4))));
    }


}