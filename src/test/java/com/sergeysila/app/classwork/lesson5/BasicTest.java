package com.sergeysila.app.classwork.lesson5;

import org.junit.*;
import org.junit.runners.MethodSorters;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BasicTest {
    private static final String RESOURCES_PATH = "src/test/java/resources/";
    private static final String INPUT_DATA = RESOURCES_PATH + "input.txt";
    private static final String EXPECTED_RESULTS = RESOURCES_PATH + "expected.txt";
    private static int[] inputData = null;
    private static int[] expectedResults = null;

    @BeforeClass // input data the same for all tests
    public static void preConditionsForClass() throws IOException {
        expectedResults = readTheFile(EXPECTED_RESULTS);
    }

    @Before
    public void preConditionsForTest() throws IOException {
        inputData = readTheFile(INPUT_DATA);
    }

    @Test
    public void aFirstTest() {
        System.out.println("Simple sorting test");
        Arrays.sort(inputData);
        Assert.assertArrayEquals(expectedResults, inputData);
    }

    @Test
    public void bSecondTest() {
        System.out.println("Parallel sorting test");
        Arrays.parallelSort(inputData);
        Assert.assertArrayEquals(expectedResults, inputData);
    }

    @After
    public void postConditionsForTest() {
        inputData = null;
    }

    @AfterClass
    public static void postConditionsForClass() {
        expectedResults = null;
    }

    public static int[] readTheFile(String path) throws IOException {
        int[] result = null;
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        if ((line = reader.readLine()) != null) {
            String[] array = new String[line.split(",").length];
            array = line.split(",");
            result = fromStringArray(array);
        }
        reader.close();
        return result;
    }

    public static int[] fromStringArray(String[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = Integer.valueOf(array[i]);
        }
        return result;
    }
}