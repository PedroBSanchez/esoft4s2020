package pedro_bernardo_sanchez.aula20201020.modeloOOMercadop;

public class Fisica extends Pessoa{

	private String cpf;

    public Fisica(String nome, String cpf) {
        super(nome);
		this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }    

}
