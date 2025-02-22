package dataStructure;

public class SelectionSort {

    static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int min_idx = i;
            for (int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
    static void printArray(int[] arr){
        for (int val : arr){
            System.out.printf(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {92, 32, 44, 82, 42, 4, 2, 1};

        System.out.println("Array original");
        printArray(arr);

        selectionSort(arr);

        System.out.println("\nArray ordenado");
        printArray(arr);
    }
}
