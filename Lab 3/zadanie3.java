package com.company;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.*;
import java.lang.String;
import java.io.*;



public class Main {

    public static void main(String[] args){

        try {
            BufferedReader in = new BufferedReader(new FileReader(args[0]));
            String word = args[1];
            String line = in.readLine();
            int count = 0;
            do {
                count += (line.length() - line.replace(word, "").length()) / word.length();
                line = in.readLine();
            } while (line != null);
            System.out.print("Jest tam " + count + " s³ow  " + word + " wewn¹trz pliku ");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
