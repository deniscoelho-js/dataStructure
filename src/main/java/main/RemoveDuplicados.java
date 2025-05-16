package main;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicados {

    public void removeRepetidos(Integer[] vetor){
        LinkedHashSet<Integer> vet = new LinkedHashSet<>(Arrays.asList(vetor));

        vet.toArray(vet.toArray(new Integer[0]));
        System.out.println(vet);
    }
    public static void main(String[] args) {
        RemoveDuplicados r = new RemoveDuplicados();
        Integer[] vet = {1,4,2,5,6,1,3,6,2,5,7,8,2,1,3,4,5,6,7,8};
        r.removeRepetidos(vet);
    }
}
