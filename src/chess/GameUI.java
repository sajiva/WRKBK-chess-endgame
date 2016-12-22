/* COSC 6368 Fall 2016 Project 1 */
/* Heuristic Search for the White Rook and King versus the Black King Chess Endgame */
/* Sajiva Pradhan 1007766 */

package chess;

import java.io.*;
import java.util.*;

public class GameUI {

    public static Map<String, List<List<Integer>>> parseInput(String fileName) throws FileNotFoundException {

        Map<String, List<List<Integer>>> startPositions = new LinkedHashMap<>();
        Scanner sc = new Scanner(new File(fileName));
        int numberOfGames = sc.nextInt();

        for (int n = 0; n < numberOfGames; n++) {
            String testCase = sc.next();
            sc.nextLine();
            List<Integer> posBK = new ArrayList<>();
            List<Integer> posWK = new ArrayList<>();
            List<Integer> posRK = new ArrayList<>();

            for (int y = 1; y <= 8; y++) {
                List<String> line = Arrays.asList(sc.nextLine().split(" "));
                if (line.contains("BK")) {
                    posBK = Arrays.asList(line.indexOf("BK") + 1, y);
                }
                if (line.contains("WK")) {
                    posWK = Arrays.asList(line.indexOf("WK") + 1, y);
                }
                if (line.contains("WR")) {
                    posRK = Arrays.asList(line.indexOf("WR") + 1, y);
                }
            }

            startPositions.put(testCase, Arrays.asList(posBK, posWK, posRK));

            if (sc.hasNextLine())
                sc.nextLine();
        }

        sc.close();

        return startPositions;
    }

    public static String printState(List<List<Integer>> state) {

        StringBuilder output = new StringBuilder();
        output.append("\n");

        for (int y = 1; y <= 8; y++) {
            for (int x = 1; x <= 8 ; x++) {
                if (x == state.get(0).get(0) && y == state.get(0).get(1)) {
                    output.append("BK ");
                } else if (x == state.get(1).get(0) && y == state.get(1).get(1)) {
                    output.append("WK ");
                } else if (x == state.get(2).get(0) && y == state.get(2).get(1)) {
                    output.append("WR ");
                } else {
                    output.append("-- ");
                }
            }
            output.append("\n");
        }

        return output.toString();
    }

    public static void writeOutput(FileWriter writer, String toWrite) throws IOException {
        writer.write(toWrite);
        System.out.print(toWrite);
    }

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Required input filename as argument!");
            return;
        }

        try {
            // parse input file and get the start positions for all test cases
            Map<String, List<List<Integer>>> testCases = parseInput(args[0]);

            FileWriter writer = new FileWriter("output.txt");
            writeOutput(writer, String.valueOf(testCases.size()) + "\n");

            for (Map.Entry<String, List<List<Integer>>> entry : testCases.entrySet()) {

                // solve each test case and get the result
                Map<Integer, List<List<List<Integer>>>> result = EndGame.solve(entry.getValue());
                Map.Entry<Integer, List<List<List<Integer>>>> solution = result.entrySet().iterator().next();

                if (solution.getKey() == 1) {
                    writeOutput(writer, "\n" + entry.getKey() + " " + solution.getValue().size() + " " + EndGame.getSEXP() + "\n");
                    writeOutput(writer, printState(entry.getValue())); // print starting position

                    for (List<List<Integer>> state : solution.getValue()) {
                        writeOutput(writer, printState(state)); // print each state
                    }
                } else {
                    writeOutput(writer, "\n" + entry.getKey() + " NA" + "\n");
                }
            }

            writer.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Input file not found!");
        } catch (InputMismatchException e) {
            System.out.println("Error in input format!" + e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("Error in input!" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error writing to the output file!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

