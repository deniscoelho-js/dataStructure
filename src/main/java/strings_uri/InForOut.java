package strings_uri;

public class InForOut {

    public void inForOut(String string){
        int metade = string.length() / 2;
        int tamanhoString = string.length();

        String iniString = string.substring(0, metade);
        String fimString = string.substring(metade, tamanhoString);

        String s1 = new StringBuilder(iniString).reverse().toString();
        String s2 = new StringBuilder(fimString).reverse().toString();

        System.out.println(s1 + s2);
    }

    public static void main(String[] args) {
        InForOut in = new InForOut();
        String txt01 = "I ENIL SIHTHSIREBBIG S";
        String txt02 = "LEVELKAYAK";
        String txt03 = "H YPPAHSYADILO";
        String txt04 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String txt05 = "VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE";
        in.inForOut(txt01);
        in.inForOut(txt02);
        in.inForOut(txt03);
        in.inForOut(txt04);
        in.inForOut(txt05);

    }
}
