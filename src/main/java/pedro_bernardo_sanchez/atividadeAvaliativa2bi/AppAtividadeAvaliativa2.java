package pedro_bernardo_sanchez.atividadeAvaliativa2bi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.acao.Acao;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.acao.AcaoService;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.fundo.Cambial;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.fundo.Fundo;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.fundo.FundoService;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.fundo.Imobiliario;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.ativo.fundo.Ramo;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.carteira.Carteira;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.carteira.CarteiraService;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.cliente.Cliente;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.cliente.ClienteService;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.empresa.Empresa;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.empresa.EmpresaService;
import pedro_bernardo_sanchez.atividadeAvaliativa2bi.mentor.Mentor;

@SpringBootApplication
public class AppAtividadeAvaliativa2 implements CommandLineRunner{
    
    @Autowired
    private ClienteService clienteService;


    @Autowired
    private EmpresaService empresaService;


    @Autowired
    private AcaoService acaoService;

    @Autowired
    private FundoService fundoService;


    

    public static void main(String[] args) {

      SpringApplication.run(AppAtividadeAvaliativa2.class, args).close();;

    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("oi");
        //Cliente p = new Cliente("Pedro", 19, "Amador", false);
        //p.contratarMentor("marcos", 35, 18);
        //clienteService.cadastrarCliente(p);

        //Carteira c = new Carteira("diversificadateste09");
        //Cliente p = new Cliente("teste09", 25, "Profissional", true, c);
        //c.setCliente(p); 
        //clienteService.cadastrarCliente(p);

        //Empresa e = new Empresa("123456", "Itau");
        //empresaService.cadastarEmpresa(e);

        // Acao a1 = new Acao("ITSF4", 15.5, 2.5, e);
        // Acao a2 = new Acao("IVVB11", 97.5, 2.7, e);
        // acaoService.cadastrarAcao(a2);
      
        
        //Fundo fundoTeste = new Fundo("ABC2", 152.5, 15);
        //fundoService.cadastrarFundo(fundoTeste);
        
        // Atribuindo ramos ao fundo
        Ramo r1 = new Imobiliario(45.5f);
        Ramo r2 = new Cambial("dolar");
        Fundo f = fundoService.atribuirRamoPorSigla("ABC2", r1);
        f = fundoService.atribuirRamoPorSigla("ABC2", r2);





    }
}
