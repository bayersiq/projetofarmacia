package br.com.farmacia.conexao;
import java.sql.*;
public class ConectaBanco {
    
    private String usuario = "root";
    private String senha = "";
    private String host = "localhost";
    private String porta = "3306";
    //private String bd = "db_pessoas";
    private String bd = "farmacia";    
    public Connection obtemConexao (){
        try{
            Connection c = DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + porta + "/" + bd,
                usuario,
                senha
            );
            return c;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
