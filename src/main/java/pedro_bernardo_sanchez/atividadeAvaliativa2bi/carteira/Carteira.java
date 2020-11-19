package pedro_bernardo_sanchez.atividadeAvaliativa2bi.carteira;

import javax.persistence.Entity;

import pedro_bernardo_sanchez.atividadeAvaliativa2bi.BaseEntity;

@Entity
public class Carteira extends BaseEntity {
    
    private String tipoDeCarteira;


    public Carteira() {
        super();
    }

    public Carteira(String tipoDeCarteira) {
        this();
        this.tipoDeCarteira = tipoDeCarteira;
    }


    public String getTipoDeCarteira() {
        return tipoDeCarteira;
    }

}
