package com.company;


import java.lang.String;
import java.math.BigInteger;
import java.util.Scanner;



public class Main {

    public static void szachownica(int n){
        BigInteger calkowita = new BigInteger("0");
        BigInteger podstawa = new BigInteger("2");
        for(int i = 0; i<n*n; i++)
            calkowita = calkowita.add(podstawa.pow(i));

        System.out.println(calkowita);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        szachownica(scanner.nextInt());
    }
}
