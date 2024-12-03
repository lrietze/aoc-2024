package org.example.day3;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public record Multiple(List<MulObject> mul) {
    public static Multiple from(String input) {
        Pattern pattern = Pattern.compile("mul\\((\\d+),(\\d+)\\)");
        Matcher matcher = pattern.matcher(input);

        List<MulObject> mul = Stream.generate(() -> matcher)
                .takeWhile(Matcher::find)
                .map(m -> new MulObject(Integer.parseInt(m.group(1)), Integer.parseInt(m.group(2))))
                .collect(Collectors.toList());

        return new Multiple(mul);
    }
}
