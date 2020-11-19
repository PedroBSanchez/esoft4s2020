package pedro_bernardo_sanchez.aula20200903;

import pedro_bernardo_sanchez.aula20200903.valueobjects.*;

public class Juridica extends Pessoa{

    private NomeFantasia nomeFantasia;
    private Cnpj cnpj;


    public Juridica(String novoNome, String novoNomeFantasia, String novoCnpj) {
        super(novoNome);
        
        this.nomeFantasia = new NomeFantasia(novoNomeFantasia);
        this.cnpj = new Cnpj(novoCnpj);

    }

    
}
