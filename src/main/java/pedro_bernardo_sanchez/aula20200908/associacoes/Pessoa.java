package pedro_bernardo_sanchez.aula20200908.associacoes;

import java.util.ArrayList;
import java.util.List;


// REFAZER

public class Pessoa {

    private String nome;
    private List<Endereco> enderecos = new ArrayList<>();
    private Endereco enderecoPrincipal;

    
    public Pessoa (String nome) {
        setNome(nome); 
    }



    public void addEndereco(Endereco novo) {
        this.enderecos.add(novo);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {

        String stringEnderecos = "enderecos: ";
        for (Endereco e : this.enderecos) { // Percorre a lista de endereços
            stringEnderecos += e.toString() + ",";
        }
        return "Pessoa -> nome: " + getNome() + stringEnderecos;
    }


    public void setEnderecoPrincipal(Endereco enderecoPrincipal) {
        boolean achouEndereco = false;

        for (Endereco e : this.enderecos) {
            if (e.getLogradouro().equals(enderecoPrincipal.getLogradouro()) && e.getNumero().equals(enderecoPrincipal.getNumero())) {
                achouEndereco = true;
                break;
            }
        }
        if (!achouEndereco) {
            throw new RuntimeException("Endereco informado não consta nos endereços da pessoa");
        }
        this.enderecoPrincipal = enderecoPrincipal;
        
    }


}
