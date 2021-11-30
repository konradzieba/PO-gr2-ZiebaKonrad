package pl.imiajd.zieba;

public class Student extends Osoba{
    private String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek){
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    @Override
    public String toString(){
        String wynik = super.toString();
        wynik += " " + kierunek;
        return wynik;
    }

    public String getKierunek(){
        return this.kierunek;
    }
}
