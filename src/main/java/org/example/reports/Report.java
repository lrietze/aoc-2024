package org.example.reports;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public record Report(List<Integer> levels){
    public static Report from(String line) {
        List<Integer> levels = Arrays.stream(line.split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toList();

        return new Report(levels);
    }

    public boolean isSafe() {
        return (isReportAscending() || isReportDescending()) && isReportDifferenceValid();
    }

    private boolean isReportAscending() {
        return IntStream.range(0, levels.size() - 1)
                .allMatch(i -> levels.get(i) < levels.get(i + 1));
    }

    private boolean isReportDescending() {
        return IntStream.range(0, levels.size() - 1)
                .allMatch(i -> levels.get(i) > levels.get(i + 1));
    }

    private boolean isReportDifferenceValid() {
        return IntStream.range(0, levels.size() - 1)
                .allMatch(i -> {
                    int diff = Math.abs(levels.get(i) - levels.get(i + 1));
                    return diff >= 1 && diff <= 3;
                });
    }

    public boolean isSafeWithTolerance() {
        return (isReportAscending() || isReportDescending()) && isReportDifferenceValidWithTolerance();
    }

    private boolean isReportDifferenceValidWithTolerance() {
        return IntStream.range(0, levels.size() - 1)
                .allMatch(i -> {
                    int diff = Math.abs(levels.get(i) - levels.get(i + 1));
                    return diff >= 1 && diff <= 3;
                });
    }
}
