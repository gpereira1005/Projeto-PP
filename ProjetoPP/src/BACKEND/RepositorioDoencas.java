package BACKEND;

import java.io.Serializable;
import java.util.ArrayList;

public class RepositorioDoencas implements Serializable {

    private ArrayList<String> doencas;

    public RepositorioDoencas() {
        this.doencas = new ArrayList<>();
    }

    /**
     * Metodo para adicionar uma doença a lista de doenças
     *
     * @param doenca
     */
    public void adicionar(String doenca) {
        doencas.add(doenca);
    }

    /**
     * Metodo para remover uma doença da lista de doenças
     *
     * @param doenca
     */
    public void remover(String doenca) {
        doencas.remove(doenca);
    }

    /**
     * Metodo para verificar se uma doença existe
     *
     * @param doenca
     * @return
     */
    public boolean existeDoenca(String doenca) {
        return doencas.contains(doenca);
    }

    /**
     * Metodo para retornar a quantidade de doenças
     *
     * @return
     */
    public int qtdDoencas() {
        return doencas.size();
    }

    /**
     * Metodo para procurar uma doença na lista de doenças pelo indice
     *
     * @param i
     * @return
     */
    public String procurarDoenca(int i) {
        return doencas.get(i);
    }

    /**
     * Metodo para procurar uma doença na lista de doenças pelo nome
     *
     * @param doenca
     * @return
     */
    public String procurarDoencaNome(String doenca) {
        if (doencas.contains(doenca)) {
            return doenca;
        }
        return null;
    }

    /**
     * Metodo para listar as doenças
     *
     * @return
     */
    public ArrayList<String> listaDoencas() {
        return doencas;
    }
}
