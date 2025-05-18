package strings_uri;

public class Combinador {

    public void combinador(String s1, String s2) {
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println(s1 + s2);
    }

    public static void main(String[] args) {
        Combinador c = new Combinador();
        String s1 = "Tpo";
        String s2 = "oCder";
        c.combinador(s1, s2);
    }
}
