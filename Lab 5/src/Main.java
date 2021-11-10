public class Main {
    public static void main(String[] args){
        /// zad 1
        RachunekBankowy saver1 = new RachunekBankowy(2000.0);
        RachunekBankowy saver2 = new RachunekBankowy(3000.0);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver2.obliczMiesieczneOdsetki());
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver2.obliczMiesieczneOdsetki());
        //// zad 2
        IntegerSet zbior = new IntegerSet();
        zbior.insertElement(5);
        zbior.insertElement(7);
        zbior.insertElement(10);
        System.out.println(zbior.toString());
    }
}
