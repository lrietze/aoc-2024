package org.example.utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InputReader {
    private static Path getPath(String fileName) throws URISyntaxException {
        return Paths.get(ClassLoader.getSystemResource("inputs/" + fileName).toURI());
    }

    public static String[][] readInputAs2DArray(String fileName) throws URISyntaxException, IOException {
        return Files.lines(getPath(fileName))
                .map(line -> line.split("\\s+"))
                .toArray(String[][]::new);
    }

    public static int[][] readInputAs2DIntArray(String filename) throws IOException, URISyntaxException {
        return Files.lines(getPath(filename))
                .map(line -> line.split("\\s+"))
                .map(arr -> {
                    int[] intArr = new int[arr.length];
                    for (int i = 0; i < arr.length; i++) {
                        intArr[i] = Integer.parseInt(arr[i]);
                    }
                    return intArr;
                })
                .toArray(int[][]::new);
    }

    public static String readInput(String fileName) throws IOException, URISyntaxException, NullPointerException {
        return Files.readString(getPath(fileName));
    }

    public static Map<String,List<Integer>> parseInputFileColumnsToLists(String fileName) throws IOException, URISyntaxException, NullPointerException {
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();

        try {
            Files.lines(getPath(fileName))
                    .map(line -> line.split("\\s+"))
                    .forEach(parts -> {
                        left.add(Integer.parseInt(parts[0]));
                        right.add(Integer.parseInt(parts[1]));
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, List<Integer>> map = new HashMap<>();
        map.put("left", left);
        map.put("right", right);

        return map;
    }

}
