package org.example.exercises;

import org.example.Exercise;
import org.example.output.ExerciseOutput;
import org.example.reports.Report;
import org.example.utils.ArrayParser;
import org.example.interfaces.InputReader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Day2 extends Exercise {
    public ExerciseOutput<Long, Long> solve(InputReader inputReader) throws Exception {
        List<Report> reports = inputReader.getInputStream().map(Report::from).toList();

        long part1 = reports.stream().filter(Report::isSafe).count();
//        long part2 = reports.stream().filter(Report::isSafeWithTolerance).count();

        System.out.println("Total Number of Good Reports: " + String.valueOf(part1));
        return new ExerciseOutput<>(part1, 0L);
    }

/*
    public static void solvePart1(int[][] array) {
        int numberOfGoodReports = totalNumberOfGoodReports(getGoodReports(array));

        System.out.println("Total Number of Good Reports: " + String.valueOf(numberOfGoodReports));
    }

    public static void solvePart2(int[][] array) {
        int numberOfGoodDampenedReports = totalNumberOfGoodReports(getGoodReportsWith1LevelDampening(array));

        System.out.println("Total number of good dampened reports: " + String.valueOf(numberOfGoodDampenedReports));
    }

    private static int[][] getGoodReports(int[][] array) {
        int[][] goodReports = new int[array.length][];

        for(int i = 0; i < array.length; i++) {
            boolean increasingOrDecreasingCheck = ArrayParser.increasingOrDecreasingCheck(array[i]);
            boolean differCheck = ArrayParser.differBy1AndAtMost3Check(array[i]);
            if(increasingOrDecreasingCheck && differCheck) {
                goodReports[i] = array[i];
            }
        }

        return goodReports;
    }

    private static int[][] getGoodReportsWith1LevelDampening(int[][] array) {
        int[][] goodReports = new int[array.length][];

        for(int i = 0; i < array.length; i++) {
            toleranceUsed = false;
            if(levelsCheckWith1Tolerance(array[i])) {
                goodReports[i] = array[i];
            }
        }

        return goodReports;
    }

    private static int totalNumberOfGoodReports(int[][] goodReports) {
        int count = 0;

        for (int[] goodReport : goodReports) {
            if (goodReport != null) {
                count++;
            }
        }

        return count;
    }

    public static boolean levelsCheckWith1Tolerance(int[] array) {
        if (array.length < 2) {
            // Arrays with fewer than 2 elements are trivially valid
            return true;
        }

        return isValid(array, true) || isValid(array, false);
    }

    private static boolean isValid(int[] array, boolean checkIncreasing) {
        boolean toleranceUsed = false;

        for (int i = 0; i < array.length - 1; i++) {
            int difference = array[i + 1] - array[i];
            boolean validOrder = checkIncreasing ? difference > 0 : difference < 0;

            if (!validOrder || Math.abs(difference) < 1 || Math.abs(difference) > 3) {
                if (!toleranceUsed) {
                    toleranceUsed = true;

                    // Skip this pair by checking array[i] with array[i + 2]
                    if (i + 2 < array.length) {
                        int skipDifference = array[i + 2] - array[i];
                        boolean skipValidOrder = checkIncreasing ? skipDifference > 0 : skipDifference < 0;

                        if (Math.abs(skipDifference) >= 1 && Math.abs(skipDifference) <= 3 && skipValidOrder) {
                            i++; // Skip the next element
                            continue;
                        }
                    }

                    return false; // Tolerance couldn't fix the issue
                } else {
                    return false; // Already used tolerance
                }
            }
        }

        return true;
    }
    */
}
