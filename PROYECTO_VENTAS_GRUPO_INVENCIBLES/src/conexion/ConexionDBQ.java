package conexion;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDBQ {
    Connection con=null;
    String userDB="";
    String password="";
    String url="";     
    public Connection conectaMysql(){        
        try {
            userDB="root";
            url="jdbc:mysql://127.0.0.1:3306/proyecto_integrador";
            con=DriverManager.getConnection(url,userDB,password);
            if(con!=null) System.out.println("Se establecio la conexion");
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return con;
    }

    
    public ResultSet consultarRegistros(String strSentenciaSQL){
        try {            
            PreparedStatement pstm = con.prepareStatement(strSentenciaSQL);
            ResultSet respuesta=pstm.executeQuery();
            return respuesta; 
        } catch (Exception e) {
            System.out.println(e);
            return null;
        } 
    }  
    public static void main(String args[]) {
        ConexionDBQ cd = new ConexionDBQ();
        cd.conectaMysql();            
    }
}
