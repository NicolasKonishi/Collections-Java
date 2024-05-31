package set.pesquisa;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void ExibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualiarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.ExibirContato();
        agendaContatos.adicionarContato("Nome1" , 123456);
        agendaContatos.adicionarContato("Nome2" , 432111);
        agendaContatos.adicionarContato("Nome3" , 125656);
        agendaContatos.adicionarContato("Nome4" , 400289);
        agendaContatos.adicionarContato("Nome5" , 125656);
        agendaContatos.ExibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Nome1"));

        System.out.println("Contato atualiado " + agendaContatos.atualiarNumeroContato("Nome1", 222222));
    }
}
