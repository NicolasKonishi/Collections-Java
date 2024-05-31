package list.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>( );
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }


    //Teste
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("nome1" , 20, 1.60);
        ordenacaoPessoa.adicionarPessoa("nome2" , 12, 1.20);
        ordenacaoPessoa.adicionarPessoa("nome3" , 26, 1.70);
        ordenacaoPessoa.adicionarPessoa("nome4" , 60, 1.90);
        ordenacaoPessoa.adicionarPessoa("nome5" , 50, 1.56);
        ordenacaoPessoa.adicionarPessoa("nome6" , 32, 1.67);


        System.out.println("Natural: \n" + ordenacaoPessoa.pessoaList);

        System.out.println("\n-------------------------------------------------\n");

        System.out.println("Por Altura: \n" + ordenacaoPessoa.ordenarPorAltura());

        System.out.println("\n-------------------------------------------------\n");

        System.out.println("Por idade: \n" +ordenacaoPessoa.ordenarPorIdade());
    }
}
