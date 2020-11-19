package pedro_bernardo_sanchez.aula20201022.modeloOOMercado;

import java.util.UUID;

public class BaseEntity {
    private String id;

    public BaseEntity () {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

}
