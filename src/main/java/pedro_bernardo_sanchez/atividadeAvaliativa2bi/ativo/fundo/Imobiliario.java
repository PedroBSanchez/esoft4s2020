package pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.fundo;

import javax.persistence.Entity;

@Entity
public class Imobiliario extends Ramo {
    
    private float metrosQuadrados;


    public Imobiliario() {
        super();
    }

    public Imobiliario(float metrosQuadrados) {
        this();
        this.metrosQuadrados = metrosQuadrados;
    }

    public float getMetrosQuadrados() {
        return metrosQuadrados;
    }

}
