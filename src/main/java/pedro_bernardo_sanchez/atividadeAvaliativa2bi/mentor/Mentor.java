package pedro_bernardo_sanchez.atividadeAvaliativa2bi.mentor;

import javax.persistence.Entity;

import net.bytebuddy.asm.Advice.This;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.BaseEntity;

@Entity
public class Mentor extends BaseEntity {
    
    private String nome;
    private int idade;
    private int tempoMentorando;

    public Mentor() {
        super();
    }

    public Mentor(String nome, int idade, int tempoMentorando) {
        this();
        this.nome = nome;
        this.idade = idade;
        this.tempoMentorando = tempoMentorando;

    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public int getTempoMentorando() {
        return tempoMentorando;
    }

}
