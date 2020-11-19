package pedro_bernardo_sanchez.aula20201020.modeloOOMercadop;

public class Cliente extends Papel {

	private double desconto;
    private double limiteDeCrédito;

    public Cliente(double desconto, double limiteDeCrédito) {
        super();
        this.desconto = desconto;
        this.limiteDeCrédito = limiteDeCrédito;
    }
    
    public double getDesconto() {
        return desconto;
    }

    public double getLimiteDeCrédito() {
        return limiteDeCrédito;
    }

}
