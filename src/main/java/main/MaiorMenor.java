package main;

import java.util.Arrays;

public class MaiorMenor {
    public static void main(String[] args) {
        int[] array = {1,4,2,6,2,19};

        System.out.println(Arrays.stream(array).max().getAsInt());
        System.out.println(Arrays.stream(array).min().getAsInt());
    }
}
