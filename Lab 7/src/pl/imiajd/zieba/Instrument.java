package pl.imiajd.zieba;

import java.time.LocalDate;

abstract public class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, int rok){
        this.producent = producent;
        this.rokProdukcji = LocalDate.of(rok, 3 ,13);
    }

    public String getProducent()
    {
        return producent;
    }

    public int getRokProdukcji()
    {
        return rokProdukcji.getYear();
    }

    abstract public void dzwiek();

    public boolean equals(Instrument test){
        if(rokProdukcji.equals(test.rokProdukcji) && producent.equals(test.producent))
            return true;
        return false;
    }

    @Override
    public String toString(){
        String wynik = producent;
        wynik += Integer.toString(rokProdukcji.getYear());
        return wynik;
    }
}
