package pl.imiajd.zieba;

import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args){

        ArrayList<Instrument> Orkiestra = new ArrayList<Instrument>();

        Orkiestra.add(new Flet("Flet prosty", 2005));
        Orkiestra.add(new Flet("Flet aluminiony", 2009));
        Orkiestra.add(new Flet("Flet Antyczny", 1990));
        Orkiestra.add(new Fortepian("Fortepian Chopenopodobny", 2000));
        Orkiestra.add(new Skrzypce("Skrzypce elektryczne", 2021));

        for(int i = 0; i<Orkiestra.size(); i++)
            Orkiestra.get(i).dzwiek();

        for(int i = 0; i<Orkiestra.size(); i++)
            System.out.println(Orkiestra.get(i).toString());
    }
}
