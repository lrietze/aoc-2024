import org.example.utils.InputReader;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class InputReaderTest {

    @Test
    void testReadInput() {
        try {
            String expected = "This is a test file.";
            String actual = InputReader.readInput("test.txt");
            assertEquals(expected, actual);
            assertNotNull(actual);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testFileNotFound() {
        assertThrows(NullPointerException.class, () -> {
            InputReader.readInput("nonexistent.txt");
        });
    }

    @Test
    void testParseInputFileColumnsToLists() {
        try {
            Map<String, List<Integer>> result = InputReader.parseInputFileColumnsToLists("testsort.txt");
            List<Integer> left = result.get("left");
            List<Integer> right = result.get("right");
            assertNotNull(result);
            assertEquals("[2, 1]", Arrays.toString(left.toArray()));
            assertEquals("[4, 2]", Arrays.toString(right.toArray()));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
