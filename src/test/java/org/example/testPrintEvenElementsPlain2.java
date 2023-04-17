package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class testPrintEvenElementsPlain2 {
    private static final String[] arr = {"a", "b", "c", "d", "e"};

    @Test
    public void testReturnGoodList() {
        List<String> expectedList = Arrays.asList("b", "d");
        List<String> actualList = App.printEvenElementsPlain2(arr);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void testReturnBadList() {
        List<String> expectedList = Arrays.asList("b", "d");
        List<String> actualList = App.printEvenElementsPlain2(new String[]{"z","x","v"});
        assertNotEquals(expectedList, actualList);
    }
}
