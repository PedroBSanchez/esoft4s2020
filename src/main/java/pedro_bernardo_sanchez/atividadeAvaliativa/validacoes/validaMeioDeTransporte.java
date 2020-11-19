/*package pedro_bernardo_sanchez.atividadeAvaliativa.validacoes;

public class ValidaMeioDeTransporte {
    


    public static void validaValorDaPassagem(double valorDaPassagem) {
        if (valorDaPassagem < 0) {
            throw new RuntimeException("Valor da passagem não pode ser negativa");
        }
    }

    public static void validaQuantidadeDePassageiros(int quantidadeDePassageiros) {
        if (quantidadeDePassageiros <= 0) {
            throw new RuntimeException("Quantidade de passageiros não pode ser nula nem negativa");
        }
    }

    public static void validaCapacidadeDoTanque(float capacidadeDoTanque) {
        if (capacidadeDoTanque < 0) {
            throw new RuntimeException("Capacidade do tanque não pode ser nula nem negativa");
        }
    }


    public static void validaModelo(String modelo) {
        if (modelo.trim().length() <= 0) {
            throw new RuntimeException("Modelo deve ser composto por pelo menos um caracter");
        }
    }

    public static void validaCombustivelNoTanque(float combustivelNoTanque, float capacidadeDoTanque) {
        if (combustivelNoTanque <= 0) {
            throw new RuntimeException("Combustível não pode ser negativo nem nulo");
        }

        else if (combustivelNoTanque > capacidadeDoTanque) {
            throw new RuntimeException("Quantidade de combustível excede quantidade suportada");
        }

    }

}
*/