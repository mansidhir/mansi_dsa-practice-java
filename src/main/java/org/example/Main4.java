package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main4 {
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
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            String str = sc.next();

            long cnt1 = str.chars().mapToObj(i -> (char) i).filter(chr -> chr == '_').count();
            long cnt2 = str.chars().mapToObj(i -> (char) i).filter(chr -> chr == '-').count();

            long ans = 0;
            if(cnt1 > 1 && cnt2 > 0) {
                ans = (cnt1 / 2) * (cnt1 / 2 + (cnt1 % 2)) * cnt2;
            }

            System.out.println(ans);
        }

    }

}
