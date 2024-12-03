package org.example.input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import org.example.interfaces.InputReader;

public class FileInputReader  implements InputReader {
    private final String inputPath;

    public FileInputReader(String inputPath) {
        this.inputPath = inputPath;
    }

    @Override
    public Stream<String> getInputString() throws IOException, InvalidPathException {
        return Files.lines(Path.of(inputPath));
    }

    @Override
    public String getInputStream() throws IOException, InvalidPathException {
        return Files.readString(Path.of(inputPath));
    }

    @Override
    public List<String> getInputList() throws IOException, InvalidPathException {
        return Files.readAllLines(Path.of(inputPath));
    }
}
