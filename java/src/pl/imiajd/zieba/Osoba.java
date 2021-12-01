package pl.imiajd.zieba;

import java.time.LocalDate;

public class Osoba
{
    private String[] imiona;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private boolean plec;

    public Osoba(String[] imiona, String nazwisko, int rokUrodzenia, int miesiacUrodzenia, int dzienUrodzenia, boolean plec)
    {
        this.imiona = new String[imiona.length];
        for(int i = 0; i<imiona.length; i++)
            this.imiona[i] = imiona[i];
        this.nazwisko = nazwisko;
        this.dataUrodzenia = LocalDate.of(miesiacUrodzenia, miesiacUrodzenia, dzienUrodzenia);
        this.plec = plec;
    }

    @Override
    public String toString()
    {
        return "[nazwisko: " + nazwisko + ", data urodzenia: " + dataUrodzenia + "]";
    }

    public boolean equals(Osoba other)
    {
        return nazwisko.equals(other.nazwisko) && dataUrodzenia.equals(other.dataUrodzenia);
    }

    public String[] getImiona()
    {
        return imiona;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public boolean getPlec()
    {
        return plec;
    }
}
