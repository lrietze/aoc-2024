package org.example.day3;

import java.util.regex.Matcher;

public class MulObject {
    private final int x;
    private final int y;

    public MulObject(Matcher matcher) {
        this(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
    }

    public MulObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int multiply() {
        return x * y;
    }
}
