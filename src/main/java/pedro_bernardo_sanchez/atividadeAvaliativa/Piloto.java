package pedro_bernardo_sanchez.atividadeAvaliativa;

public class Piloto extends Pessoa {

    private Aviao aviao;
    private boolean pilotando;


    public Piloto(String nome, int idade, String sexo, EmpresaDeTransporte empresa) {
        super(nome, idade, sexo, empresa);
        setPilotando(false);
        
    }



    public void pilotar() {
        
        if (pilotando) {
            throw new RuntimeException("Piloto já está em ação");
        }

        getAviao().iniciarViagem();
        setPilotando(true);
    }



    public void setAviao(Aviao aviao) {
        if (aviao.getEmpresa() == this.getEmpresa()) {
            this.aviao = aviao;   
        }
        else {
            throw new RuntimeException("Avião não pertence a mesma empresa que o cliente");
        }
    }

    public Aviao getAviao() {
        return aviao;
    }

    public boolean isPilotando() {
        return pilotando;
    }

    public void setPilotando(boolean pilotando) {
        this.pilotando = pilotando;
    }

    @Override
    public String toString() {
        
        return super.toString() + "\nAvião:\n" + getAviao().toString();
    }


    


}
