package strings_uri;

public class Sub {
    public void maiorSubstringComum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1]; // Matriz para armazenar os comprimentos das substrings
        int maxLength = 0;

        // Preenchendo a tabela de programação dinâmica
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) { // Comparação case-sensitive
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, dp[i][j]); // Atualiza maior substring encontrada
                }
            }
        }

        System.out.println("Tamanho da maior substring comum: " + maxLength);
    }

    public static void main(String[] args) {
        Sub s = new Sub();
        String st1 = "Hey This java is hot";
        String st2 = "Java is a new paradigm";

        s.maiorSubstringComum(st1, st2);
//        System.out.println("Tamanho da maior substring comum: " + resultado);
    }
}
