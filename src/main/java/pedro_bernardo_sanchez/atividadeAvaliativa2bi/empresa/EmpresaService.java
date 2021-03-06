package pedro_bernardo_sanchez.atividadeAvaliativa2bi.empresa;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmpresaService {
    
    @Autowired
    private EmpresaRepository repo;


    public void cadastarEmpresa(Empresa e) {
        repo.save(e);
    }

}
