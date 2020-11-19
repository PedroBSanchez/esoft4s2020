package pedro_bernardo_sanchez.atividadeAvaliativa2bi.cliente;

import javax.persistence.Entity;

import pedro_bernardo_sanchez.atividadeAvaliativa2bi.BaseEntity;

@Entity
public class Cliente extends BaseEntity{
    
    private String nome;
    private int idade;
    private String tipoDeInvestidor;
    private boolean profissional;



    public Cliente() {
        super();
    }

    public Cliente(String nome, int idade, String tipoDeInvestidor, boolean profissional) {
        this();
        this.nome = nome;
        this.idade = idade;
        this.tipoDeInvestidor = tipoDeInvestidor;
        this.profissional = profissional;

    }


    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getTipoDeInvestidor() {
        return tipoDeInvestidor;
    }
    public boolean isProfissional() {
        return profissional;
    }

}
