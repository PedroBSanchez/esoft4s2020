package pedro_bernardo_sanchez.aula20200903.valueobjects;


public class Nome {
    
    private String valor;



    public Nome(String valor) {
        
        Validacoes.validaNome(valor);
        setValor(valor);
    }

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
