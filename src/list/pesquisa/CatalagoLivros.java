package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoDePublicacao){
        livroList.add(new Livro(titulo,autor,anoDePublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
       List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> perquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList){
                if (l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.adicionarLivro("Livro1" , "Autor5" , 1999);
        catalagoLivros.adicionarLivro("Livro1" , "Autor1" , 2020);
        catalagoLivros.adicionarLivro("Livro2" , "Autor1" , 2020);
        catalagoLivros.adicionarLivro("Livro2" , "Autor2" , 2022);
        catalagoLivros.adicionarLivro("Livro3" , "Autor3" , 2023);

        System.out.println(catalagoLivros.pesquisarPorAutor("Autor2"));
        System.out.println(catalagoLivros.perquisaPorIntervaloAnos(2020,2022));
        System.out.println(catalagoLivros.pesquisaPorTitulo("Livro1"));
    }
}
