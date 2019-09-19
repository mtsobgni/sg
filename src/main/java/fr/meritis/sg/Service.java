package fr.meritis.sg;

public class Service {

    public static int max(int [] tab){

        if (tab==null){
            return -1;
        }
        else{
            int result= tab[0];
            for (int i=1; i< tab.length; i++){
                if(result< tab[i]){
                    result= tab[i];
                }
            }
            return result;
        }

    }
}
