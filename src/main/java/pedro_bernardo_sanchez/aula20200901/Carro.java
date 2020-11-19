package pedro_bernardo_sanchez.aula20200901;

public class Carro {

    private boolean ligado = false;
    private double combustivelNoTanqueLitros = 40.0;
    private DecimalPositivo capacidadeDoTanqueLitros;

    public Carro(double capacidadeDoTanqueLitros) {

       this.capacidadeDoTanqueLitros = new DecimalPositivo(capacidadeDoTanqueLitros, "A capacidade do tanque deve ser maior que 0.00!");


    }

    public void abastecer(double volumeAbastecidoEmLitros) {
        validacoes.excecaoSeMenorOuIgualZero(volumeAbastecidoEmLitros, "O volume abastecido deve ser maior que 0.00!");

        if (capacidadeDoTanqueLitros.getValor() < combustivelNoTanqueLitros + volumeAbastecidoEmLitros) {

            throw new RuntimeException("O tanque só comporta " + capacidadeDoTanqueLitros.getValor() 
            + " Abastecimento excessivo: " + (volumeAbastecidoEmLitros + combustivelNoTanqueLitros));
        }


    }




    public void ligar() { // Métodos modificador
        this.ligado = true;
    }

    public void desliga() {
        this.ligado = false;

    }

    public boolean isLigado() {
        return this.ligado;
    }

}
