package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class testPrintEvenElementsPlain1 {
    private static final String[] arr = {"a", "b", "c", "d", "e"};

    @Test
    public void testReturnGoodList() {
        List<String> expectedList = Arrays.asList("b", "d");
        List<String> actualList = App.printEvenElementsPlain1(arr);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void testReturnBadList() {
        List<String> expectedList = Arrays.asList("b", "d");
        List<String> actualList = App.printEvenElementsPlain1(new String[]{"z","x","v"});
        assertNotEquals(expectedList, actualList);
    }
}
