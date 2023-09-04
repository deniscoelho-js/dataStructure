package dataStructure;

public class Main {
    public static void main(String[] args) {
        int[] numerosArray = new int[]{10, 12, 14, 24};

        int i;
        for(i = 0; i < numerosArray.length; ++i) {
            numerosArray[i] = (int)(Math.random() * 100.0);
        }

        for(i = 0; i < numerosArray.length; ++i) {
            System.out.println(numerosArray[i]);
        }
    }
}
