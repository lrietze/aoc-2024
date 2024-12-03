import org.example.utils.ArrayParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ArrayParserTest {
    @Test
    void testIncreasingOrDecreasingCheck() {
        int[] array = {1, 2, 3};
        assertTrue(ArrayParser.increasingOrDecreasingCheck(array));

        int[] array2 = {3, 2, 1};
        assertTrue(ArrayParser.increasingOrDecreasingCheck(array2));

        int[] array3 = {1, 2, 1};
        assertFalse(ArrayParser.increasingOrDecreasingCheck(array3));
    }

    @Test
    void testDifferBy1AndAtMost3Check() {
        int[] array = {1, 2, 3};
        assertTrue(ArrayParser.differBy1AndAtMost3Check(array));

        int[] array2 = {1, 4, 7};
        assertTrue(ArrayParser.differBy1AndAtMost3Check(array2));

        int[] array3 = {1, 5, 9};
        assertFalse(ArrayParser.differBy1AndAtMost3Check(array3));

        int[] array4 = {1, 3, 7};
        assertFalse(ArrayParser.differBy1AndAtMost3Check(array4));

        int[] array5 = {1, 1, 6};
        assertFalse(ArrayParser.differBy1AndAtMost3Check(array5));

        int[] array6 = {1, 1, 1};
        assertFalse(ArrayParser.differBy1AndAtMost3Check(array6));
    }

    @Test
    void testIncreasingOrDecreasingCheckWith1Tolerance() {
        int[] array = {1, 2, 3};
        assertTrue(ArrayParser.increasingOrDecreasingCheckWith1Tolerance(array));

        int[] array2 = {3,2,1};
        assertTrue(ArrayParser.increasingOrDecreasingCheckWith1Tolerance(array2));

        int[] array3 = {1,3,2,3};
        assertTrue(ArrayParser.increasingOrDecreasingCheckWith1Tolerance(array3));

        int[] array4 = {4,1,3,2};
        assertTrue(ArrayParser.increasingOrDecreasingCheckWith1Tolerance(array4));

        int[] array5 = {1,5,4,3};
        assertTrue(ArrayParser.increasingOrDecreasingCheckWith1Tolerance(array5));

        int[] array6 = {9,1,5,4};
        assertTrue(ArrayParser.increasingOrDecreasingCheckWith1Tolerance(array6));

        int[] array7 = {1,1,1};
        assertFalse(ArrayParser.increasingOrDecreasingCheckWith1Tolerance(array7));

        int[] array8 = {1,1,2};
        assertTrue(ArrayParser.increasingOrDecreasingCheckWith1Tolerance(array8));
    }

    @Test
    void testDifferBy1AndAtMost3CheckWith1Tolerance() {
        int[] array = {1, 2, 3};
        assertTrue(ArrayParser.differBy1AndAtMost3CheckWith1Tolerance(array));

        int[] array2 = {1, 4, 7};
        assertTrue(ArrayParser.differBy1AndAtMost3CheckWith1Tolerance(array2));

        int[] array3 = {1, 5, 9};
        assertFalse(ArrayParser.differBy1AndAtMost3CheckWith1Tolerance(array3));

        int[] array4 = {1, 3, 7};
        assertFalse(ArrayParser.differBy1AndAtMost3CheckWith1Tolerance(array4));

        int[] array5 = {1, 1, 6};
        assertFalse(ArrayParser.differBy1AndAtMost3CheckWith1Tolerance(array5));

        int[] array6 = {1, 1, 1};
        assertFalse(ArrayParser.differBy1AndAtMost3CheckWith1Tolerance(array6));

        int[] array7 = {1, 1, 3, 5};
        assertTrue(ArrayParser.differBy1AndAtMost3CheckWith1Tolerance(array7));

        int[] array8 = {1, 1, 3, 5, 5, 6};
        assertFalse(ArrayParser.differBy1AndAtMost3CheckWith1Tolerance(array8));
    }
}
