package com.company;
import java.lang.Math;
import java.util.Scanner;
//CWICZENIE NR 2 LAB 1
//ZADANIE 2
public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Podaj n?");
        int wybrana = n.nextInt();
        System.out.println(wybrana);
        //ZADANIE 2
        /*double[] tab = new double[wybrana];
        for(int i=1; i<=wybrana; ++i)
        {
            Scanner tmp = new Scanner(System.in);
            System.out.println("Podaj liczbe numer " + i);
            double doDodania = tmp.nextDouble();
            tab[i-1] = doDodania;
        }
        double wynik=0;
        for(int i=0; i<tab.length; ++i)
        {
           if(tab[i]>0)
           {
               wynik+=tab[i];
           }
        }
        System.out.println("Podwojona suma wynosi: " + wynik*2);*/


        //ZADANIE 3
        /*double[] tab = new double[wybrana];
        for(int i=1; i<=wybrana; ++i)
        {
            Scanner tmp = new Scanner(System.in);
            System.out.println("Podaj liczbe numer " + i);
            double doDodania = tmp.nextDouble();
            tab[i-1] = doDodania;
        }
        int dodatnie=0, ujemne=0, zera=0;
        for(int i=0; i<tab.length; ++i)
        {
           if(tab[i]>0) dodatnie+=1;
           else if(tab[i]<0) ujemne+=1;
           else zera+=1;
        }
        System.out.println("Iloœæ dodatnich: " + dodatnie);
        System.out.println("Iloœæ ujemnych: " + ujemne);
        System.out.println("Iloœæ zer: " + zera);*/



        //ZADANIE 4
        /*double[] tab = new double[wybrana];
        for(int i=1; i<=wybrana; ++i)
        {
            Scanner tmp = new Scanner(System.in);
            System.out.println("Podaj liczbe numer " + i);
            double doDodania = tmp.nextDouble();
            tab[i-1] = doDodania;
        }
        double max=tab[0], min=tab[0];
        for(int i=0; i<tab.length; ++i)
        {
            if(tab[i]<min)
            {
                min=tab[i];
            }
            if(tab[i]>max)
            {
                max=tab[i];
            }
        }
        System.out.println("Najwieksza liczba: " + max);
        System.out.println("Najmniejsza liczba: " + min);*/


        //ZADANIE 5
        double[] tab = new double[wybrana];
        for(int i=1; i<=wybrana; ++i)
        {
            Scanner tmp = new Scanner(System.in);
            System.out.println("Podaj liczbe numer " + i);
            double doDodania = tmp.nextDouble();
            tab[i-1] = doDodania;
        }
        int ile=0;
        for(int i=0; i<tab.length-1; ++i)
        {
            if(tab[i]>0 && tab[i+1]>0) ile+=1;
        }
        System.out.println("Iloœæ par: " + ile);
    }
}




