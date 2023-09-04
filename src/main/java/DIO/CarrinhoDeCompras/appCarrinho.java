package DIO.CarrinhoDeCompras;

public class appCarrinho {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Bacia", 2, 40.0f);
        carrinhoDeCompras.adicionarItem("copo", 2, 10.0f);
        carrinhoDeCompras.adicionarItem("colher", 3, 10.0f);

        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }
}
