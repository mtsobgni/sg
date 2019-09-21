package fr.meritis.sg;

import java.util.*;

public class Service {


    /* Question 1  a basic algorith to determine a max of array
     * */
    public static int max(int [] tab) throws IllegalArgumentException {

            if(tab==null || tab.length==0) {
                throw new IllegalArgumentException("The array is null or, The size of array equal zero");
            }
            int result= tab[0];
            for (int i=1; i < tab.length; i++){
                if(result< tab[i]){
                    result= tab[i];
                }
            }
            return result;
    }

    /* Question 2  Alternative solution to find a greatest Number in Array
     * */
    public static int maxStream(int[] tab) throws IllegalArgumentException{

        if(tab==null || tab.length==0){
           throw new IllegalArgumentException("The array is null or, The size of array equal zero");
        }
        else{
            return  Arrays.stream(tab)
                    .max()
                    .getAsInt();
        }

    }

    /* Question 2  Alternative solution to find a greatest Number in Array
     * */

    public static int maxSort(int [] tab) throws IllegalArgumentException{

        if(tab==null || tab.length==0){
            throw new IllegalArgumentException("The array is null or, The size of array equal zero");
        }
        else{
            Arrays.sort(tab);
            return tab[tab.length-1];
        }
    }
    /* Question 3  algorith to determine the Top 2 Greatest int values from the input array.
     * */
    public static int[] max2(int [] tab) throws IllegalArgumentException{

        if (tab==null || tab.length==0 ){
           throw new IllegalArgumentException("The array is null");
        }
        else{
            int [] result = new int[2];
            if (tab.length==1){
                result[0]=tab[0];
                result[1]= tab[0];
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
                result[0]=max;
                result[1]=secondGreatest;
            }
            return result;
        }
    }

    /* Question 4  a generic function to determine the highest element of Collection
     * */
    public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll){
        return Collections.max(coll);
    }

}
