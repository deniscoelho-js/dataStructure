package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class m001 {
    public static void main(String[] args) {
        int[] vet = {1,2,4,5,3};

       for (int i = 0; i < vet.length; i++){
           if (vet[i] == 2){
               vet[i] = 12;
           }
       }

        System.out.println(Arrays.toString(vet));
    }
}
