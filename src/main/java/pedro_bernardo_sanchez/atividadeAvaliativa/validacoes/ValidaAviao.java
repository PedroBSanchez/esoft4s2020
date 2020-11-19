package pedro_bernardo_sanchez.atividadeAvaliativa.validacoes;

public class ValidaAviao {
    

    public static void validaQuantidadeDeTurbinas(int quantidadeDeTurbinas) {
        if (quantidadeDeTurbinas <= 0) {
            throw new RuntimeException("O avião deve possuir no minímo duas turbinas");
        }
    }

}
