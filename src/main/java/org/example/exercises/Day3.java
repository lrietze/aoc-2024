package org.example.exercises;

import org.example.day3.MulObject;
import org.example.day3.Multiple;
import org.example.input.FileInputReader;
import org.example.utils.InputReader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3 {
    public static void main(String[] args) throws IOException, URISyntaxException {
        String input = InputReader.readInput("day3.txt");
        part1(input);
    }

    private static void part1(String input) {
        Multiple multiple = Multiple.from(input);

        Long total = 0L;
        for (MulObject mul : multiple.mul()) {
            total += mul.multiply();
        }

        System.out.println("Total: " + total);
    }

    private static void part2() {
    }
}
