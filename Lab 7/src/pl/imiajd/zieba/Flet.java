package pl.imiajd.zieba;

public class Flet extends Instrument{

    public Flet(String producent, int rok){
        super(producent, rok);
    }

    @Override
    public void dzwiek() {
        System.out.println("Dźwięk fletu");
    }
}
