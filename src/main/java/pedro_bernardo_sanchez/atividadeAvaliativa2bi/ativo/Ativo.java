package pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo;

import javax.persistence.Entity;

import pedro_bernardo_sanchez.atividadeAvaliativa2bi.BaseEntity;

@Entity
public abstract class Ativo extends BaseEntity{
    
    private String sigla;
    private float valor;

    public Ativo() {
        super();
    }

    public Ativo(String sigla, float valor) {
        this();
        this.sigla = sigla;
        this.valor = valor;
    }


}
