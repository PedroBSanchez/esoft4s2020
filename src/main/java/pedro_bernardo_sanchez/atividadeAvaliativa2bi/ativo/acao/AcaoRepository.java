package pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.acao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AcaoRepository extends JpaRepository<Acao, String>{
    
    @Query(value = "select f from Acao f where f.sigla = :sigla")
    Acao findAcaoPorSigla(String sigla);

    @Query(value = "select max(valor) from Acao")
    Acao findAcaoMaiorValor();
    

}
