package pl.imiajd.zieba;

import java.util.ArrayList;

public class Main {

        public static void main(String[] args){

            ArrayList<Instrument> Orkiestra = new ArrayList<Instrument>();

            Orkiestra.add(new Flet("Flet prosty", 2005));
            Orkiestra.add(new Flet("Flet aluminiowy", 2009));
            Orkiestra.add(new Flet("Flet antyczny", 1990));
            Orkiestra.add(new Fortepian("Fortepian Chopenopodobny", 2000));
            Orkiestra.add(new Skrzypce("Skrzypce elektryczne", 2021));

            for(int i = 0; i<Orkiestra.size(); i++)
                Orkiestra.get(i).dzwiek();

            for(int i = 0; i<Orkiestra.size(); i++)
                System.out.println(Orkiestra.get(i).toString());
        }


    String[] testImiona = {"Ala", "Ewa"};
    Osoba test1 = new Osoba(testImiona, "Zięba", 1972, 11, 28, false);

        System.out.println(test1.getImiona());
        System.out.println(test1.getDataUrodzenia());
        System.out.println(test1.getPlec());

    Pracownik test2 = new Pracownik(testImiona, "Etter", 1994, 5, 20, true, 2000.0, 1972, 5, 20);

        System.out.println(test2.getDataZatrudnienia());

    Student test3 = new Student(testImiona, "Nowak", 2000, 10, 11, true, "Informatyka", 4.5);

        System.out.print(test3.getSredniaOcen());
    }
