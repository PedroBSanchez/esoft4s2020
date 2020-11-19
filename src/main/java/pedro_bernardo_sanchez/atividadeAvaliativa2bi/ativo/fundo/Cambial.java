package pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.fundo;

import javax.persistence.Entity;

@Entity
public class Cambial extends Ramo{
    
    private String cambio;


    public Cambial() {
        super();
    }

    public Cambial(String cambio) {
        this();
        this.cambio = cambio;
    }

}
