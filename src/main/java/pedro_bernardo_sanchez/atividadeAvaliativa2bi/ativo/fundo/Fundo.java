package pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.fundo;

import javax.persistence.Entity;

import pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.Ativo;

@Entity
public class Fundo extends Ativo{
    
    private int tempoDeMercado;
    //Lista de ramo

    public Fundo() {
        super();
    }

    public Fundo(String sigla, float valor, int tempoDeMercado) {
        super(sigla, valor);
        this.tempoDeMercado = tempoDeMercado;
    }
    
    public int getTempoDeMercado() {
        return tempoDeMercado;
    }



}
