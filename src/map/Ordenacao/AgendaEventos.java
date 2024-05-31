package map.Ordenacao;

import jdk.jfr.Event;
import map.operacoesBasicas.AgendaContatos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
/*       Set<LocalDate> dateSet = eventosMap.keySet();
       Collection<Evento> values = eventosMap.values(); */


        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
             if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){

                 proximaData = entry.getKey();
                 proximoEvento = entry.getValue();

                 System.out.println("O proximo evento " + proximoEvento + " acontecera na data " + proximaData);
                 break;
             }
        }

    }


    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JULY, 12), "Evento1" ,"Atracao1" );
        agendaEventos.adicionarEvento(LocalDate.of(2024, 5, 31), "Evento2" ,"Atracao2" );
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 23), "Evento3" ,"Atracao3" );
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 1), "Evento4" ,"Atracao4" );

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
}
