package pedro_bernardo_sanchez.aula20201020.modeloOOMercadop;

import java.util.ArrayList;
import java.util.List;

public class Pedido {


    private Pessoa pessoa;
    private List<ItemPedido> itens = new ArrayList<>();
    
    public Pedido(Pessoa pessoa, ItemPedido itemPedido) {
        this.pessoa = pessoa;
        this.itens.add(itemPedido);
    }

    public void adicionarItemPedido(ItemPedido item) {
        this.itens.add(item);
    }

    public double getValorTotal() {
        double valorTotal = 0;
        for (ItemPedido item : itens) {
            valorTotal += item.getValorTotal();
        }
        return valorTotal;
    }

}
