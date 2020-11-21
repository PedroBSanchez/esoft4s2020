package pedro_bernardo_sanchez.atividadeAvaliativa2bi.carteira;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CarteiraService {
    
    @Autowired
    private CarteiraRepository repo;


    public void criarCarteira(String tipoDeCarteira)
    {
        repo.save(new Carteira(tipoDeCarteira));
    }
    

    public void save(Carteira carteira) {
        repo.save(carteira);
    }



}
