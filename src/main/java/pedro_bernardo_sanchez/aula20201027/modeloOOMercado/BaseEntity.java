package pedro_bernardo_sanchez.aula20201027.modeloOOMercado;

import java.util.UUID;

public abstract class BaseEntity {
    private String id;


    public BaseEntity() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

}
