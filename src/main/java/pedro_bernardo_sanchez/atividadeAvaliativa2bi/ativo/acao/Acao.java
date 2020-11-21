package pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.acao;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import pedro_bernardo_sanchez.atividadeAvaliativa2bi.BaseEntity;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.empresa.Empresa;

@Entity
public class Acao extends BaseEntity {
    
    private String sigla;
    private double valor;
    private double dividendo;


    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    public Acao() {
        super();
    }

    public Acao(String sigla, double valor, double dividendo, Empresa empresa) {
        this();
        this.sigla = sigla;
        this.valor = valor;
        this.dividendo = dividendo;
        this.empresa = empresa;
    }


	public double getDividendo() {
        return dividendo;
    }
    public Empresa getEmpresa() {
        return empresa;
    }


    @Override
    public String toString() {
        
        return "Sigla: " + this.sigla + "Valor: " + this.valor + "Dividendo: " + this.dividendo + "Empresa: " + this.empresa;
    }
    


}
