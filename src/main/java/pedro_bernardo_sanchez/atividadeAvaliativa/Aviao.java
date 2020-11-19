package pedro_bernardo_sanchez.atividadeAvaliativa;

import pedro_bernardo_sanchez.atividadeAvaliativa.validacoes.ValidaAviao;

public class Aviao extends MeioDeTransporte{

    private int quantidadeDeTurbinas;

    public Aviao(double valorDaPassagem, int quantidadeDePassageiros, 
                float capacidadeDoTanque, String modelo, int quantidadeDeTurbinas,
                EmpresaDeTransporte empresa) {

        super(valorDaPassagem, quantidadeDePassageiros, capacidadeDoTanque, modelo, empresa);
        setQuantidadeDeTurbinas(quantidadeDeTurbinas);
    }
    

    public void setQuantidadeDeTurbinas(int quantidadeDeTurbinas) {
        ValidaAviao.validaQuantidadeDeTurbinas(quantidadeDeTurbinas);
        this.quantidadeDeTurbinas = quantidadeDeTurbinas;
    }

    public int getQuantidadeDeTurbinas() {
        return quantidadeDeTurbinas;
    }


    @Override
    public void iniciarViagem() {
        
        if (isEmRota()) {
            throw new RuntimeException("Avião já está em rota");
        }

        else if (getCombustivelNoTanque() < getCapacidadeDoTanque()) {
            throw new RuntimeException("Combustível no tanque deve estar cheio para iniciar viagem com avião");
        }

        setEmRota(true);
    }

    @Override
    public String toString() {
        return super.toString() + "\n Quantidade de Turbinas: " + getQuantidadeDeTurbinas();
    }
}
