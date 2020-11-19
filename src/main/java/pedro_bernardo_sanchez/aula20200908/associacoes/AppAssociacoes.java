package pedro_bernardo_sanchez.aula20200908.associacoes;

public class AppAssociacoes {
    public static void main(String[] args) {
        
        Pessoa josia = new Pessoa("Josias de Almeida");

        Endereco avBrasil777 = new Endereco("Av. Brasil", "777");

        Endereco avSaoDomingos123 = new Endereco("Av. São Domingos", "123");


        josia.addEndereco(avBrasil777);
        josia.addEndereco(avSaoDomingos123);


    }

}
