package BACKEND;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema implements Serializable {

    private final ListaUtilizador utilizadores;
    private final ListaCentroVacinacao centros_vacinacao;
    private Utilizador utilizadorLigado;
    private ArrayList<Vacina> vacinas;

    public Sistema() {
        utilizadores = new ListaUtilizador();
        centros_vacinacao = new ListaCentroVacinacao();
        vacinas = new ArrayList<>();
    }

    /**
     * Metodo para retornar a lista de utilizadores do sistema
     *
     * @return
     */
    public ListaUtilizador getUtilizadores() {
        return utilizadores;
    }

    /**
     * Metodo para retornar a lista de centros de vacinaçao do sistema
     *
     * @return
     */
    public ListaCentroVacinacao getCentros_Vacinacao() {
        return centros_vacinacao;
    }

    /**
     * Metodo para retornar o utlizador que está ligado
     *
     * @return
     */
    public Utilizador getUtilizadorLigado() {
        return utilizadorLigado;
    }

    /**
     * Metodo para retornar a lista de vacinas que existem no sistema
     *
     * @return
     */
    public ArrayList<Vacina> getVacinas() {
        return vacinas;
    }

    /**
     * Metodo para autenticar um utilizador
     *
     * @param username
     * @param password
     * @return
     */
    public boolean autenticarUtilizador(String username, String password) {
        if (utilizadores.existe(username)) {
            try {
                Utilizador u = utilizadores.getUtilizador(username);
                if (u.getPassword().equals(password)) {
                    utilizadorLigado = u;
                    return true;
                }
            } catch (Exception e) {
            }
        }
        return false;
    }

    /**
     * Metodo para inicializar os dados do sistema
     */
    public void inicializar() {
        Vacina vacina1 = new Vacina("Pfizer", "01", "Pfizer", 20, 0, 30, 2, 12, 15);
        vacina1.getDoencas().adicionar("Diabtes");
        vacina1.getDoencas().adicionar("HIV");
        getVacinas().add(vacina1);
        Vacina vacina2 = new Vacina("AstraZeneca", "02", "AstraZeneca", 20, 18, 60, 1, 12, 15);
        vacina2.getDoencas().adicionar("Asma");
        vacina2.getDoencas().adicionar("HIV");
        getVacinas().add(vacina2);
        Vacina vacina3 = new Vacina("Moderna", "03", "Moderna", 20, 35, 100, 2, 12, 15);
        vacina3.getDoencas().adicionar("Epilepsia");
        vacina3.getDoencas().adicionar("Tuberculose");
        getVacinas().add(vacina3);
        utilizadores.inserir(new Administrador("a1234", "Administrador", "1234"));
        Gestor g = new Gestor("g1234", "Gestor 1", "1234");
        utilizadores.inserir(g);
        Utente u = new Utente("123456789", "Utente 1", "1234", "Avenida de S.Jose", "Guimaraes", LocalDate.parse("2002-10-05"), 966998214, "utente1@gmail.com");
        utilizadores.inserir(u);
        CentroVacinacao c = new CentroVacinacao("123", "Avenida de S.Joao", "Ponte de Lima", 1, g, 2);
        getCentros_Vacinacao().inserir(c);
        u.setCentro_vacinacao(c);
        System.out.println("Dados iniciados com sucesso");
    }

    /**
     * Metodo para terminar a execuçao do programa
     */
    public void terminar() {
        System.exit(0);
    }

}
