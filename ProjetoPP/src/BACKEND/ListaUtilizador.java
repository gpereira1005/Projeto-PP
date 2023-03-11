package BACKEND;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaUtilizador implements Serializable {

    private ArrayList<Utilizador> lista;

    public ListaUtilizador() {
        lista = new ArrayList<>();

    }

    /**
     * Metodo para inserir um utilizador na lista de utilizadores
     *
     * @param Utilizador
     */
    public void inserir(Utilizador Utilizador) {
        lista.add(Utilizador);
    }

    /**
     * Metodo para remover um utilizador da lista de utilizadore
     *
     * @param Utilizador
     */
    public void remover(Utilizador Utilizador) {
        lista.remove(Utilizador);
    }

    /**
     * Metodo para verificar se um utilizador existe através do seu username
     *
     * @param username
     * @return
     */
    public boolean existe(String username) {
        for (int i = 0; i < lista.size(); i++) {
            Utilizador u = lista.get(i);
            String user = u.getUsername();
            if (user.equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para obter um utilizador através do seu username
     *
     * @param username
     * @return
     */
    public Utilizador getUtilizador(String username) {
        if (existe(username)) {
            for (int i = 0; i < lista.size(); i++) {
                Utilizador u = lista.get(i);
                String user = u.getUsername();
                if (user.equalsIgnoreCase(username)) {
                    return u;
                }
            }
        }
        return null;
    }

    /**
     * Metodo para obter um utilizador através do seu nome
     *
     * @param nome
     * @return
     */
    public Utilizador getUtilizadorNome(String nome) {
        for (int i = 0; i < lista.size(); i++) {
            Utilizador u = lista.get(i);
            String user = u.getNome();
            if (nome.equalsIgnoreCase(user)) {
                return u;
            }
        }
        return null;
    }

    /**
     * Metodo para obter a lista de utilizadores do tipo gestor
     *
     * @return
     */
    public ArrayList<Gestor> getGestores() {
        ArrayList<Gestor> gestores = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            Utilizador u = lista.get(i);
            if (u instanceof Gestor) {
                gestores.add((Gestor) u);
            }
        }
        return gestores;
    }

    /**
     * Metodo para obter a lista de utilizadores do tipo admnistrador
     *
     * @return
     */
    public ArrayList<Administrador> getAdministradores() {
        ArrayList<Administrador> administradores = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            Utilizador u = lista.get(i);
            if (u instanceof Administrador) {
                administradores.add((Administrador) u);
            }
        }
        return administradores;
    }

    /**
     * Metodo para obter a lista de utilizadores do tipo utente
     *
     * @return
     */
    public ArrayList<Utente> getUtentes() {
        ArrayList<Utente> utentes = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            Utilizador u = lista.get(i);
            if (u instanceof Utente) {
                utentes.add((Utente) u);
            }
        }
        return utentes;
    }

    /**
     * Metodo para listar os utentes que pertencem a um determinado centro
     *
     * @param centro
     * @return
     */
    public ArrayList<Utente> procurarPorCentro(CentroVacinacao centro) {
        ArrayList<Utente> utentes = getUtentes();
        ArrayList<Utente> utentes_centro = new ArrayList();
        for (int i = 0; i < utentes.size(); i++) {
            Utente u = utentes.get(i);
            if (u.getCentro_vacinacao().equals(centro)) {
                utentes_centro.add(u);
            }
        }
        return utentes_centro;
    }

}
