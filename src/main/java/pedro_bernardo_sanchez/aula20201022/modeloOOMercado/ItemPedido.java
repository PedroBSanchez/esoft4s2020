package pedro_bernardo_sanchez.aula20201022.modeloOOMercado;

public class ItemPedido extends BaseEntity {

    private double quantidade;
    private double valorUnitario;
    private Produto produto;


    public ItemPedido(double quantidade, double valorUnitario, Produto produto) {
        super();
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.produto = produto;
    }


    public Produto getProduto() {
        return produto;
    }
    public double getQuantidade() {
        return quantidade;
    }
    public double getValorUnitario() {
        return valorUnitario;
    }
    public double getValorTotal() {
        return this.quantidade * this.valorUnitario;
    }
}
