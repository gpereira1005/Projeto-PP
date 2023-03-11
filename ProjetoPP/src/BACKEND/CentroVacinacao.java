package BACKEND;

import java.io.Serializable;

public class CentroVacinacao implements Serializable {

    private String codigo;
    private String morada;
    private String localidade;
    private int n_posto_atend;
    private RepositorioVacinas stock_vacina;
    private Marcacoes marcacoes;
    private Gestor gestor;
    private RepositorioDoencas efeitos_sec_registados;
    private int n_max_marcacoes;
    private int vacinas_administradas;

    public CentroVacinacao(String codigo, String morada, String localidade, Gestor gestor) {
        this.codigo = codigo;
        this.morada = morada;
        this.localidade = localidade;
        this.n_posto_atend = 0;
        this.gestor = gestor;
        this.stock_vacina = new RepositorioVacinas();
        this.marcacoes = new Marcacoes();
        this.efeitos_sec_registados = new RepositorioDoencas();
        this.n_max_marcacoes = 0;
        this.vacinas_administradas = 0;
    }

    public CentroVacinacao(String codigo, String morada, String localidade, int n_posto_atend, Gestor gestor, int n_max_marcacoes) {
        this.codigo = codigo;
        this.morada = morada;
        this.localidade = localidade;
        this.n_posto_atend = n_posto_atend;
        this.gestor = gestor;
        this.n_max_marcacoes = n_max_marcacoes;
        this.stock_vacina = new RepositorioVacinas();
        this.marcacoes = new Marcacoes();
        this.efeitos_sec_registados = new RepositorioDoencas();
        this.vacinas_administradas = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMorada() {
        return morada;
    }

    public String getLocalidade() {
        return localidade;
    }

    public int getN_posto_atend() {
        return n_posto_atend;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public int getN_max_marcacoes() {
        return n_max_marcacoes;
    }

    public RepositorioVacinas getStock_vacina() {
        return stock_vacina;
    }

    public Marcacoes getMarcacoes() {
        return marcacoes;
    }

    public RepositorioDoencas getEfeitos_sec_registados() {
        return efeitos_sec_registados;
    }

    public int getVacinas_administradas() {
        return vacinas_administradas;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setN_posto_atend(int n_posto_atend) {
        this.n_posto_atend = n_posto_atend;
    }

    public void setStock_vacina(RepositorioVacinas stock_vacina) {
        this.stock_vacina = stock_vacina;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public void setN_max_marcacoes(int n_max_marcacoes) {
        this.n_max_marcacoes = n_max_marcacoes;
    }

    public void setVacinas_administradas(int vacinas_administradas) {
        this.vacinas_administradas = vacinas_administradas;
    }
}
