package pl.imiajd.zieba;

public class Main {
    public static void main(String[] args){
        BetterRectangle test = new BetterRectangle(2, 5, 0, 0);
        System.out.println(test.getPerimeter());
        System.out.println(test.GetArea());

        NazwanyPunkt a = new NazwanyPunkt(3, 5, "las");
        a.show();

        Punkt b = new Punkt(3, 5);
        b.show();

        Punkt c = new NazwanyPunkt(3, 6, "plaza");
        c.show();

        a = (NazwanyPunkt) c;
        a.show();

        Adres adres1= new Adres("Plutonowa","23","11-700","Mrągowo");
        Adres adres2= new Adres("Wojska Polskiego","4G", "9","00-001","Warszawa");
        Adres adres3= new Adres("Długa","19", "1","60-005","Poznań");
        adres1.pokaz();
        adres2.pokaz();
        adres3.pokaz();
        System.out.println(adres1.przed(adres2));
        System.out.println(adres1.przed(adres3));

    }
}