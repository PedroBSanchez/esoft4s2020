package pedro_bernardo_sanchez.atividadeAvaliativa2bi.carteira;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;

import pedro_bernardo_sanchez.atividadeAvaliativa2bi.BaseEntity;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.cliente.Cliente;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.acao.Acao;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.acao.AcaoService;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.fundo.Fundo;

@Entity
public class Carteira extends BaseEntity {
    
    private String tipoDeCarteira;



    @OneToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;

 

    //@OneToMany(fetch = FetchType.EAGER)
    //@JoinColumn(name = "carteira_id")
    //private List<Acao> acoes = new ArrayList<>();
    

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "acao_id")
    private List<Acao> acoes = new ArrayList<>();


    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "fundo_id")
    private List<Fundo> fundos = new ArrayList<>();
    



    public Carteira() {
        super();
    }

    public Carteira(String tipoDeCarteira) {
        this();
        this.tipoDeCarteira = tipoDeCarteira;
    }


    public void adicionarAcao(Acao acao) {
        
        this.acoes.add(acao);
    
    }

    public void adicionarFundo(Fundo fundo){
        this.fundos.add(fundo);
    }

    public String getTipoDeCarteira() {
        return tipoDeCarteira;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
