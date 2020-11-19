package pedro_bernardo_sanchez.aula20200910;

import java.util.*;

public class AppColecoes {
    
    public static void main(String[] args) {
        List lista = new ArrayList<>();
        //List lista = new LinkedList<>();

        lista.add(new Date());
        lista.add(10);
        lista.add(new BoloDeChocolate());

        // Lista que aceita qualquer tipo;


        for (int i = 0; i < lista.size(); i++) {
            Object objeto = lista.get(i); // Objeto que varia seu "tipo"
            if (objeto instanceof Integer && ((Integer)objeto) == 10) { // Verifica se o objeto atual da lista é um Integer e verifica se possui se o valor é 10
                System.out.println("Tem um inteiro de valor 10 na lista");
            }
        }


        // Forma de parametrizar um tipo
        // O ArrayList está parametrizado para apenas receber BoloDeChocolate
        // Lista que aceita apenas algo que seja da classe BoloDeChocolate
        List<BoloDeChocolate> listaDeBolo = new ArrayList<>();

        listaDeBolo.add(new BoloDeChocolate());
        
        listaDeBolo.add(new BoloDeChocolate());
        
        listaDeBolo.add(new BoloDeChocolate());
        
        listaDeBolo.add(new BoloDeChocolate());

        System.out.println("Tamanho da lista de bolo: " + listaDeBolo.size());

        listaDeBolo.remove(0);

        System.out.println("Tamanho da lista de bolo: " + listaDeBolo.size());

       // ----------------------------- //


       
       //List<BoloDeChocolate> listaDeBoloVector = new Vector<>();



    }
}
