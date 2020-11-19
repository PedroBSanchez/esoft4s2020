package pedro_bernardo_sanchez.aula20200820;

public class Carro {

    private boolean ligado = false;
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
