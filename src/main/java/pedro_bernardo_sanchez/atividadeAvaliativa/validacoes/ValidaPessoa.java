package pedro_bernardo_sanchez.atividadeAvaliativa.validacoes;

import javax.management.RuntimeErrorException;

public class ValidaPessoa {
    
    public static void validaConstrutorPessoa(String valorNome, int valorIdade, String valorSexo) {

        validaNome(valorNome);
        validaIdade(valorIdade);
        validaSexo(valorSexo);
    }


    public static void validaNome(String valorNome) {
        if (valorNome == null || valorNome.trim().split(" ").length <= 1 || valorNome.trim().length() == 0) {
            throw new RuntimeException("Nome deve ser composto por pelo menos duas palavras");
        }
    }

    public static void validaIdade(int valorIdade) {

        if (valorIdade <= 0) {
            throw new RuntimeException("Idade não pode ser nula ou negativa");
        }

        else if (valorIdade < 21) {
            throw new RuntimeException("Idade deve ser de pelo menos 21 anos para ser piloto ou motorista");
        }
    }


    public static void validaSexo(String valorSexo) {
        
        boolean masculino = valorSexo.toUpperCase().trim().equals("MASCULINO");
        boolean feminino = valorSexo.toUpperCase().trim().equals("FEMININO");
        boolean outros = valorSexo.toUpperCase().trim().equals("OUTROS");

        if (valorSexo.trim().split(" ").length != 1 || (!masculino && !feminino && !outros)) {
            throw new RuntimeException("Sexo só pode ser masculino, feimino ou outros");
        }

    }
}
