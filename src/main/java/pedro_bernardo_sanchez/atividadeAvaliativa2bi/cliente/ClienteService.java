package pedro_bernardo_sanchez.atividadeAvaliativa2bi.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository repo;



    public void cadastrarCliente(String nome, int idade, String tipoDeInvestidor, boolean profissional) {
        repo.save(new Cliente(nome, idade, tipoDeInvestidor, profissional));
    }


    

}
