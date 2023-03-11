/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRONTEND;

import BACKEND.Sistema;
import BACKEND.Serializacao;
import java.io.Serializable;

public class Piloto implements Serializable {

    public static void main(String[] args) {

        Sistema sistema;
        Serializacao dados = new Serializacao("Dados");
        if (!dados.getFicheiro().exists()) {
            sistema = new Sistema();
            sistema.inicializar();
        } else {
            sistema = dados.carregar();
            System.out.println("Dados carregados");
        }
        JanelaLogin janela = new JanelaLogin(sistema, dados);
        janela.setVisible(true);
    }

}
