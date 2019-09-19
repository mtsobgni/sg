package fr.meritis.sg;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Service<T> {

    public static final String MAX = "Max of elements";
    public static final String MAX2 = "Second Max of elements";


    public static int max(int [] tab){

        if (tab==null){
            return -1;
        }
        else if(tab.length> 0){
            int result= tab[0];
            for (int i=1; i< tab.length; i++){
                if(result< tab[i]){
                    result= tab[i];
                }
            }
            return result;
        }
        else
            return -1;

    }

    public static HashMap<String, Integer> max2(int [] tab){

        final String MAX = "Max";
        if (tab==null){
            return null;
        }
        else{
            int max;
            int secondGreatest;
            if( tab[0]< tab[1]){
                secondGreatest= tab[0];
                max= tab[1];
            }
            else{
                secondGreatest= tab[1];
                max= tab[0];
            }

            for (int i=2; i< tab.length; i++){
                if(tab[i]> max){
                    secondGreatest = max;
                    max= tab[i];

                }
                else if (tab[i] > secondGreatest){
                    secondGreatest= tab[i];
                }
            }
            HashMap<String, Integer> result = new HashMap<String, Integer>();
            result.put(MAX,max);
            result.put(MAX2, secondGreatest);
            return result;
        }

    }

    public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll) {
        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();

        while (i.hasNext()) {
            T next = i.next();
            if (next.compareTo(candidate) > 0)
                candidate = next;
        }
        return candidate;
    }


}
