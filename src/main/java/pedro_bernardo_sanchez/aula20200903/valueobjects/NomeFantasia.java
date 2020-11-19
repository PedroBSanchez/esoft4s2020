package pedro_bernardo_sanchez.aula20200903.valueobjects;


public class NomeFantasia {
    
    private String valor;

    public NomeFantasia(String valor) {
        Validacoes.validaNomeFantasia(valor);
        setValor(valor);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }


}
