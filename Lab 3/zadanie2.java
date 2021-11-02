package com.company;

import java.util.Scanner;
import java.lang.String;
import java.io.*;

public class Main {

    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == c) count++;
        }
        return count;
    }

    public static int fileCountChar(String filename, char znak) {
        try {
            int counter = 0;
            File file = new File(filename);
            String reader;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                reader = scanner.nextLine();
                counter = counter + countChar(reader, znak);
            }

            return counter;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.printf("%d", fileCountChar("testfile.txt", 'a'));
    }
}
