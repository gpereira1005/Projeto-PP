package BACKEND;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Marcacoes implements Serializable {

    private HashMap<LocalDateTime, ArrayList<Utente>> marcacoes;
    private HashMap<LocalDateTime, ArrayList<Utente>> faltas;

    public Marcacoes() {
        marcacoes = new HashMap<>();
        faltas = new HashMap<>();
    }

    /**
     * Metodo para marcar uma marcação de um dado utente, para uma determinada
     * data
     *
     * @param data
     * @param utente
     */
    public void marcar(LocalDateTime data, Utente utente) {
        ArrayList<Utente> agendados = marcacoes.get(data);
        if (agendados == null) {
            agendados = new ArrayList<>();
            agendados.add(utente);
            marcacoes.put(data, agendados);
        } else if (!agendados.contains(utente)) {
            agendados.add(utente);
        }
    }

    /**
     * Metodo para cancelar a marcaçao de um dado utente, numa determinada data
     *
     * @param data
     * @param utente
     */
    public void cancelar(LocalDateTime data, Utente utente) {
        ArrayList<Utente> agendados = marcacoes.get(data);
        if (agendados != null && agendados.contains(utente)) {
            agendados.remove(utente);
            marcacoes.replace(data, agendados);
        }
    }

    /**
     * Metodo para verificar se uma marcaçao de um utente existe para uma dada
     * data
     *
     * @param data
     * @param utente
     * @return
     */
    public boolean existe(LocalDateTime data, Utente utente) {
        ArrayList<Utente> agendados = marcacoes.get(data);
        return agendados.contains(utente);
    }

    /**
     * Metodo para ver a data da proxima marcação de um utente
     *
     * @param utente
     * @return
     */
    public LocalDateTime ProxMarcacao(Utente utente) {
        Set<LocalDateTime> datas = marcacoes.keySet();
        for (LocalDateTime data : datas) {
            ArrayList<Utente> utentes = marcacoes.get(data);
            if (utentes.contains(utente)) {
                return data;
            }
        }
        return null;
    }

    /**
     * Metodo para listar os utentes que tem marcaçoes para uma determinada data
     *
     * @param data
     * @return
     */
    public ArrayList<Utente> verMarcacoes(LocalDateTime data) {
        if (marcacoes.containsKey(data)) {
            return marcacoes.get(data);
        } else {
            return new ArrayList<>();
        }
    }

    /**
     * Metodo para listar todos os utentes que tem marcaçoes
     *
     * @return
     */
    public ArrayList<Utente> listaUtentes() {
        ArrayList<Utente> todos = new ArrayList<>();
        ArrayList<LocalDateTime> datas = listarDatas();
        Collections.sort(datas);
        for (LocalDateTime data : datas) {
            ArrayList<Utente> utentes = verMarcacoes(data);
            todos.addAll(utentes);
        }
        return todos;
    }

    /**
     * Metodo para verificar se um determinado utente tem uma marcaçao
     *
     * @param utente
     * @return
     */
    public boolean temMarcacao(Utente utente) {
        return listaUtentes().contains(utente);
    }

    /**
     * Metodo para listar as datas de todas as marcaçoes
     *
     * @return
     */
    public ArrayList<LocalDateTime> listarDatas() {
        Set<LocalDateTime> keySet = marcacoes.keySet();
        ArrayList<LocalDateTime> datas = new ArrayList<>(keySet);
        return datas;
    }

    /**
     * Metodo para listar os dias de todas as marcaçoes
     *
     * @return
     */
    public ArrayList<LocalDate> listarDias() {
        Set<LocalDateTime> keySet = marcacoes.keySet();
        ArrayList<LocalDateTime> datas = new ArrayList<>(keySet);
        ArrayList<LocalDate> dias = new ArrayList<>();
        for (LocalDateTime data : datas) {
            dias.add(data.toLocalDate());
        }
        return dias;
    }

    /**
     * Metodo para listar os utentes com marcaçoes para um dado dia
     *
     * @param dia
     * @return
     */
    public ArrayList<Utente> listarUtentesParaDia(LocalDate dia) {
        Set<LocalDateTime> keySet = marcacoes.keySet();
        ArrayList<LocalDateTime> datas = new ArrayList<>(keySet);
        ArrayList<Utente> lista = new ArrayList<>();
        for (LocalDateTime data : datas) {
            if (data.toLocalDate().equals(dia)) {
                lista.addAll(marcacoes.get(data));
            }
        }
        return lista;
    }

    /**
     * Metodo para calcular o numero de marcacoes para um dia
     *
     * @param dia
     * @return
     */
    public int numMarcaoesPorDia(LocalDate dia) {
        int total = 0;
        Set<LocalDateTime> keySet = marcacoes.keySet();
        ArrayList<LocalDateTime> datas = new ArrayList<>(keySet);
        for (LocalDateTime data : datas) {
            if (data.toLocalDate() == dia) {
                ArrayList<Utente> agendados = marcacoes.get(data);
                if (agendados != null) {
                    total = total + agendados.size();
                }
            }
        }
        return total;
    }

    /**
     * Metodo para ver o numero de marcaçoes para uma determianaa hora
     *
     * @param data
     * @return
     */
    public int numMarcacoesPorHora(LocalDateTime data) {
        ArrayList<Utente> agendados = marcacoes.get(data);
        if (agendados != null) {
            return agendados.size();
        } else {
            return 0;
        }

    }

    /**
     * Metodo para verificar as marcaçoes que já passaram e cujas o utente nao
     * foi
     */
    public void verificarFaltas() {
        Set<LocalDateTime> keySet = marcacoes.keySet();
        ArrayList<LocalDateTime> datas = new ArrayList<>(keySet);
        for (LocalDateTime data : datas) {
            if (data.isBefore(LocalDateTime.now())) {
                ArrayList<Utente> agendados = marcacoes.get(data);
                if (agendados != null) {
                    faltas.put(data, agendados);
                    marcacoes.remove(data);
                }
            }
        }
    }

    /**
     * Metodo para listar as datas em que ocorreram faltas
     *
     * @return
     */
    public ArrayList<LocalDateTime> listarDatasFaltas() {
        Set<LocalDateTime> keySet = faltas.keySet();
        ArrayList<LocalDateTime> datas = new ArrayList<>(keySet);
        return datas;
    }

    /**
     * Metodo para retornar a lista de utentes que faltaram numa dada data
     *
     * @param data
     * @return
     */
    public ArrayList<Utente> verFaltas(LocalDateTime data) {
        return faltas.get(data);
    }

    /**
     * Metodo para retornar a lista de todos os utentes que já faltaram a
     * marcaçoes
     *
     * @return
     */
    public ArrayList<Utente> verUtentesFaltaram() {
        ArrayList<Utente> todos = new ArrayList<>();
        ArrayList<LocalDateTime> datas = listarDatasFaltas();
        Collections.sort(datas);
        for (LocalDateTime data : datas) {
            ArrayList<Utente> utentes = verFaltas(data);
            todos.addAll(utentes);
        }
        return todos;
    }

    /**
     * Metodo para ver a data da ultima falta de um utente
     *
     * @param utente
     * @return
     */
    public LocalDateTime verFalta(Utente utente) {
        Set<LocalDateTime> datas = faltas.keySet();
        for (LocalDateTime data : datas) {
            ArrayList<Utente> utentes = faltas.get(data);
            if (utentes.contains(utente)) {
                return data;
            }
        }
        return null;
    }

}
