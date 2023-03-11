package BACKEND;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class RepositorioVacinas implements Serializable {

    private HashMap<Vacina, Long> stock;

    public RepositorioVacinas() {
        stock = new HashMap<>();
    }

    /**
     * Metodo para adicionar uma quantidade de uma dada vacina ao stock
     * @param vacina
     * @param quantidade 
     */
    public void adicionarQtdVacina(Vacina vacina, Long quantidade) {
        if (stock.containsKey(vacina)) {
            Long qtd = stock.get(vacina);
            stock.replace(vacina, qtd + quantidade);
        } else {
            stock.put(vacina, quantidade);

        }
    }

    /**
     * Metodo para verificar a quantidade que existe em stock de uma dada vacina
     *
     * @param vacina
     * @return
     */
    public Long stockDisponivel(Vacina vacina) {
        return stock.get(vacina);
    }
	
	public int num_total(){
		int total = 0;
		Set<Vacina> keySet = stock.keySet();
        ArrayList<Vacina> vacinas = new ArrayList<>(keySet);
		for(Vacina vacina : vacinas){
			total = total + stock.get(vacina);
		}
	}
			

    /**
     * Metodo para remover uma dada quantidade de uma determianda vacina do
     * stock
     *
     * @param vacina
     * @param quantidade
     */
    public void remover(Vacina vacina, Long quantidade) {
        Long qtd_inicial = stock.get(vacina);
        stock.replace(vacina, qtd_inicial - quantidade);
    }

    /**
     * Metodo para verificar se uma vacina existe no stock
     *
     * @param vacina
     * @return
     */
    public boolean existe(Vacina vacina) {
        return stock.containsKey(vacina);
    }

    /**
     * Metodo para listar as vacinas que existem em stock
     *
     * @return
     */
    public ArrayList<Vacina> listarVacinas() {
        Set<Vacina> keySet = stock.keySet();
        ArrayList<Vacina> vacinas = new ArrayList<>(keySet);
        return vacinas;
    }

    /**
     * Metodo para retornar o stock de vacinas
     *
     * @return
     */
    public HashMap<Vacina, Long> getStock() {
        return stock;
    }

}
