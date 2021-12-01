package pl.imiajd.zieba;

public class Skrzypce extends Instrument {

    public Skrzypce(String producent, int rok) {
        super(producent, rok);
    }

    @Override
    public void dzwiek() {
        System.out.println("Dźwięk skrzypiec");
    }
}