package lab9;

import java.util.ArrayList;

public class ArrayUtil
{
    public static <T extends Comparable<? super T>> boolean isSorted(T tab[])
    {
        boolean temp = true;

        for(int i = 1; i<tab.length; i++)
        {
            if(tab[i].compareTo(tab[i-1]) < 0)
            {
                temp = false;
            }
        }
        return temp;
    }

    public static <T extends Comparable<? super T>> int binSearch(T tab[], T element)
    {
        int x = 0;
        int y = tab.length-1;
        int index;
        int result;

        while(x<=y)
        {
            index = (x+y)/2;
            result = tab[index].compareTo(element);
            if(result > 0)
            {
                y = index-1;
            }
            if(result < 0)
            {
                x = index+1;
            }
            if(result == 0)
            {
                return index;
            }
        }
        return -1;
    }

    public static <T extends Comparable<? super T>> void selectionSort(T tab[])
    {
        int index = 0;
        T min, temp;
        int min_index;

        for (int i = 0; i < tab.length; i++)
        {
            min = tab[index];
            min_index = index;
            for (int j = index + 1; j < tab.length; j++)
            {
                if (tab[j].compareTo(min) < 0)
                {
                    min = tab[j];
                    min_index = j;
                }
            }
            temp = tab[index];
            tab[index] = min;
            tab[min_index] = temp;
            index++;
        }
    }

    public static <T extends Comparable<? super T>>  void mergeSort(ArrayList<T> tab){
        if (tab.size() > 1) {
            ArrayList<T> l = new ArrayList<>();
            ArrayList<T> r = new ArrayList<>();
            boolean temp = true;
            while (!tab.isEmpty()) {
                if (temp) {
                    l.add(tab.remove(0));
                } else {
                    r.add(tab.remove(tab.size()/2));
                }
                temp = !temp;
            }
            mergeSort(l);
            mergeSort(r);
            while (!l.isEmpty() && !r.isEmpty()) {
                if(l.get(0).compareTo(r.get(0)) <= 0){
                    tab.add(l.remove(0));
                }
                else {
                    tab.add(r.remove(0));
                }
            }
            if(!l.isEmpty()){
                tab.addAll(l);
            }
            else if (!r.isEmpty()){
                tab.addAll(r);
            }
        }
    }
}
