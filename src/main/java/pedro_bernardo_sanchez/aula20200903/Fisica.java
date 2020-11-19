package pedro_bernardo_sanchez.aula20200903;

import pedro_bernardo_sanchez.aula20200903.valueobjects.Cpf;

public class Fisica extends Pessoa {

    private Cpf cpf;


    public Fisica(String novoNome, String novoCpf) {
        super(novoNome);
        
        this.cpf = new Cpf(novoCpf);

    }
    
}
