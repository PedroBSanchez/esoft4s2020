package pedro_bernardo_sanchez.aula20201020.modeloOOMercadop;

public class ItemPedido {
 
    private int quantidade;
    private double valorUnitario;
    private Produto produto;


    public ItemPedido(int quantidade, double valorUnitario, Produto produto) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }


    public double getValorTotal() {
        return this.quantidade * this.valorUnitario;
    }

}
