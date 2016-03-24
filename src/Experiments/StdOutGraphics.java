package Experiments;

import java.util.*;

public class StdOutGraphics {



    public static void main(String[] args){

        for(int i = 0; i<=100; i++){
            System.out.print(progressBar(i));

        }




    }


    public static String progressBar(int percentage){
        int i = percentage;
        StringBuilder sb = new StringBuilder();
        int x = i / 2;
        sb.append("|");
        for (int k = 0; k < 50; k++)
            sb.append(((x <= k) ? " " : "="));
        sb.append("|");
        return sb.toString();

    }






}
