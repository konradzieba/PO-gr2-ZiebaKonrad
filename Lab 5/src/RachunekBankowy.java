public class RachunekBankowy {
    static double rocznaStopaProcentowa;
    private double saldo;

    public double obliczMiesieczneOdsetki(){
        double odsetki = (saldo*rocznaStopaProcentowa)/12;
        saldo = saldo + odsetki;
        return saldo;
    }

    public static void setRocznaStopaProcentowa(double nowaStopaProcentowa){
        rocznaStopaProcentowa = nowaStopaProcentowa;
    }

    public RachunekBankowy(double start){
        saldo = start;
    }
}
