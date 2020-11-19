package pedro_bernardo_sanchez.aula20200903.valueobjects;

public class Cnpj {
    

    private String valor;


    public Cnpj (String valor) {
        Validacoes.validaCnpj(valor);
        setValor(valor);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    

}
