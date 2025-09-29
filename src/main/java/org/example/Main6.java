package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main6 {
    public static String outputFile = "Output.txt";
    public static String inputFile = "Input.txt";
    private static Scanner sc;

    public static void main(String[] args) throws FileNotFoundException {
//        FileInputStream stream = new FileInputStream(inputFile);
//        System.setIn(stream);
//
//        PrintStream o = new PrintStream(outputFile);
//        System.setOut(o);

        sc = new Scanner(System.in);

        solve();
    }

    public static void solve() {
        System.out.println("hello main 6");

    }

}
