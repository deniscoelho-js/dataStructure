package strings_uri;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Criptografia {

    public void transformarVetor(String input){
        String[] v = input.split("");

        for (int i = 0; i < v.length; i++) {
            char c = v[i].charAt(0);
            if(Character.isLetter(c)){
                c+=3;
                v[i]=String.valueOf(c);
            }
        }

        for (int i = 0; i < v.length / 2; i++){
            String aux = v[i];
            v[i] = v[v.length -1 - i];
            v[v.length - 1 - i] = aux;
        }

        for (int i = v.length / 2; i < v.length ; i++){
            char c = v[i].charAt(0);
            v[i] = String.valueOf((char) (c - 1));
        }

        System.out.println(Arrays.toString(v));
    }

    public static void main(String[] args) {
        Criptografia aux = new Criptografia();
        String word = "Texto #3";
        String w2 = "abcABC1";
        String w3 = "vxpdylY .ph";
        String w4 = "vv.xwfxo.fd";
        aux.transformarVetor(word);
        aux.transformarVetor(w2);
        aux.transformarVetor(w3);
        aux.transformarVetor(w4);

    }
}
