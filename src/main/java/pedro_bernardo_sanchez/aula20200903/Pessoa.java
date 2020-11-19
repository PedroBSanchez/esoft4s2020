package pedro_bernardo_sanchez.aula20200903;

import aula20200903.valueObjects.Nome;

public class Pessoa {
    
    private Nome nome;


    public Pessoa (String novoNome) {
        nome = new Nome(novoNome);
    }


	public Nome getNome() {
		return nome;
	}


	public void setNome(Nome nome) {
		this.nome = nome;
	}





    
}

