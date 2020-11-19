package pedro_bernardo_sanchez.atividadeAvaliativa;

import pedro_bernardo_sanchez.atividadeAvaliativa.validacoes.ValidaEmpresaDeTransporte;

public class EmpresaDeTransporte {

    private String razaoSocial;
    private String nome;


    public EmpresaDeTransporte() {
        setRazaoSocial("Transporte");
    }


    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }


    public void setNome(String nome) {
        ValidaEmpresaDeTransporte.validaNome(nome);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public String toString() {
        return "Nome: " + getNome() + " Razão social: " + getRazaoSocial();
    }
    
}
