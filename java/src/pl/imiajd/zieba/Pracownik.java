package pl.imiajd.zieba;

import java.time.LocalDate;

public class Pracownik extends Osoba{

    private String nazwisko;
    private double pobory;
    private LocalDate dataZatrudnienia;

    private int id;
    private static int nextId = 1;

    public Pracownik(String[] imiona, String nazwisko, int rokUrodzenia, int miesiacUrodzenia, int dzienUrodzenia, boolean plec, double pobory, int employYear, int employMonth, int employDay) {
        super(imiona, nazwisko, rokUrodzenia, miesiacUrodzenia, dzienUrodzenia, plec);
        this.pobory = pobory;
        this.dataZatrudnienia = LocalDate.of(employYear, employMonth, employDay);

        id = nextId;
        ++nextId;
    }

    public double pobory() {
        return pobory;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public void zwiekszPobory(double procent) {
        double podwyżka = pobory * procent / 100;
        pobory += podwyżka;
    }

    public int id() {
        return id;
    }

    public void setId() {
        id = nextId;
        ++nextId;
    }

    public static int getNextId() {
        return nextId;
    }


}
