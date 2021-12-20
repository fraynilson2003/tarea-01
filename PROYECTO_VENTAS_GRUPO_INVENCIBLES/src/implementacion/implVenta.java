package implementacion;

import java.sql.Connection;
//import com.sun.jdi.connect.spi.Connection;
import conexion.ConexionDBQ;
import entidades.Producto;
import entidades.Usuario;
import generator.generator;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Fray
 */
public class implVenta {
    
       public Connection con;
       ConexionDBQ cx= new ConexionDBQ();
       PreparedStatement ps;
       ResultSet rs;
       
       int r;
    
    ArrayList<Producto> listaProductos= new ArrayList<>();
    String sql="";
    String query="";
    Statement stmt= null;
    ResultSet rset=null;    
   
   
    
  
    public int  registrarVenta(Producto p){
        int i=0;
    
        try {
            query=" insert into registroventa (venta_cliente_nombre, venta_producto, venta_producto_tipo, venta_precio_unid, venta_cantidad_vendida, venta_igv_total, venta_monto_total) "+
                  " values('"+p.getVenta_Cliente()+"', '"+p.getProducto_nombre()+"', '"+p.getProducto_tipo()+"', '"+p.getProducto_precio()+"', '"+p.getVenta_cantidad_vendida()+"', '"+p.getVenta_igv_total()+"','"+p.getVenta_monto_total()+"') ";
            
            System.out.println("consulta:::::::"+query);
            stmt= cx.conectaMysql().createStatement();
            i   = stmt.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(""+ex.getMessage()); 
        }        
        
        return i;
    } 
 
    public ArrayList<Producto> reporteVentas(Producto p){
  
        try {
            sql=" select * from registroventa where venta_producto_tipo = '"+p.getProducto_tipo()+"' and venta_fecha >= '"+p.getFecha_ant()+"' and venta_fecha <=Date_add('"+p.getFecha_des()+"',interval 1 day)  "; 
            stmt=cx.conectaMysql().createStatement();
            rset=stmt.executeQuery(sql);
            listaProductos.clear();
            System.out.println(sql);
            while(rset.next()){
                Producto ps = new Producto();               
                ps.setVenta_Cliente(rset.getString(1));
                ps.setProducto_nombre(rset.getString(2));
                ps.setProducto_tipo(rset.getString(3));
                ps.setProducto_precio(rset.getDouble(4));
                ps.setVenta_cantidad_vendida(rset.getDouble(5));
                ps.setVenta_igv_total(rset.getDouble(6));
                ps.setVenta_monto_total(rset.getDouble(7));  
                ps.setVenta_fecha(rset.getString(8));
                listaProductos.add(ps);            
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return listaProductos; 
    } 
    
     public ArrayList<Producto> reporteVentasTodo(Producto p){
  
        try {
            sql=" select * from registroventa where venta_fecha >= '"+p.getFecha_ant()+"' and venta_fecha <=Date_add('"+p.getFecha_des()+"',interval 1 day) "; 
            stmt=cx.conectaMysql().createStatement();
            rset=stmt.executeQuery(sql);
            listaProductos.clear();
            System.out.println(sql);
            while(rset.next()){
                Producto ps = new Producto();               
                ps.setVenta_Cliente(rset.getString(1));
                ps.setProducto_nombre(rset.getString(2));
                ps.setProducto_tipo(rset.getString(3));
                ps.setProducto_precio(rset.getDouble(4));
                ps.setVenta_cantidad_vendida(rset.getDouble(5));
                ps.setVenta_igv_total(rset.getDouble(6));
                ps.setVenta_monto_total(rset.getDouble(7));  
                ps.setVenta_fecha(rset.getString(8));
                listaProductos.add(ps);            
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return listaProductos; 
    } 
    
    public int actualizarStock(Producto p){
        
        int i=0;
        try {
            sql="UPDATE  producto"+
                " SET producto_stock='"+p.getProducto_stock()+"' "+
                "where producto_id='"+p.getProducto_id()+"'";   
            
            stmt=cx.conectaMysql().createStatement();
            i=stmt.executeUpdate(sql);
            System.out.println(sql);
            
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return i;
        
    }
    
     public int eliminarRegistroProducto(Producto p){
        
        int i=0;
        try {
            sql="DELETE FROM producto WHERE producto_id='"+p.getProducto_id()+"'";
            stmt=cx.conectaMysql().createStatement();
            i=stmt.executeUpdate(sql);
            System.out.println("Se elimino el registro");
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return i;
    }
    
    public int reporteProductoUnico(Producto p){
        int i=0;
        try {
            sql=" select * from producto where producto_nombre='"+p.getProducto_nombre()+"' ";
            stmt=cx.conectaMysql().createStatement();
            rset=stmt.executeQuery(sql);
            if(rset.next()){
                
                p.setProducto_id(rset.getString(1));
                p.setProducto_nombre(rset.getString(2));
                p.setProducto_tipo(rset.getString(3));
                p.setProducto_marca(rset.getString(4));
                p.setProducto_precio(rset.getDouble(5)); 
                p.setProducto_stock(rset.getDouble(6));   
               
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return i;  
    }  
    
      public int reporteProductoUnico(Producto p, String Producto_nombre){
        int i=0;
        try {
            sql=" select * from producto where producto_nombre='"+Producto_nombre+"' ";
            stmt=cx.conectaMysql().createStatement();
            rset=stmt.executeQuery(sql);
            if(rset.next()){
                
                p.setProducto_id(rset.getString(1));
                p.setProducto_nombre(rset.getString(2));
                p.setProducto_tipo(rset.getString(3));
                p.setProducto_marca(rset.getString(4));
                p.setProducto_precio(rset.getDouble(5)); 
                p.setProducto_stock(rset.getDouble(6));   
               
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return i;  
    }  
    
    
    
    
    
}
