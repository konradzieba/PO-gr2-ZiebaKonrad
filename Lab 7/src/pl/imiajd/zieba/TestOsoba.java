package pl.imiajd.zieba;

public class TestOsoba {

    public static void main(String[] args){

        String[] testImiona = {"Ala", "Ewa"};
        Osoba test1 = new Osoba(testImiona, "Zięba", 1972, 11, 28, false);

        System.out.println(test1.getImiona());
        System.out.println(test1.getDataUrodzenia());
        System.out.println(test1.getPlec());

        Pracownik test2 = new Pracownik(testImiona, "Maksiomow", 1994, 5, 20, true, 2000.0, 1972, 5, 20);

        System.out.println(test2.getDataZatrudnienia());

        Student test3 = new Student(testImiona, "Maksiomow", 2000, 10, 11, true, "Informatyka", 4.5);

        System.out.print(test3.getSredniaOcen());
    }
}