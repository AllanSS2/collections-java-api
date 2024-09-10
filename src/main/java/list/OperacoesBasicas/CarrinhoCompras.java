
package main.java.list.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoCompras {
    private List<Item> carrinhoCompras;

    public CarrinhoCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>(); 
        for(Item i : carrinhoCompras){
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        carrinhoCompras.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0;
        for(Item i : carrinhoCompras){
            total +=i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(carrinhoCompras);
    }
    

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarItem("pao", 3, 2);
        carrinho.adicionarItem("agua", 5, 1);
        carrinho.adicionarItem("sal", 8, 5);

        System.out.println("valor total: " + carrinho.calcularValorTotal());

        carrinho.removerItem("pao");
        System.out.println("valor total: " + carrinho.calcularValorTotal());

        carrinho.exibirItens();
    }
}
