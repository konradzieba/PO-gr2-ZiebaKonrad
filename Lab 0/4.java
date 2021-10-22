package com.company;

public class Main {

    public static void main(String[] args) {
        double saldo = 1000;
        for(int i=1; i<=3; ++i)
        {
            saldo = saldo*1.06;
            System.out.println("Saldo po " + i + " roku: " + saldo);
        }
    }
}
