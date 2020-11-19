package pedro_bernardo_sanchez.atividadeAvaliativa;


import pedro_bernardo_sanchez.atividadeAvaliativa.validacoes.ValidaOnibus;

public class Onibus extends MeioDeTransporte{

    private float cilindradas;


    public Onibus(double valorDaPassagem, int quantidadeDePassageiros, 
                float capacidadeDoTanque, String modelo, float cilindradas,
                EmpresaDeTransporte empresa) {

        super(valorDaPassagem, quantidadeDePassageiros, capacidadeDoTanque, modelo, empresa);
        setCilindradas(cilindradas);
    }


    @Override
    public String toString() {
        return super.toString() + "\n Cilindradas: " + getCilindradas();
    }


    public void setCilindradas(float cilindradas) {
        ValidaOnibus.validaCilindradas(cilindradas);
        this.cilindradas = cilindradas;
    }
    
    public float getCilindradas() {
        return cilindradas;
    }
    


}
