package fr.meritis.sg;

import java.util.*;

public class App {

    public static void main (String [] args){

       int[] tab = {34,34,67,4,6,8,-1,6,12,56,34};

        System.out.println(Service.max(tab));
        System.out.println(Service.maxSort(tab));
        System.out.println(Service.maxStream(tab));

        int [] result= Service.max2(tab);
        for (int i: result
             ) {
            System.out.println(i);
        }


        Deque<Double> deque =  new ArrayDeque<>();

        deque.add(11.0);
        deque.add(21.0);
        deque.add(15.0);
        List<Integer> test =  Arrays.asList(1,11,2,3,4,9);
        List<String> test1 =  Arrays.asList("er", "hdht", "jdh","tet");

        System.out.println(Service.max(deque));
        System.out.println(Service.max(test));
        System.out.println(Service.max(test1));
        System.out.println(Service.max(tab));
    }

}
