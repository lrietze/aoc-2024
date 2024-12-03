package org.example.utils;

import org.example.exercises.Day2;

import java.util.Arrays;

public class ArrayParser {
    public static boolean increasingOrDecreasingCheck(int[] array) {
        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i + 1]) {
                increasing = false;
            }
            if(array[i] < array[i + 1]) {
                decreasing = false;
            }
            if(!increasing && !decreasing) {
                return false;
            }
        }

        return true;
    }

    public static boolean differBy1AndAtMost3Check(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            if(Math.abs(array[i + 1] - array[i]) > 3) {
                return false;
            } else if(Math.abs(array[i + 1] - array[i]) < 1) {
                return false;
            }
        }

        return true;
    }

    public static boolean increasingOrDecreasingCheckWith1Tolerance(int[] array) {
        if (array.length < 3) {
            // covers empty array, single value arrays, and arrays of 2 values, where we get one tolerance
            return true;
        }
        boolean ascending = isAscendingWith1Tolerance(array);
        boolean descending = isDescendingWith1Tolerance(array);

//        System.out.println("Array: " + Arrays.toString(array) + " || Result: " + String.valueOf(ascending || descending));
        return ascending || descending;
    }

    private static boolean isAscendingWith1Tolerance(int[] array) {
        boolean ascending = true;

        for(int i = 0; i < array.length-1; i++) {
            boolean toleranceUsed = false;
            if(array[i] >= array[i + 1]) {
                if (!toleranceUsed) {
                    toleranceUsed = true;
                    if (i > 0 && array[i - 1] > array[i + 1]) {
                        ascending = false;
                    }
                } else {
                    ascending = false;
                }
            }
        }

//        System.out.println("isAscending: " + String.valueOf(ascending));
        return ascending;
    }

    private static boolean isDescendingWith1Tolerance(int[] array) {
        boolean descending = true;

        for(int i = 0; i < array.length-1; i++) {
            boolean toleranceUsed = false;
            if(array[i] <= array[i + 1]) {
                if(!toleranceUsed) {
                    toleranceUsed = true;
                    if(i > 0 && array[i-1] < array[i + 1]) {
                        descending = false;
                    }
                } else {
                    descending = false;
                }
            }
        }

//        System.out.println("isDescending: " + String.valueOf(descending));
        return descending;
    }

    public static boolean differBy1AndAtMost3CheckWith1Tolerance(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            boolean toleranceUsed = false;
            if((Math.abs(array[i + 1] - array[i]) > 3) || (Math.abs(array[i + 1] - array[i]) < 1)) {
                if(!toleranceUsed) {
                    toleranceUsed = true;
                    if (i > 0 && (Math.abs(array[i + 1] - array[i - 1]) > 3 || Math.abs(array[i + 1] - array[i - 1]) < 1)) {
                        return false;
                    }
                    if (i + 2 < array.length && (Math.abs(array[i + 2] - array[i]) > 3 || Math.abs(array[i + 2] - array[i]) < 1)) {
                        return false;
                    }
                } else
                    return false;
            }
        }

        return true;
    }
}
