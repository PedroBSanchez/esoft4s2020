package pedro_bernardo_sanchez.atividadeAvaliativa;


public class App {

   
    public static void main(String[] args) {
        
        EmpresaDeTransporte garcia = new EmpresaDeTransporte();
        garcia.setNome("Garcia");

        EmpresaDeTransporte emirates = new EmpresaDeTransporte();
        emirates.setNome("Emirates");


        Motorista marcos = new Motorista("Marcos rogério", 25, "Masculino", garcia);
        Piloto pedro = new Piloto("Pedro Sanchez", 27, "Masculino", emirates);


        Onibus mercedes = new Onibus(4.5, 35, 70, "Mercedes c1", 7.8f, garcia);
        Onibus renault = new Onibus(3.5, 20, 65, "Renault t1", 6.5f, garcia);

        Aviao boeing = new Aviao(75.5, 85, 150, "773", 4, emirates);





        marcos.addOnibus(mercedes);
        marcos.addOnibus(renault);

        pedro.setAviao(boeing);


        System.out.println(marcos);
        System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%\n");
        System.out.println(pedro);

        



    }
}