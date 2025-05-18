package bests;

public class SentencaDancante {

    public void sentencaDancante(String string) {
        StringBuilder resultado = new StringBuilder();
        boolean maiuscula = true;

        for (int i = 0; i<string.length(); i++){
            char c = string.charAt(i);

            if (Character.isLetter(c)){
                if (maiuscula){
                    resultado.append(Character.toUpperCase(c));
                } else {
                    resultado.append(Character.toLowerCase(c));
                }
                maiuscula = !maiuscula;
            } else {
                resultado.append(c);
            }
        }

        System.out.println(resultado);

    }

    public static void main(String[] args) {
        SentencaDancante s = new SentencaDancante();
        String txt = "This is a dancing sentence";
        String t2 = "sentence";
        s.sentencaDancante(txt);
        s.sentencaDancante(t2);
    }
}
