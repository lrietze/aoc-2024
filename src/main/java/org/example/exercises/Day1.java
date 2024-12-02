package org.example.exercises;
import org.example.utils.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

public class Day1 {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Map<String,List<Integer>> map = InputReader.parseInputFileColumnsToLists("day1.txt");
        List<Integer> left = map.get("left");
        List<Integer> right = map.get("right");
        ListUtil.sortIntegerList(left);
        ListUtil.sortIntegerList(right);

        solvePart1(left, right);
        solvePart2(left, right);
    }

    public static void solvePart1(List<Integer> left, List<Integer> right) throws IOException, URISyntaxException {
        System.out.println("Total difference: " + String.valueOf(ListUtil.totalDifferenceBetweenLists(left, right)));
    }

    public static void solvePart2(List<Integer> left, List<Integer> right) {
        int value = 0;
        for (int i : left) {
            value += i * ListUtil.totalOccurrenceOfIntInList(right, i);
        }

        System.out.println("Similarity score: " + String.valueOf(value));
    }
}
