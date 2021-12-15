package pl.imiajd.zieba;

import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        grupa.add(new Osoba("Zięba Konrad", 2000, 10, 11));
        grupa.add(new Osoba("Zięba Konrad", 1967, 3, 17));
        grupa.add(new Osoba("Waszkiewicz Kamil", 1996, 8, 16));
        grupa.add(new Osoba("Krupiński Tomasz", 1996, 8, 16));
        grupa.add(new Osoba("Polewaczyk Jakub", 2000, 5, 13));

        Collections.sort(grupa);

        for(int i = 0; i<5; i++)
            System.out.println(grupa.get(i).toString());
    }
}
