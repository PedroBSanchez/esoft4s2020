package pedro_bernardo_sanchez.atividadeAvaliativa.validacoes;

public class ValidaOnibus {
    

    public static void validaCilindradas(float cilindradas) {
        
        if (cilindradas <= 0) {
            throw new RuntimeException("Valor de cilindradas do ônibus não pode ser nula nem negativa");
        }

    }


}
