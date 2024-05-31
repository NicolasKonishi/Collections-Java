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
        }
    }
    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!carrinhoList.isEmpty()) {
            for (Item item : carrinhoList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
        }
        return valorTotal;
    }

    public void exibirItens() {
        if (!carrinhoList.isEmpty()) {
            System.out.println(carrinhoList.size());
            System.out.println(this.carrinhoList);
        }
    }

    public static void main(String[] args) {

        CarrinhoDeCompra carrinhoDeCompras = new CarrinhoDeCompra();

        carrinhoDeCompras.adicionarItem("Leite", 2.15d, 3);
        carrinhoDeCompras.adicionarItem("Leite", 2.15d, 3);
        carrinhoDeCompras.adicionarItem("carne", 35d, 1);
        carrinhoDeCompras.adicionarItem("Pão", 1d, 10);

        //antes de remover
        System.out.println("antes de remover");
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Leite");
        System.out.println("-------------------------------------------\n");

        //depois de remover
        System.out.println("depois de remover");
        carrinhoDeCompras.exibirItens();

        System.out.println("-------------------------------------------\n");
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}