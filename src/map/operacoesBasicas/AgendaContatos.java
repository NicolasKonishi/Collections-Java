package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome= agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Nome1", 12345);
        agendaContatos.adicionarContato("Nome2", 22222);
        agendaContatos.adicionarContato("Nome3", 233333);
        agendaContatos.adicionarContato("Nome4", 233333);
        agendaContatos.adicionarContato("Nome5", 233333);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Nome4");
        agendaContatos.exibirContatos();

        System.out.println("O número é " + agendaContatos.pesquisarPorNome("Nome3"));

    }
}
