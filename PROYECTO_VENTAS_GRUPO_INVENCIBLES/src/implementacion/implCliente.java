/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import conexion.ConexionDBQ;
import entidades.RegistroVentaCliente;
import entidades.Producto;
import entidades.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class implCliente {
    ConexionDBQ cx= new ConexionDBQ();
    
    ArrayList<RegistroVentaCliente> listaVentaCliente= new ArrayList<>();
    String sql="";
    String query="";
    Statement stmt= null;
    ResultSet rset=null; 
    
    public int  registrarVentaProductoCliente(Usuario u, Producto p){
        int i=0;

        try {
            query=" insert into registro_compra_cliente (registroCliente_nombre, registroCliente_dni_ruc, registroCliente_producto, registroCliente_tipo_producto, registroCliente_precio_unidad, registroCliente_cantidad_vendida, registroCliente_igv_total, registroCliente_total_soles) "+
                  " values('"+u.getNombre()+"', '"+u.getDni_ruc()+"', '"+p.getProducto_nombre()+"', '"+p.getProducto_tipo()+"', '"+p.getProducto_precio()+"', '"+p.getVenta_cantidad_vendida()+"','"+p.getVenta_igv_total()+"', '"+p.getVenta_monto_total()+"') ";

            System.out.println("consulta:::::::"+query);
            stmt= cx.conectaMysql().createStatement();
            i   = stmt.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(""+ex.getMessage()); 
        }        

        return i;
    } 
    
    public ArrayList<RegistroVentaCliente> reporteVentaCliente(RegistroVentaCliente c){
        try {
            sql=" select * from registro_compra_cliente where registroCliente_dni_ruc='"+c.getCliente_DNI_RUC()+"' and registroCliente_fecha >= '"+c.getFecha_antes()+"' and registroCliente_fecha <=Date_add('"+c.getFecha_actual()+"',interval 1 day)  "; 
            stmt=cx.conectaMysql().createStatement();
            rset=stmt.executeQuery(sql);
            listaVentaCliente.clear();
            System.out.println(sql);
            while(rset.next()){
                RegistroVentaCliente cl = new RegistroVentaCliente();
                cl.setCliente_Nombre(rset.getString(1));
                cl.setCliente_DNI_RUC(rset.getString(2));
                cl.setCliente_Producto_compra(rset.getString(3));
                cl.setCliente_Producto_tipo(rset.getString(4));
                cl.setCliente_Producto_precio(rset.getDouble(5));
                cl.setCliente_Cantidad_comprada(rset.getDouble(6));
                cl.setCliente_IGV_total(rset.getDouble(7));  
                cl.setCliente_Total_soles(rset.getDouble(8));
                cl.setCliente_Fecha_Venta(rset.getString(9));
                listaVentaCliente.add(cl);            
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return listaVentaCliente; 
    }
    
        public int ReporteClienteUnico(Usuario u){
        int i=0;
        try {
            sql=" select * from usuario where usuario_dni_ruc='"+u.getDni_ruc()+"' ";
            System.out.println("consulta:"+sql);
            stmt=cx.conectaMysql().createStatement();
            rset=stmt.executeQuery(sql);
            System.out.println(sql);          
            if(rset.next()){
                System.out.println("dentro del ifff de la consulta:");     
                u.setNombre(rset.getString(2));  
                u.setApellido(rset.getString(3));
                u.setCategoria(rset.getString(6));      
                u.setNombreUsuario(rset.getString(7));
                u.setPasword(rset.getString(8));          
            }
        } catch (SQLException ex) {
                ex.getMessage();
                System.out.println("errrorrrrr:"+ex.getMessage());
        }
        return i;
    }
    
}
