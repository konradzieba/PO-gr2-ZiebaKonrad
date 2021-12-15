package pl.imiajd.zieba;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args){
        ArrayList<Student> grupa = new ArrayList<Student>();
        grupa.add(new Student("Kręty Marian", 1986, 3, 19, 2.0));
        grupa.add(new Student("Pabiańczyk Marek", 2000, 3, 17, 2.3));
        grupa.add(new Student("Ewa Zięba", 1972, 8, 21, 4.3));
        grupa.add(new Student("Gorbaczov Jolanta", 1983, 8, 21, 3.0));
        grupa.add(new Student("Stanisław Jankowski", 1998, 5, 13, 5.0));

        Collections.sort(grupa);

        for(int i = 0; i<5; i++)
            System.out.println(grupa.get(i).toString());
    }
}
