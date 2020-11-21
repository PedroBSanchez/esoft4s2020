package pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.acao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AcaoService {
    
    @Autowired
    private AcaoRepository repo;

    public void cadastrarAcao(Acao acao) {
        repo.save(acao);
    }

    public AcaoRepository getRepo() {
        return repo;
    }



}
