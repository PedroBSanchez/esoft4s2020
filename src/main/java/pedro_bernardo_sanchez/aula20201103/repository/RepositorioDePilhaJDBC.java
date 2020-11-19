package pedro_bernardo_sanchez.aula20201103.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDePilhaJDBC implements RepositórioDePilha {

    Connection conexao = null;
    List<Pilha> pilhas = new ArrayList<>();

    public RepositorioDePilhaJDBC(Connection conexao) {
        
        this.conexao = conexao;

    }


	@Override
    public void incluir(Pilha nova) {
        
        
        try (PreparedStatement insertPilha = this.conexao.prepareStatement("insert into pilha (id, marca, modelo, amperagem) values (?, ?, ?, ?)")){
            
            this.pilhas.add(nova);
            insertPilha.setString(1, nova.getId());
            insertPilha.setString(2, nova.getMarca());
            insertPilha.setString(3, nova.getModelo());
            insertPilha.setInt(4, nova.getAmperagem());
            insertPilha.executeUpdate();
            


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public List<Pilha> obterTodas() {
        return this.pilhas;
    }
 
    

}
