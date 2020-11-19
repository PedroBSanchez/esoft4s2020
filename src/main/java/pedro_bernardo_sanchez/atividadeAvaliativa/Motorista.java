package pedro_bernardo_sanchez.atividadeAvaliativa;


import java.util.ArrayList;
import java.util.List;

public class Motorista extends Pessoa {

    private List<Onibus> frota = new ArrayList<>();
    private boolean dirigindo;




    public Motorista(String nome, int idade, String sexo, EmpresaDeTransporte empresa) {
        super(nome, idade, sexo, empresa);
        setDirigindo(false);
    }




    public void dirigir(Onibus onibus) {
        
        if (isDirigindo()) {
            throw new RuntimeException("Motorista já está dirigindo");
        }

        boolean encontrouOnibusDoMotorista = false;

        for (Onibus e : frota) {
            if (e.equals(onibus)) {
                encontrouOnibusDoMotorista = true;
                break;
            }
        }
        
        if (!encontrouOnibusDoMotorista) {
            throw new RuntimeException("Ônibus do motorista não encontrado");
        }

        onibus.iniciarViagem();
        setDirigindo(true);

    }



    public void addOnibus(Onibus onibus) {
        if (onibus.getEmpresa() == this.getEmpresa()) {
            this.frota.add(onibus);
        }
        else {
            throw new RuntimeException("Ônibus deve pertencer a mesma empresa que o motorista");
        }
    }


    @Override
    public String toString() {
        String onibusDaFrota = "Frota = [";
        for (Onibus e : frota) {
            onibusDaFrota += e.toString() + "\n-------------\n";
        }
        
        return "\n" + super.toString() + "\n#### Frota de ônibus ###\n" + onibusDaFrota + "]";
    }

    
    public void setDirigindo(boolean dirigido) {
        this.dirigindo = dirigido;
    
    }

    public boolean isDirigindo() {
        return dirigindo;
    }

    
}
