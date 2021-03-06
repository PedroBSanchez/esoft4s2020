package pedro_bernardo_sanchez.atividadeAvaliativa2bi.empresa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import pedro_bernardo_sanchez.atividadeAvaliativa2bi.BaseEntity;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.acao.Acao;

@Entity
public class Empresa extends BaseEntity{
    
    private String cnpj;
    private String nome;

    


    public Empresa() {
        super();
    }

    public Empresa(String cnpj, String nome) {
        this();
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }
    public String getNome() {
        return nome;
    }

}
