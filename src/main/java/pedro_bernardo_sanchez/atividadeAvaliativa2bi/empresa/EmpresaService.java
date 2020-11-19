package pedro_bernardo_sanchez.atividadeAvaliativa2bi.empresa;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmpresaService {
    
    private EmpresaRepository repo;


    public void cadastarEmpresa(String cnpj, String nome) {
        repo.save(new Empresa(cnpj, nome));
    }

}
