package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main2 {
    public static String outputFile = "Output.txt";
    public static String inputFile = "Input.txt";
    private static Scanner sc;

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(inputFile);
        System.setIn(stream);
        sc = new Scanner(System.in);

        PrintStream o = new PrintStream(outputFile);
        System.setOut(o);






    }


}
