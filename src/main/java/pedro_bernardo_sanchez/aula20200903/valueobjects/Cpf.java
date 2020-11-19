package pedro_bernardo_sanchez.aula20200903.valueobjects;


public class Cpf {
    
    private String cpf;

    public Cpf(String valor) {
        Validacoes.validaCpf(valor);
        setCpf(valor);

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}

