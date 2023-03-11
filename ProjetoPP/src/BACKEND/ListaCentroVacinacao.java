package BACKEND;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaCentroVacinacao implements Serializable {

    private ArrayList<CentroVacinacao> lista;

    public ListaCentroVacinacao() {
        lista = new ArrayList<>();

    }

    /**
     * Metodo para inserir um centro de vacinaçao na lista de centros de
     * vacinação
     *
     * @param Centro_Vacinacao
     */
    public void inserir(CentroVacinacao Centro_Vacinacao) {
        lista.add(Centro_Vacinacao);

    }

    /**
     * Metodo para remover um centro de vacinaçao da lista de centros de
     * vacinaçao
     *
     * @param Centro_Vacinacao
     */
    public void remover(CentroVacinacao Centro_Vacinacao) {
        lista.remove(Centro_Vacinacao);

    }

    /**
     * Metodo para obter a lista de centros de vacinaçao
     *
     * @return
     */
    public ArrayList<CentroVacinacao> verCentros() {
        return lista;
    }

    /**
     * Metodo para calcular o numero de centros de vacinaçao
     *
     * @return
     */
    public int calcularNumeroCentro_Vacinacao() {
        return lista.size();

    }

    /**
     * Metodo para procurar um centro de vacinaçao pelo seu codigo
     *
     * @param codigo
     * @return
     */
    public CentroVacinacao procurarCentro_Vacinacao(String codigo) {
        for (int i = 0; i < lista.size(); i++) {
            CentroVacinacao e = lista.get(i);
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                return e;
            }
        }
        return null;
    }

    /**
     * Metodo para procurar um centro de vacinação pela sua localidade
     *
     * @param localidade
     * @return
     */
    public CentroVacinacao getCentroPorLocalidade(String localidade) {
        for (int i = 0; i < lista.size(); i++) {
            CentroVacinacao e = lista.get(i);
            if (e.getLocalidade().equalsIgnoreCase(localidade)) {
                return e;
            }
        }
        return null;
    }

    /**
     * Metodo para procurar um centro de vacinação pelo seu Gestor
     *
     * @param gestor
     * @return
     */
    public CentroVacinacao procurarPorGestor(Gestor gestor) {
        for (int i = 0; i < lista.size(); i++) {
            CentroVacinacao e = lista.get(i);
            if (e.getGestor() == gestor) {
                return e;
            }
        }
        return null;
    }

    /**
     * Metodo para listar os gestores que tem um centro de vacinação atribuido
     *
     * @return
     */
    public ArrayList<Gestor> verGestoresComCentro() {
        ArrayList<Gestor> gestores = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            CentroVacinacao e = lista.get(i);
            if (e.getGestor() != null) {
                gestores.add(e.getGestor());
            }
        }
        return gestores;
    }

    /**
     * Metodo para verificar se um centro existe, através da sua localidade
     *
     * @param localidade
     * @return
     */
    public boolean existeCentro(String localidade) {
        for (int i = 0; i < lista.size(); i++) {
            CentroVacinacao e = lista.get(i);
            if (e.getLocalidade().equalsIgnoreCase(localidade)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para verificar se um centro existe, através do seu codigo
     *
     * @param codigo
     * @return
     */
    public boolean existeCentroCod(String codigo) {
        for (int i = 0; i < lista.size(); i++) {
            CentroVacinacao e = lista.get(i);
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }
}
