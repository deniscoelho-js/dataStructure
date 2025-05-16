package main;

import java.util.Arrays;

public class RemoveDuplicadosV2 {
    public static int[] removerDuplicatas(int[] array) {
        int tamanho = array.length;
        int[] resultado = new int[tamanho];
        int indice = 0;

        for (int i = 0; i < tamanho; i++) {
            boolean duplicado = false;
            for (int j = 0; j < indice; j++) {
                if (array[i] == resultado[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                resultado[indice++] = array[i];
            }
        }

        return Arrays.copyOf(resultado, indice); // Redimensionando para o tamanho correto
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 2, 4, 5, 1, 6, 7, 5};
        int[] resultado = removerDuplicatas(numeros);

        System.out.println("Array sem duplicatas: " + Arrays.toString(resultado));
    }
}
