package DIO.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, Integer quantidade, float preco){
        carrinho.add(new Item(nome, quantidade, preco));
    }

    public void removerItem(String nome){
        carrinho.removeIf(item -> item.getNome() == nome);
    }

    public List<Item> exibirItens(){
        return carrinho;
    }

    public float calcularValorTotal(){
        var somaPreco = (float) carrinho.stream().mapToDouble(item ->  item.getPreco() * item.getQuantidade()).sum();
        return somaPreco ;
    }
}
