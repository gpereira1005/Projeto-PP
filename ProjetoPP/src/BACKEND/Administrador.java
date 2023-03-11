package BACKEND;

import java.io.Serializable;

public class Administrador extends Utilizador implements Serializable {

    public Administrador(String username, String nome, String password) {
        super(username, nome, password);
    }

}
