package pl.imiajd.zieba;

public class Fortepian extends Instrument{

    public Fortepian(String producent, int rok){
        super(producent, rok);
    }

    @Override
    public void dzwiek() {
        System.out.println("Dźwięk fortepianu");
    }
}
