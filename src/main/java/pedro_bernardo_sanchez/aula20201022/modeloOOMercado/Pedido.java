package pedro_bernardo_sanchez.aula20201022.modeloOOMercado;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pedido extends BaseEntity{

    
    private Pessoa  cliente;
    private Integer numero;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(Integer numero, Pessoa cliente) {
        super();
        if (!cliente.isCliente()) {
            throw new RuntimeException("Pessoa sem o papel de cliente não pode fazer pedido");
        }
        this.numero = numero;
        this.cliente = cliente;

    }


    public double getValorTotal() {
        double valorTotalAux = 0;
        for (ItemPedido item : itens) {
            valorTotalAux += item.getValorTotal();
        }
        return valorTotalAux;
    }

    public void adicionarItem(Produto produto, double quantidade, double valorUnitario) {
        this.itens.add(new ItemPedido(quantidade, valorUnitario, produto));
    }
    
}
