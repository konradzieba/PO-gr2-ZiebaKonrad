package pl.imiajd.zieba;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class zadanie3 {
    public static void main(String[] args){
        try {
            File plik = new File(args[0]);
            Scanner scanner = new Scanner(plik);

            ArrayList<String> linie = new ArrayList<String>();
            String reader;
            while (scanner.hasNextLine()) {
                reader = scanner.nextLine();
                linie.add(reader);
            }

            Collections.sort(linie);
            for(int i = 0; i<linie.size(); i++)
                System.out.println(linie.get(i));
        } catch (FileNotFoundException e) {
            System.out.println("Wystąpił błąd");
            e.printStackTrace();
        }
    }
}
