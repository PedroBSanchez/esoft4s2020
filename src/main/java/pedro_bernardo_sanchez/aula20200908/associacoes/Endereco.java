package pedro_bernardo_sanchez.aula20200908.associacoes;

public class Endereco {

    private String logradouro;
    private String numero;

    public Endereco (String logradouro, String numero) {
        setLogradouro(logradouro);
        setNumero(numero);
    }


    public String getLogradouro() {
        return logradouro;
    }
    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }



    @Override
    public String toString() {
        return "Endereço: " + getLogradouro() + getNumero();

    }

}
