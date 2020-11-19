package pedro_bernardo_sanchez.aula20201027.modeloOOMercado;

import java.util.UUID;

public abstract class Papel {
    private String id;


    public Papel() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

}
