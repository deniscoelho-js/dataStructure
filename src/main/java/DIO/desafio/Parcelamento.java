package DIO.desafio;

public class Parcelamento {
    public static void main(String[] args) {



        double valorTotal = 1000.00;
        int numeroParcelas = 4;

        if(valorTotal > numeroParcelas){
            System.out.printf("Parcela: %.2f ", (valorTotal / numeroParcelas));
        } else
            System.out.println("Parcelamento nao e possivel");
    }
}
