package strings_uri;

import java.util.Arrays;

public class ConcursodeContos {

    public void contos(int[] vt, String conto){
        String[] palavrasSplit = conto.split(" ");
        String[] caracteresSplit = conto.split("");
        int N = vt[0]; // Número de palavras no conto
        int L = vt[1]; // Número máximo de linhas por página
        int C = vt[2]; // Número máximo de caracteres por linha

        int quantidadeDeLinha = caracteresSplit.length / C;
        int linhaResto = caracteresSplit.length % C;

        if (linhaResto <= C){
            linhaResto = 1;
        }

//        System.out.println(quantidadeDeLinha);
//        System.out.println(linhaResto);

        int linhaTotal = quantidadeDeLinha + linhaResto;

        System.out.println(linhaTotal);

//        if (linhaTotal % L == 0){
//            System.out.println("A quantidade mínima de página é: " + linhaTotal);
//        } else {
//            System.out.println("A quantidade mínima de página é: " + linhaTotal + 1);
//        }




//        System.out.println(Arrays.toString(palavrasSplit));
//        System.out.println(Arrays.toString(caracteresSplit));
//        System.out.println(palavrasSplit.length);
//        System.out.println(caracteresSplit.length);

    }

    public static void main(String[] args) {
        ConcursodeContos con = new ConcursodeContos();
        int[] ax = {14,4,20};
        int[] ax2 = {16,3,30};
        String txt = "Se mana Piedade tem casado com Quincas Borba apenas me daria uma esperanca colateral";
        String txt2 = "No dia seguinte entrou a dizer de mim nomes feios e acabou alcunhando me Dom Casmurro";
        con.contos(ax, txt);
        con.contos(ax2, txt2);
    }
}
