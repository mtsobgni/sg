package fr.meritis.sg;

public class App {

    public static void main (String [] args){
        //int[] tab = {1,2,2,4};
        int[] tab = new int[100000000];
        for (int i=0; i<10000000; i++){
            tab[i]= (int)Math.random();
        }
        //int[] tab = null;
        System.out.println(Service.max(tab));
    }
}
