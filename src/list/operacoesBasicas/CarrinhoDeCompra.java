package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> carrinhoList;
    public CarrinhoDeCompra() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.carrinhoList.add(item);
    }
    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinhoList.isEmpty()) {
            for (Item i : carrinhoList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            carrinhoList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!carrinhoList.isEmpty()) {
            for (Item item : carrinhoList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
//    public double calcularValorTotal() {
//        double valorTotal = 0d;
//            for (Item item : carrinhoList) {
//                double valorItem = item.getPreco() * item.getQuantidade();
//                valorTotal += valorItem;
//            }
//            return valorTotal;
//    }

    public void exibirItens() {
        if (!carrinhoList.isEmpty()) {
            System.out.println(this.carrinhoList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + carrinhoList +
                '}';
    }

    public static void main(String[] args) {

        CarrinhoDeCompra carrinhoDeCompras = new CarrinhoDeCompra();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        carrinhoDeCompras.exibirItens();


        carrinhoDeCompras.removerItem("Lápis");


        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}