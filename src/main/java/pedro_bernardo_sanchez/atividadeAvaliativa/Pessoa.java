package pedro_bernardo_sanchez.atividadeAvaliativa;

import pedro_bernardo_sanchez.atividadeAvaliativa.validacoes.ValidaPessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private EmpresaDeTransporte empresa;
    

    public Pessoa(String nome, int idade, String sexo, EmpresaDeTransporte empresa) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setEmpresa(empresa);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " Idade: " + getIdade() + " Sexo: " + getSexo() + " Empresa: " + empresa.getNome();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //ValidaPessoa.validaNome(nome);
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        //ValidaPessoa.validaIdade(idade);
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        //ValidaPessoa.validaSexo(sexo);
        this.sexo = sexo;
    }

    public void setEmpresa(EmpresaDeTransporte empresa) {
        this.empresa = empresa;
    }

    public EmpresaDeTransporte getEmpresa() {
        return empresa;
    }

    

    




}
