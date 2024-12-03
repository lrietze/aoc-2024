package org.example.interfaces;

import java.util.List;
import java.util.stream.Stream;

public interface InputReader {

    Stream<String> getInputString() throws Exception;

    String getInputStream() throws Exception;

    List<String> getInputList() throws Exception;
}
