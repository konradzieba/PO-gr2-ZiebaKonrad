package com.company;
import java.lang.Math;
import java.util.Scanner;
//CWICZENIE NR 1 LAB 1
//ZADANIE 1
public class Main {

    public static int silnia(int n) {
        int wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik*= i;
        }
        return wynik;
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Podaj n?");
        int wybrana = n.nextInt();
        System.out.println(wybrana);

        //Podpunkt a)
        /*
        double suma=0;
        for(int i=1; i<=wybrana; ++i)
        {
            Scanner tmp = new Scanner(System.in);
            System.out.println("Podaj liczbe numer " + i);
            double doDodania = tmp.nextDouble();
            suma+=doDodania;
        }
        System.out.println("Suma wynosi: " + suma);*/

        //Podpunkt b)

        /*double wynik=1;
        for(int i=1; i<=wybrana; ++i)
        {
            Scanner tmp = new Scanner(System.in);
            System.out.println("Podaj liczbe numer " + i);
            double doPomnozenia = tmp.nextDouble();
            wynik*=doPomnozenia;
        }
        System.out.println("Suma wynosi: " + wynik);*/

        //Podpunkt c)

        /*double suma=0;
        for(int i=1; i<=wybrana; ++i)
        {
            Scanner tmp = new Scanner(System.in);
            System.out.println("Podaj liczbe numer " + i);
            double doDodania = tmp.nextDouble();
            doDodania = Math.abs(doDodania);
            suma+=doDodania;
        }
        System.out.println("Suma wynosi: " + suma);*/


        //Podpunkt d)

        /*double suma=0;
        for(int i=1; i<=wybrana; ++i)
        {
            Scanner tmp = new Scanner(System.in);
            System.out.println("Podaj liczbe numer " + i);
            double doDodania = tmp.nextDouble();
            doDodania = Math.sqrt(Math.abs(doDodania));
            suma+=doDodania;
        }
        System.out.println("Suma wynosi: " + suma);*/


        //Podpunkt e)

        /*double suma=1;
        for(int i=1; i<=wybrana; ++i)
        {
            Scanner tmp = new Scanner(System.in);
            System.out.println("Podaj liczbe numer " + i);
            double doDodania = tmp.nextDouble();
            doDodania = Math.abs(doDodania);
            suma*=doDodania;
        }
        System.out.println("Suma wynosi: " + suma);*/


        //Podpunkt f)

        /*double suma=0;
        for(int i=1; i<=wybrana; ++i)
        {
            Scanner tmp = new Scanner(System.in);
            System.out.println("Podaj liczbe numer " + i);
            double doDodania = tmp.nextDouble();
            doDodania = Math.pow(doDodania, 2);
            suma+=doDodania;
        }
        System.out.println("Suma wynosi: " + suma);*/

        //Podpunkt g)

        /*double wynik1=0;
        double wynik2=1;
        for(int i=1; i<=wybrana; ++i)
        {
            Scanner tmp = new Scanner(System.in);
            System.out.println("Podaj liczbe numer " + i);
            double doDodania = tmp.nextDouble();
            wynik1+=doDodania;
            wynik2*=doDodania;
        }
        System.out.println("Suma pierwszego dzialania wynosi: " + wynik1);
        System.out.println("Suma drugiego dzialania wynosi: " + wynik2);*/

        //Podpunkt h)

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
            //System.out.println(tab[i]);
            if(i%2==0)
            {
                wynik+=tab[i];
            }
            else
            {
                wynik-=tab[i];
            }
        }
        System.out.println("Suma wynosi: " + wynik);*/


        //Podpunkt i)
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
            //System.out.println(tab[i]);
            if(i%2==0)
            {
                wynik-=tab[i]/Main.silnia(i);
            }
            else
            {
                wynik+=tab[i]/Main.silnia(i);
            }
        }
        System.out.println("Suma wynosi: " + wynik);*/




        //ZADANIE 2
        /*double[] tab = new double[wybrana];
        for(int i=1; i<=wybrana; ++i)
        {
            Scanner tmp = new Scanner(System.in);
            System.out.println("Podaj liczbe numer " + i);
            double doDodania = tmp.nextDouble();
            tab[i-1] = doDodania;
        }
        for(int i=1; i<tab.length; ++i)
        {
            System.out.println(tab[i]);
        }
        System.out.println(tab[0]);*/
    }
}




