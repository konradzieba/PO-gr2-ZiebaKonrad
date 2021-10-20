import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.*;

public class Main {

    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc)
    {
        int range = maxWartosc - minWartosc + 1;

        for (int i = 0; i < n; i++) {
            int rand = (int)(Math.random() * range) + minWartosc;
            tab[i] = rand;
        }
    }

    public static void wypisz(int[] tab) {
        for(int i=0; i<tab.length; ++i)
        {
            System.out.print(tab[i] + " ");
        }
    }

    public static int ileNieparzystych(int tab[])
    {
        int suma = 0;
        for(int i=0; i<tab.length; ++i)
        {
            if(abs(tab[i])%2==1) suma+=1;
        }
        return suma;
    }

    public static int ileParzystych(int tab[])
    {
        int suma = 0;
        for(int i=0; i<tab.length; ++i)
        {
            if(abs(tab[i])%2==0) suma+=1;
        }
        return suma;
    }

    public static int ileDodatnich(int tab[])
    {
        int suma = 0;
        for(int i=0; i<tab.length; ++i)
        {
            if(tab[i]>=0) suma+=1;
        }
        return suma;
    }

    public static int ileUjemnych(int tab[])
    {
        int suma = 0;
        for(int i=0; i<tab.length; ++i)
        {
            if(tab[i]<0) suma+=1;
        }
        return suma;
    }

    public static int ileZerowych(int tab[])
    {
        int suma = 0;
        for(int i=0; i<tab.length; ++i)
        {
            if(tab[i]<0) suma+=1;
        }
        return suma;
    }

    public static int ileMaksymalnych(int tab[])
    {
        int max = tab[0];
        for(int i=0; i<tab.length; ++i)
        {
            if(tab[i]>max) max=tab[i];
        }
        int ile = 0;
        for(int i=0; i<tab.length; ++i)
        {
            if(tab[i]==max) ile+=1;
        }
        return ile;
    }

    public static int sumaDodatnich(int tab[])
    {
        int suma=0;
        for(int i=0; i<tab.length; ++i)
        {
            if(tab[i]>=0) suma+=tab[i];
        }
        return suma;
    }
    public static int sumaUjemnych(int tab[])
    {
        int suma=0;
        for(int i=0; i<tab.length; ++i)
        {
            if(tab[i]<0) suma+=abs(tab[i]);
        }
        return suma;
    }

    public static void signum(int tab[])
    {
        for(int i=0; i<tab.length; ++i)
        {
            if(tab[i]>=0) tab[i]=1;
            else tab[i]=-1;
        }
        for(int i=0; i<tab.length;++i)
        {
            System.out.print(tab[i] + " ");
        }
        System.out.print("\n");
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[])
    {
        int max=0;
        int next=0;
        for(int i=0; i<tab.length; ++i)
        {
            if(tab[i]>0) next+=1;
            else
            {
                if(next>max)
                {
                    max = next;
                    next=0;
                }
            }
        }
        if(next>max)
        {
            return next;
        }
        return next;
    }

    public static void odwrocFragment(int tab[], int lewy, int prawy)
    {
        if(lewy<1 || lewy>=tab.length)
        {
            System.out.println("Podaj poprawny lewy");
        }
        if(prawy<1 || lewy>=tab.length)
        {
            System.out.println("Podaj poprawny prawy");
        }

        int tmp=0;
        while(lewy<prawy)
        {
            tmp = tab[lewy];
            tab[lewy] = tab[prawy];
            tab[prawy] = tmp;
            lewy++;
            prawy--;
        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scan.nextInt();
        int[] tab = new int[n];
        int minWartosc = -999, maxWartosc=999;
        generuj(tab,n,minWartosc,maxWartosc);
        wypisz(tab);
        System.out.println("\n" + ileNieparzystych(tab));
        System.out.println(ileParzystych(tab));
        System.out.println(ileDodatnich(tab));
        signum(tab);
    }
}










