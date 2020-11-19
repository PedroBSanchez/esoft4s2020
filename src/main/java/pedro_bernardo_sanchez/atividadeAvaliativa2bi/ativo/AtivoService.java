package pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.acao.Acao;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.fundo.Fundo;

@Service
@Transactional
public class AtivoService {
    
   private AtivoRepository repo;

    public void cadastrarAcao(String sigla, float valor, float dividendo) {
        repo.save(new Acao(sigla, valor, dividendo));
    }

    public void cadastrarFundo(String sigla, float valor, int tempoDeMercado) {
        repo.save(new Fundo(sigla, valor, tempoDeMercado));
    }

}
