package com.company;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.*;
import java.lang.String;



public class Main {

    public static int countChar(String str, char c)
    {
        int count = 0;
        for(int i=0; i<str.length(); ++i)
        {
            if(str.charAt(i) == c) count++;
        }
        return count;
    }

    public static int countSubStr(String str, String subStr)
    {
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = str.indexOf(subStr, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += subStr.length();
            }
        }
        return count;
    }

    public static String middle(String str)
    {
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }

    public static String repeat(String str, int n)
    {
        String c = "";
        for(int i=0; i<n; ++i)
        {
            c+= str;
        }
        return c;
    }

    public static int[] where(String str, String subStr){
        int n = countSubStr(str, subStr);
        int[] where = new int[n];
        int j = 0;
        StringBuffer sb = new StringBuffer(str);
        for(int i = 0; i <= sb.length()-1; i++){
            if((sb.length()-1) >= i+subStr.length()-1){
                String s = sb.substring(i, i+subStr.length());
                if(s.equals(subStr)) {
                    where[j] = i;
                    j++;
                }
            }
        }
        return where;
    }

    public static String change(String str)
    {
        StringBuffer buffer = new StringBuffer("");
        for(int i = 0; i<str.length(); i++){
            if((int)str.charAt(i) < 97)
                buffer.append(Character.toLowerCase(str.charAt(i)));
            else
                buffer.append(Character.toUpperCase(str.charAt(i)));
        }

        return buffer.toString();
    }

    public static String nice(String str, char sep, int interval){
        StringBuffer buffer = new StringBuffer("");
        for(int i = 0; i<str.length(); i++){
            if((str.length()-i)%interval == 0 && i != 0)
                buffer.append(sep);
            buffer.append(str.charAt(i));
        }
        buffer.append(sep);

        return buffer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ///a
        //System.out.printf("%c wystêpuje w %s razy:%d", 'b', "abcba", zadanie1.countChar("abcba", 'b'));
        ///b
        //System.out.printf("%s wystêpuje w %s razy:%d", "abc", "abcabc", zadanie1.countSubStr("abcabc", "abc"));
        ///c
        //System.out.printf("œrodek:%s", zadanie1.middle(scanner.nextLine()));
        ///d
        //System.out.printf("powtórzenie 3 razy:%s", zadanie1.repeat(scanner.nextLine(), 3));
        ///e
        //int[] tab = zadanie1.where("abcabc", "abc");
        //for(int i = 0; i<zadanie1.countSubStr("abcabc", "abc"); i++)
        //System.out.printf("%d ", tab[i]);
        ///f
        //System.out.printf("Wynik odwrócenia:%s", zadanie1.change("test test"));
        //g i h
        ///System.out.printf("Czytelny zapis dziesietny %s:%s", "123456789", zadanie1.nice("123456789", '\'', 3));
    }

}
