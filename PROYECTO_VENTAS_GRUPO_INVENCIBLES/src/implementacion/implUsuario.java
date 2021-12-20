package implementacion;

import conexion.ConexionDBQ;
import entidades.Producto;
import entidades.Usuario;
import generator.generator;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class implUsuario {
    ConexionDBQ cx= new ConexionDBQ();  
    ArrayList<Usuario> listaUsuarios= new ArrayList<>();
    
    String sql="";
    String query="";
    Statement stmt= null;
    ResultSet rset=null;      
    
        public int  registrarUsuario(String nombre, String apellido, String sexo, String edad, String dni, String categoria, String nombre_usuario, String pasword){
        int i=0;
        generator gn= new generator();
        String idusuario=gn.generadorId();
        try {
            query=" insert into usuario(usuario_id, usuario_nombre, usuario_apellido, usuario_sexo, usuario_edad, usuario_categoria, usuario_nombreusuario, usuario_pasword, usuario_dni_ruc) "+
                  " values('"+idusuario+"', '"+nombre+"', '"+apellido+"', '"+sexo+"', '"+edad+"', '"+categoria+"', '"+nombre_usuario+"', '"+pasword+"', '"+dni+"') ";
            
            System.out.println("consulta:::::::"+query);
            stmt= cx.conectaMysql().createStatement();
            i   = stmt.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(""+ex.getMessage()); 
        }                
        return i;
    }
      
    public int actualizarUsuario(Usuario u){
        
        int i=0;
        try {
            sql="UPDATE  usuario "+
                "SET usuario_nombre='"+u.getNombre()+"', usuario_apellido='"+u.getApellido()+"', usuario_sexo='"+u.getSexo()+"', usuario_edad='"+u.getEdad()+"', usuario_categoria='"+u.getCategoria()+"', usuario_nombreusuario='"+u.getNombreUsuario()+"', usuario_pasword='"+u.getPasword()+"', usuario_dni_ruc='"+u.getDni_ruc()+"' " 
                +"where usuario_id='"+u.getId()+"' "; 
            
            stmt=cx.conectaMysql().createStatement();
            i=stmt.executeUpdate(sql);
            System.out.println(sql);
            
        } catch (SQLException ex) {
            System.out.println("No se ejecuto "+sql);
                ex.getMessage();
        }
        return i;
        
    }
      //Este metodo lo utilizamos para validar el acceso o no
    public Usuario LoginReportePersonaUnico(String slogin, String spassword){
        Usuario u = new Usuario();        
        try {
            sql=" select * from usuario where usuario_nombreusuario='"+slogin+"' and  usuario_pasword='"+spassword+"' ";
            System.out.println("consulta:"+sql);
            stmt=cx.conectaMysql().createStatement();
            rset=stmt.executeQuery(sql);
            u.setAcceso(false);
            if(rset.next()){
                System.out.println("dentro del ifff de la consulta:");     
                u.setNombre(rset.getString(2));  
                u.setCategoria(rset.getString(6));      
                u.setNombreUsuario(rset.getString(7));
                u.setPasword(rset.getString(8));
                u.setAcceso(true);
            }
        } catch (SQLException ex) {
                ex.getMessage();
                System.out.println("errrorrrrr:"+ex.getMessage());
        }
        return u;
    }
    
    public Usuario LoginReportePersonaUnico(String slogin, String spassword, String validacion){
        Usuario u = new Usuario();        
        try {
            sql=" select * from usuario where usuario_nombreusuario='"+slogin+"' and  usuario_pasword='"+spassword+"' and usuario_categoria='"+validacion+"' ";
            System.out.println("consulta:"+sql);
            stmt=cx.conectaMysql().createStatement();
            rset=stmt.executeQuery(sql);
            u.setAcceso(false);
            if(rset.next()){
                System.out.println("dentro del ifff de la consulta:");     
                u.setNombre(rset.getString(2));  
                u.setCategoria(rset.getString(6));      
                u.setNombreUsuario(rset.getString(7));
                u.setPasword(rset.getString(8));
                u.setAcceso(true);
            }
        } catch (SQLException ex) {
                ex.getMessage();
                System.out.println("errrorrrrr:"+ex.getMessage());
        }
        return u;
    }
    
        //Este metodo lo utilizamos para sacar los demas datos del usuario
    public int reporteUsuarioUnico(Usuario u){
        int i=0;
        try {
            sql=" select * from usuario where usuario_id='"+u.getId()+"' ";
            stmt=cx.conectaMysql().createStatement();
            rset=stmt.executeQuery(sql);
            if(rset.next()){
                
                u.setNombre(rset.getString(2));
                u.setApellido(rset.getString(3));
                u.setSexo(rset.getString(4));
                u.setEdad(rset.getString(5));
                u.setCategoria(rset.getString(6));
                u.setNombreUsuario(rset.getString(7));
                u.setPasword(rset.getString(8));
                u.setDni_ruc(rset.getString(9));
                
               
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return i;  
    }
    
     public ArrayList<Usuario> reporteUsuarios(Usuario u){   
        try {
            sql=" select * from usuario where usuario_categoria='"+u.getCategoria()+"'";
            stmt=cx.conectaMysql().createStatement();
            rset=stmt.executeQuery(sql);
            listaUsuarios.clear();
            while(rset.next()){
                Usuario us = new Usuario();
                us.setId(rset.getString(1));
                us.setNombre(rset.getString(2));
                us.setApellido(rset.getString(3));
                us.setSexo(rset.getString(4));
                us.setEdad(rset.getString(5));
                us.setCategoria(rset.getString(6));
                us.setNombreUsuario(rset.getString(7));
                us.setPasword(rset.getString(8));
                us.setDni_ruc(rset.getString(9));             
                listaUsuarios.add(us);            
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return listaUsuarios; 
    }
         
    public int eliminarRegistroUsuario(Usuario u){
        
        int i=0;
        try {
            sql="DELETE FROM usuario WHERE usuario_id='"+u.getId()+"'";
            stmt=cx.conectaMysql().createStatement();
            i=stmt.executeUpdate(sql);
            System.out.println(sql);
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return i;
    }
   
    
}
