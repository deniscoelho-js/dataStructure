package strings_uri;

import java.util.ArrayList;
import java.util.Arrays;

public class RevisaodeContrato {

    public void revisaoContrato(String num, String input) {
        String[] v = input.split("");

        // Convertendo o vetor para uma ArrayList para permitir remoção
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(v));

        // Removendo todas as ocorrências do elemento num
        lista.removeIf(elemento -> elemento.equals(num));

        if(lista.isEmpty() || input.matches("0+")){
            System.out.println("0");
        } else {
            String juncao = String.join("", lista);
            System.out.println(juncao);
        }
    }

    public static void main(String[] args) {
        RevisaodeContrato rv = new RevisaodeContrato();
        String w1 = "5000000";
        String w2 = "123456";
        String w3 = "23454324543423";
        String w4 = "99999999991999999";
        String w5 = "777";
        String w6 = "0";

        rv.revisaoContrato("5", w1);
        rv.revisaoContrato("3", w2);
        rv.revisaoContrato("9", w3);
        rv.revisaoContrato("9", w4);
        rv.revisaoContrato("7", w5);
        rv.revisaoContrato("0", w6);

    }
}
