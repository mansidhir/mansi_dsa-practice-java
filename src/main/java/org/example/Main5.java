package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Main5 {
    public static String outputFile = "Output.txt";
    public static String inputFile = "Input.txt";
    private static Scanner sc;

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(inputFile);
        System.setIn(stream);

        PrintStream o = new PrintStream(outputFile);
        System.setOut(o);

        sc = new Scanner(System.in);

        solve();
    }

    public static void solve() {
    }

}
