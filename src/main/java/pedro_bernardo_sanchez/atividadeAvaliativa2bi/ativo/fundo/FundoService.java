package pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.fundo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FundoService {
    
    @Autowired
    private FundoRepository repo;

    public void cadastrarFundo(Fundo fundo) {
        repo.save(fundo);
    }

    public Fundo atribuirRamoPorSigla(String sigla, Ramo novoRamo) {
        Fundo f = repo.findFundoPorSigla(sigla);
        f.assumirRamo(novoRamo);
        repo.save(f);
        return f;

    }

}
