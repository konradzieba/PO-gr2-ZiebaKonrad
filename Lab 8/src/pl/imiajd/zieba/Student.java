package pl.imiajd.zieba;

import java.lang.Cloneable;
import java.lang.Comparable;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{
    private double sredniaOcen;

    public Student(String nazwisko, int year, int month, int day, double sredniaOcen) {
        super(nazwisko, year, month, day);
        this.sredniaOcen = sredniaOcen;
    }

    public int compareTo(Student test){
        int wynik1 = super.compareTo(test);
        int wynik2;
        if(this.sredniaOcen > test.sredniaOcen)
            wynik2 = 1;
        else if(this.sredniaOcen < test.sredniaOcen)
            wynik2 = -1;
        else
            wynik2 = 0;

        if(wynik1 == 0)
            return wynik2;

        return wynik1;
    }
}