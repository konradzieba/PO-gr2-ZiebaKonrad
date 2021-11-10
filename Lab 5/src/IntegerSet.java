public class IntegerSet {
    private boolean[] tab;

    public IntegerSet(){
        tab = new boolean[100];
    }

    public static IntegerSet union(IntegerSet set1, IntegerSet set2){
        IntegerSet nowa = new IntegerSet();
        for(int i = 0; i<100; i++)
            if(set1.tab[i] || set2.tab[i])
                nowa.tab[i] = true;
        return nowa;
    }

    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2){
        IntegerSet nowa = new IntegerSet();
        for(int i = 0; i<100; i++)
            if(set1.tab[i] && set2.tab[i])
                nowa.tab[i] = true;
        return nowa;
    }

    public void insertElement(int k){
        tab[k-1] = true;
    }

    public void deleteElement(int k){
        tab[k-1] = false;
    }

    @Override
    public String toString(){
        String wynik = "";
        for(int i = 0; i<100; i++)
            if(tab[i])
                wynik += Integer.toString(i+1) + " ";
        if(wynik.length() > 0)
            wynik = wynik.substring(0, wynik.length()-1);
        return wynik;
    }

    public boolean equals(IntegerSet testowana){
        for(int i = 0; i<100; i++)
            if(tab[i] != testowana.tab[i])
                return false;
        return true;
    }
}
