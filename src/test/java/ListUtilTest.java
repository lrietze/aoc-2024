import org.example.utils.ListUtil;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListUtilTest {
    @Test
    void testSortIntegerList() {
        List<Integer> list = Arrays.asList(3, 1, 2);
        ListUtil.sortIntegerList(list);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, list);
    }

    @Test
    void testTotalDifferenceBetweenLists() {
        List<Integer> left = Arrays.asList(1, 2, 3);
        List<Integer> right = Arrays.asList(4, 5, 6);
        int diff = ListUtil.totalDifferenceBetweenLists(left, right);
        assertEquals(9, diff);

        List<Integer> longerLengthList = Arrays.asList(1);
        assertThrows(IllegalArgumentException.class , () -> {
            ListUtil.totalDifferenceBetweenLists(left, longerLengthList);
        });
    }
}
