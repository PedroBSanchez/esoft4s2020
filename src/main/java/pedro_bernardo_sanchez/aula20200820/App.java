package pedro_bernardo_sanchez.aula20200820;

public class App {

    public static void main(String[] args) {

        

        Carro fusca = new Carro();
        Carro fiat147 = new Carro();
        fusca.ligar();
        fusca.desliga();
        fiat147.ligar();

        System.out.println("Fusca está ligado? " + fusca.isLigado());

        System.out.println("O fiat 147 está ligado? " + fiat147.isLigado());

    }

}