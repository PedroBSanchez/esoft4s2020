package pedro_bernardo_sanchez.atividadeAvaliativa;

import pedro_bernardo_sanchez.atividadeAvaliativa.validacoes.*;

public class MeioDeTransporte {

    private double valorDaPassagem;
    private int quantidadeDePassageiros;
    private float capacidadeDoTanque;
    private float combustivelNoTanque; // ao instanciar será o mesmo da capacidade
    private boolean emRota; //Atributo que define se está em transporte, ao instanciar será false
    private String modelo;
    private EmpresaDeTransporte empresa;

    


    public MeioDeTransporte(double valorDaPassagem, int quantidadeDePassageiros, 
                            float capacidadeDoTanque, String modelo, 
                            EmpresaDeTransporte empresa) {
       
        setValorDaPassagem(valorDaPassagem);
        setQuantidadeDePassageiros(quantidadeDePassageiros);
        setCapacidadeDoTanque(capacidadeDoTanque);
        setCombustivelNoTanque(getCapacidadeDoTanque()); //O tanque de combustível começa cheio
        setEmRota(false);
        setModelo(modelo);
        setEmpresa(empresa);


    }

    



    public void iniciarViagem() {
        if (emRota) {
            throw new RuntimeException("Meio de transporte já está em rota");
        }
        if (combustivelNoTanque < capacidadeDoTanque / 2) {
            throw new RuntimeException("Necessário pelo menos 50% de combustível para iniciar a viagem");
        }
        setEmRota(true);
    }

    public void pararViagem() {
        if (!emRota) {
            throw new RuntimeException("Meio de trasnporte não está em rota");
        }
        setEmRota(false);
    }




    @Override
    public String toString() {
    
        return  "\n Modelo: " + getModelo() +
                "\n Valor da passagem: " + getValorDaPassagem() + 
                "\n Quantidade de passageiros: " + getQuantidadeDePassageiros() +
                "\n Capacidade no tanque: " + getCapacidadeDoTanque() +
                "\n Combustível no tanque: " + getCombustivelNoTanque() +
                "\n Em Rota: " + isEmRota();
    }




    
    public double getValorDaPassagem() {
        return valorDaPassagem;
    }

    public void setValorDaPassagem(double valorDaPassagem) {
        //ValidaMeioDeTransporte.validaValorDaPassagem(valorDaPassagem);
        this.valorDaPassagem = valorDaPassagem;
    }

    public int getQuantidadeDePassageiros() {
        return quantidadeDePassageiros;
    }

    public void setQuantidadeDePassageiros(int quantidadeDePassageiros) {
        //ValidaMeioDeTransporte.validaQuantidadeDePassageiros(quantidadeDePassageiros);
        this.quantidadeDePassageiros = quantidadeDePassageiros;
    }

    public void setCapacidadeDoTanque(float capacidadeDoTanque) {
        //ValidaMeioDeTransporte.validaCapacidadeDoTanque(capacidadeDoTanque);
        this.capacidadeDoTanque = capacidadeDoTanque;
    }
    
    public float getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public float getCombustivelNoTanque() {
        return combustivelNoTanque;
    }

    public void setCombustivelNoTanque(float combustivelNoTanque) {
        //ValidaMeioDeTransporte.validaCombustivelNoTanque(combustivelNoTanque, getCapacidadeDoTanque());
        this.combustivelNoTanque = combustivelNoTanque;
    }

    public void setEmRota(boolean emRota) {
        this.emRota = emRota;
    }

    public boolean isEmRota() {
        return emRota;
    }

    public void setModelo(String modelo) {
        //ValidaMeioDeTransporte.validaModelo(modelo);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setEmpresa(EmpresaDeTransporte empresa) {
        this.empresa = empresa;
    }

    public EmpresaDeTransporte getEmpresa() {
        return empresa;
    }

  





    



}
