package pl.imiajd.zieba;

public class Nauczyciel extends Osoba{
    private int pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja){
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    @Override
    public String toString(){
        String wynik = super.toString();
        wynik += " " + Integer.toString(pensja);
        return wynik;
    }

    public int getPensja(){
        return this.pensja;
    }
}
