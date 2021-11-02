package com.company;


import java.lang.String;
import java.math.BigDecimal;
import java.util.Scanner;



public class Main {

    public static void kapital(double k, double p, int n) {
        BigDecimal kapital2 = new BigDecimal(Double.toString(k)).setScale(2);
        BigDecimal procent = new BigDecimal(Double.toString(p / 100.0 + 1)).setScale(2);
        procent = procent.pow(n);
        kapital2 = kapital2.multiply(procent);

        System.out.println(kapital2);
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj k: ");
        double k = scanner.nextDouble();
        System.out.println("Podaj p: ");
        double p = scanner.nextDouble();
        System.out.println("Podaj n: ");
        int n = scanner.nextInt();

        kapital(k,p,n);
        // wejscia:(1000,1,3) = 1030.30100000
    }
}
