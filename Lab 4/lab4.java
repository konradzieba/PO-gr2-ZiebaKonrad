

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i<a.size(); i++)
            newArray.add(a.get(i));

        for(int j = 0; j<b.size(); j++)
            newArray.add(b.get(j));

        return newArray;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        if(a.size() < b.size()) {
            for(int i = 0; i<a.size(); i++){
                newArray.add(a.get(i));
                newArray.add(b.get(i));
            }
            for(int i = a.size(); i<b.size(); i++)
                newArray.add(b.get(i));
        }
        else{
            for(int i = 0; i<b.size(); i++){
                newArray.add(a.get(i));
                newArray.add(b.get(i));
            }
            for(int i = b.size(); i<a.size(); i++)
                newArray.add(a.get(i));
        }

        return newArray;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int min1 = 0;
        int pos1 = 0;
        int min2 = 0;
        int pos2 = 0;
        int iterator=0;
        boolean[] a_empty = new boolean[a.size()];
        boolean[] b_empty = new boolean[b.size()];
        for(int i = 0; i<a.size(); i++)
            a_empty[i] = false;
        for(int i = 0; i<b.size(); i++)
            b_empty[i] = false;

        int a_ite = a.size();
        int b_ite = b.size();
        while(a_ite > 0 && b_ite > 0){
            iterator = 0;
            while(a_empty[iterator])
                iterator++;
            min1 = a.get(iterator);
            pos1 = iterator;
            for(int i = 0; i<a.size(); i++){
                if(a.get(i) < min1 && !a_empty[i]){
                    min1 = a.get(i);
                    pos1 = i;
                }
            }
            iterator = 0;
            while(b_empty[iterator])
                iterator++;
            min2 = b.get(iterator);
            pos2 = iterator;
            for(int i = 0; i<b.size(); i++){
                if(b.get(i) < min2 && !b_empty[i]){
                    min2 = b.get(i);
                    pos2 = i;
                }
            }
            if(min2 > min1){
                a_empty[pos1] = true;
                a_ite--;
                newArray.add(min1);
            }
            else{
                b_empty[pos2] = true;
                b_ite--;
                newArray.add(min2);
            }
        }
        while(a_ite > 0){
            iterator = 0;
            while(a_empty[iterator])
                iterator++;
            min1 = a.get(iterator);
            pos1 = iterator;
            for(int i = 0; i<a.size(); i++){
                if(a.get(i) < min1 && !a_empty[i]){
                    min1 = a.get(i);
                    pos1 = i;
                }
            }
            a_empty[pos1] = true;
            a_ite--;
            newArray.add(min1);
        }
        while(b_ite > 0){
            iterator = 0;
            while(b_empty[iterator])
                iterator++;
            min2 = b.get(iterator);
            pos2 = iterator;
            for(int i = 0; i<b.size(); i++){
                if(b.get(i) < min2 && !b_empty[i]){
                    min2 = b.get(i);
                    pos2 = i;
                }
            }
            b_empty[pos2] = true;
            b_ite--;
            newArray.add(min2);
        }

        return newArray;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a)
    {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i<a.size(); i++) {
            newArray.add(a.get(a.size() - i - 1));
        }
        return newArray;
    }

    public static void reverse(ArrayList<Integer> a)
    {
        for (int i = 0, j = a.size() - 1; i < j; i++) {
            a.add(i, a.remove(j));
        }
    }


    public static void main(String[] args){
        ///zad1
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,4,9,16));
        ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(9,7,4,9,11));
        System.out.println(a);
        System.out.println(b);
        ArrayList<Integer> test = append(a, b);
        System.out.println(test);
        ///zad2
        ArrayList<Integer> test2 = merge(a, b);
        System.out.println(test2);
        //zad3
        ArrayList<Integer> test3 = mergeSorted(a, b);
        System.out.println(test3);
        //zad4
        ArrayList<Integer> test4 = reversed(a);
        System.out.println(test4);
        ///zad5
        System.out.println(a);
        reverse(a);
        //System.out.println(a);
    }
}
