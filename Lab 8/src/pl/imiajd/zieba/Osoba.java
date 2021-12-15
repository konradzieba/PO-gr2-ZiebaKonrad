package pl.imiajd.zieba;

import java.time.LocalDate;
import java.lang.Cloneable;
import java.lang.Comparable;

public class Osoba implements Cloneable, Comparable<Osoba>{
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, int year, int month, int day){
        this.nazwisko = nazwisko;
        this.dataUrodzenia = LocalDate.of(year, month, day);
    }

    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public String toString(){
        String wynik = "Osoba";
        wynik += "[" + nazwisko + "," + Integer.toString(dataUrodzenia.getYear()) + "-" + Integer.toString(dataUrodzenia.getMonthValue()) + "-" + Integer.toString(dataUrodzenia.getDayOfMonth()) + "]";
        return wynik;
    }

    public boolean equals(Osoba test){
        if(this.nazwisko.equals(test.nazwisko) && this.dataUrodzenia.equals(test.dataUrodzenia))
            return true;
        return false;
    }

    @Override
    public int compareTo(Osoba test){
        int wynik1 = this.nazwisko.compareTo(test.nazwisko);
        int wynik2 = this.dataUrodzenia.compareTo(test.dataUrodzenia);
        if(wynik1 < 0)
            return -1;
        if(wynik1 > 0)
            return 1;
        if(wynik2 < 0)
            return -1;
        if(wynik2 > 0)
            return 1;

        return 0;
    }
}
