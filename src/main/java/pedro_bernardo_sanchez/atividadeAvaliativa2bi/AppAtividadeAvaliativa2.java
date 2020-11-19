package pedro_bernardo_sanchez.atividadeAvaliativa2bi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pedro_bernardo_sanchez.atividadeAvaliativa2bi.cliente.ClienteService;

@SpringBootApplication
public class AppAtividadeAvaliativa2 implements CommandLineRunner{
    
    @Autowired
    private ClienteService clienteService;


    public static void main(String[] args) {
        



        SpringApplication.run(AppAtividadeAvaliativa2.class, args).close();;



    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("oi");
        clienteService.cadastrarCliente("Pedro", 19, "Amador", false);

        
    }
}
