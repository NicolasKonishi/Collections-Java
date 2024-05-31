package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado  c : convidadoSet){
            if(c.getCodigoConvidado() == codigoConvite ){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados");

        conjuntoConvidados.adicionarConvidado("Nome1", 1);
        conjuntoConvidados.adicionarConvidado("Nome2", 2);
        conjuntoConvidados.adicionarConvidado("Nome3", 2);
        conjuntoConvidados.adicionarConvidado("Nome4", 3);
        conjuntoConvidados.adicionarConvidado("Nome5", 4);
        conjuntoConvidados.exirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados");

       conjuntoConvidados.removerConvidado(1);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados");
        conjuntoConvidados.exirConvidados();


    }
}
