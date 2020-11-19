package pedro_bernardo_sanchez.aula20200901;

public class validacoes {
    

    public static void excecaoSeMenorOuIgualZero(double valor, String mensagemDeErro) {
        
        if (valor <= 0.00) {
            throw new RuntimeException(mensagemDeErro);
        }

    }



}
