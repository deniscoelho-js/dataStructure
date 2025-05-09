package dataStructure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] numerosArray = new int[]{10, 12, 14, 24};
//
//        int i;
//        for(i = 0; i < numerosArray.length; ++i) {
//            numerosArray[i] = (int)(Math.random() * 100.0);
//        }
//
//        for(i = 0; i < numerosArray.length; ++i) {
//            System.out.println(numerosArray[i]);
//        }rrr

//        int[] num = {1,5,2,4,5,6,2,5,2};
//
//        System.out.println(num.length);


        Scanner myObj = new Scanner(System.in);


        int[] vetor = new int[4];

        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = myObj.nextInt();
        }

        // Compara cada elemento com o último elemento e conta
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[3]) {
                contador++;
            }
        }

        System.out.println(contador);
        myObj.close();
    }
}
