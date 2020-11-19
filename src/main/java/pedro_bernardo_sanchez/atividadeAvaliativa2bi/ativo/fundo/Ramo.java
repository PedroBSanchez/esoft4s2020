package pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.fundo;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import pedro_bernardo_sanchez.atividadeAvaliativa2bi.BaseEntity;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Ramo extends BaseEntity{
    
    public Ramo() {
        super();
    }

    
}
