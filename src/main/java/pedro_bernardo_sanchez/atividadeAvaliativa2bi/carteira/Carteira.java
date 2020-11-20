package pedro_bernardo_sanchez.atividadeAvaliativa2bi.carteira;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import pedro_bernardo_sanchez.atividadeAvaliativa2bi.BaseEntity;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.cliente.Cliente;

@Entity
public class Carteira extends BaseEntity {
    
    private String tipoDeCarteira;



    @OneToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;


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

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
