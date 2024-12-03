package org.example;

import org.example.interfaces.InputReader;
import org.example.output.ExerciseOutput;

public abstract class Exercise {
    public abstract ExerciseOutput<?,?> solve(InputReader reader) throws Exception;
}
