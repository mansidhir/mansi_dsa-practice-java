package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main1 {
    public static String outputFile = "Output.txt";
    public static String inputFile = "Input.txt";
    private static Scanner sc;

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(inputFile);
        System.setIn(stream);
        sc = new Scanner(System.in);

        PrintStream o = new PrintStream(outputFile);
        System.setOut(o);


        int [] stones = new int[10];
        IntStream.range(0, 10)
                .boxed()
                .collect(Collectors.toMap(i -> stones[i], i -> i));

    }

}
