package pedro_bernardo_sanchez.atividadeAvaliativa.validacoes;

public class ValidaEmpresaDeTransporte {
    


    public static void validaNome(String nome) {
        if (nome == null || nome.trim().length() <= 1) {
            throw new RuntimeException("Nome da empresa deve ser composto por mais de um caracter");
        }
    }
}
