package pedro_bernardo_sanchez.atividadeAvaliativa2bi.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pedro_bernardo_sanchez.atividadeAvaliativa2bi.carteira.CarteiraRepository;


@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepo;

    @Autowired
    private CarteiraRepository carteiraRepo;


    public void cadastrarCliente(Cliente cliente) {

        cliente.getCarteira().setCliente(cliente);
        clienteRepo.save(cliente);
        carteiraRepo.save(cliente.getCarteira());
    }


    

}
