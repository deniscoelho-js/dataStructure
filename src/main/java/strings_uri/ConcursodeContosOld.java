package strings_uri;

public class ConcursodeContosOld {

    public void contos(int[] vt, String conto){
        int N = vt[0]; // Número de palavras no conto
        int L = vt[1]; // Número máximo de linhas por página
        int C = vt[2]; // Número máximo de caracteres por linha

        String[] palavras = conto.split(" "); // Divide o conto em palavras
        int linhas = 0;
        int caracteresNaLinha = 0;

        for (String palavra : palavras) {
            int tamanhoPalavra = palavra.length();

            // Se a palavra não cabe na linha atual, precisamos iniciar uma nova linha
            if (caracteresNaLinha + tamanhoPalavra > C) {
                linhas++;
                caracteresNaLinha = 0;
            }

            // Adiciona a palavra à linha atual
            caracteresNaLinha += tamanhoPalavra;

            // Adiciona espaço entre palavras (exceto no final da linha)
            if (caracteresNaLinha < C) {
                caracteresNaLinha++;
            }
        }

        // Conta a última linha se tiver palavras nela
        if (caracteresNaLinha > 0) {
            linhas++;
        }

        // Calcula o número de páginas
        int paginas = (int) Math.ceil((double) linhas / L);

        System.out.println("Número mínimo de páginas: " + paginas);

    }

    public static void main(String[] args) {
        ConcursodeContosOld con = new ConcursodeContosOld();
        int[] ax = {14,4,20};
        int[] ax2 = {16,3,30};
        String txt = "Se mana Piedade tem casado com Quincas Borba apenas me daria uma esperanca colateral";
        String txt2 = "No dia seguinte entrou a dizer de mim nomes feios e acabou alcunhando me Dom Casmurro";
        con.contos(ax, txt);
        con.contos(ax2, txt2);
    }
}
