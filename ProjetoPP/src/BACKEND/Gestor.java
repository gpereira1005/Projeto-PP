package BACKEND;

import java.io.Serializable;

public class Gestor extends Utilizador implements Serializable {

    public Gestor(String username, String nome, String password) {
        super(username, nome, password);
    }

}
