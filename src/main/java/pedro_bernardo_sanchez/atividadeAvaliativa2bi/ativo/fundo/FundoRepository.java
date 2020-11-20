package pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.fundo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FundoRepository extends JpaRepository<Fundo, String>{
    
    @Query(value = "select f from Fundo f where f.sigla = :sigla")
    Fundo findFundoPorSigla(String sigla);


}
