package pedro_bernardo_sanchez.atividadeAvaliativa2bi.cliente;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import net.bytebuddy.dynamic.TypeResolutionStrategy.Lazy;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.BaseEntity;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.carteira.Carteira;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.mentor.Mentor;

@Entity
public class Cliente extends BaseEntity{
    
    private String nome;
    private int idade;
    private String tipoDeInvestidor;
    private boolean profissional;


    @OneToOne(mappedBy = "cliente")
    private Carteira carteira;

    @ManyToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Mentor> mentores = new ArrayList<>();



    public Cliente() {
        super();
    }

    public Cliente(String nome, int idade, String tipoDeInvestidor, boolean profissional, Carteira carteira) {
        this();
        this.nome = nome;
        this.idade = idade;

        this.tipoDeInvestidor = tipoDeInvestidor;
        this.profissional = profissional;

        this.carteira = carteira;

    }


    public void contratarMentor(String nome, int idade, int tempoMentorando) {
        this.mentores.add(new Mentor(nome, idade, tempoMentorando));
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
    
    public Carteira getCarteira() {
        return carteira;
    }

}
