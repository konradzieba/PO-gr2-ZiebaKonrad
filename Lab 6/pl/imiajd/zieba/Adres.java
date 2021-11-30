package pl.imiajd.zieba;

public class Adres {
    private String ulica;
    private String numer_domu;
    private String numer_mieszkania="";
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, String numer_domu, String kod_pocztowy, String miasto){
        this.ulica=ulica;
        this.numer_domu=numer_domu;
        this.kod_pocztowy=kod_pocztowy;
        this.miasto=miasto;
    }
    public Adres(String ulica, String numer_domu, String numer_mieszkania, String kod_pocztowy, String miasto){
        this.ulica=ulica;
        this.numer_domu=numer_domu;
        this.numer_mieszkania=numer_mieszkania;
        this.kod_pocztowy=kod_pocztowy;
        this.miasto=miasto;
    }
    public void pokaz(){
        System.out.println(this.kod_pocztowy + " " + this.miasto);
        System.out.print(this.ulica + " " + this.numer_domu);
        if(!this.numer_mieszkania.equals("")){
            System.out.print("/" + this.numer_mieszkania);
        }
        System.out.println();
    }

    public boolean przed(Adres kod_do_porownania){
        int[] tab={0,1,3,4,5};
        StringBuilder kod_pierwszy= new StringBuilder();
        StringBuilder kod_porownywany= new StringBuilder();
        for(int i : tab){
            kod_pierwszy.append(kod_do_porownania.kod_pocztowy.charAt(i));
            kod_porownywany.append(this.kod_pocztowy.charAt(i));
        }
        int pierwszy=Integer.parseInt(kod_pierwszy.toString());
        int drugi=Integer.parseInt(kod_porownywany.toString());

        return pierwszy<drugi;
    }
    }

