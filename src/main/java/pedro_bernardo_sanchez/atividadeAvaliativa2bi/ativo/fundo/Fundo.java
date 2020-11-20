package pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.fundo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

import pedro_bernardo_sanchez.atividadeAvaliativa2bi.BaseEntity;

@Entity
public class Fundo extends BaseEntity{
    
    private String sigla;
    private double valor;
    private int tempoDeMercado;
    
    

    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fundo_id")
    private Set<Ramo> ramos = new HashSet<>();


    public Fundo() {
        super();
    }

    public Fundo(String sigla, double valor, int tempoDeMercado) {
        this();
        this.sigla = sigla;
        this.valor = valor;
        this.tempoDeMercado = tempoDeMercado;
    }
    
    public int getTempoDeMercado() {
        return tempoDeMercado;
    }

	public void assumirRamo(Ramo novoRamo) {
        for (Ramo ramoExistente : ramos) {
            if (ramoExistente.getClass().equals(novoRamo.getClass())) {
                throw new RuntimeException("O fundo já possui este ramo" + "ramo: " + novoRamo.getClass().getSimpleName());
            }
        }
        this.ramos.add(novoRamo);
	}



}
