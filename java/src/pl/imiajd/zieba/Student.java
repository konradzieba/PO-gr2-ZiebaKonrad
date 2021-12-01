package pl.imiajd.zieba;

public class Student extends Osoba {
    private String kierunek;
    private double sredniaOcen;

    public Student(String[] imiona, String nazwisko, int rokUrodzenia, int miesiacUrodzenia, int dzienUrodzenia, boolean plec, String kierunek, double sredniaOcen){
        super(imiona, nazwisko, rokUrodzenia, miesiacUrodzenia, dzienUrodzenia, plec);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public String toString(){
        String wynik = super.toString();
        wynik += " " + kierunek;
        return wynik;
    }

    public double getSredniaOcen()
    {
        return sredniaOcen;
    }

    public void setSredniaOcen(double srednia)
    {
        sredniaOcen = srednia;
    }

    public String getKierunek(){
        return this.kierunek;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }
}
