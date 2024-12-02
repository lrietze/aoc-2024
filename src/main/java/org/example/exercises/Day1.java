package org.example.exercises;
import org.example.utils.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

public class Day1 {
    public static void main(String[] args) throws IOException, URISyntaxException {
        solve();
    }

    private static void solve() throws IOException, URISyntaxException {
        Map<String,List<Integer>> map = InputReader.parseInputFileColumnsToLists("day1.txt");
        List<Integer> left = map.get("left");
        List<Integer> right = map.get("right");
        ListUtil.sortIntegerList(left);
        ListUtil.sortIntegerList(right);

        int diff = ListUtil.totalDifferenceBetweenLists(left, right);
        System.out.println(String.valueOf(diff));
    }
}
