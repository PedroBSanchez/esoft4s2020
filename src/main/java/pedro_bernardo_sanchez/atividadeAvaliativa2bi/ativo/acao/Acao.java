package pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.acao;

import javax.persistence.Entity;

import pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.Ativo;

@Entity
public class Acao extends Ativo {
    
    private float dividendo;




    public Acao(String sigla, float valor, float tempoDeMercado) {
        super(sigla, valor);
        this.dividendo = dividendo;
    }

    public float getDividendo() {
        return dividendo;
    }

}
