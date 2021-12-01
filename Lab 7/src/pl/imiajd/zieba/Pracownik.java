package pl.imiajd.zieba;

import java.time.LocalDate;

public class Pracownik extends Osoba {

    private String nazwisko;
    private double pobory;
    private LocalDate dataZatrudnienia;

    private int id;
    private static int nextId = 1;

    public Pracownik(String[] imiona, String nazwisko, int rokUrodzenia, int miesiacUrodzenia, int dzienUrodzenia, boolean plec, double pobory, int rokZatrudnienia, int miesiacZatrudnienia, int dzienZatrudnienia) {
        super(imiona, nazwisko, rokUrodzenia, miesiacUrodzenia, dzienUrodzenia, plec);
        this.pobory = pobory;
        this.dataZatrudnienia = LocalDate.of(rokZatrudnienia, miesiacZatrudnienia, dzienZatrudnienia);
    }

    public double pobory() {
        return pobory;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }
}