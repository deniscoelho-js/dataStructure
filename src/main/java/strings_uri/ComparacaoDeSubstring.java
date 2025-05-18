package strings_uri;

import java.util.HashSet;

public class ComparacaoDeSubstring {

    public void comparaSubstrings(String s1, String s2) {

        HashSet<Character> c1 = new HashSet<>();
        HashSet<Character> commomChars = new HashSet<>();

        for (char c : s1.toCharArray()){
            c1.add(c);
        }

        for (char c : s2.toCharArray()){
            if(c1.contains(c)) {
                commomChars.add(c);
            }
        }

        System.out.println(commomChars);

        System.out.println("A quantidade de letras repetidas são: " + commomChars.size());
    }

    public static void main(String[] args) {
        ComparacaoDeSubstring c = new ComparacaoDeSubstring();

        String st1 = "Hey This java is hot";
        String st2 = "Java is a new paradigm";

        c.comparaSubstrings(st1,st2);
    }
}
