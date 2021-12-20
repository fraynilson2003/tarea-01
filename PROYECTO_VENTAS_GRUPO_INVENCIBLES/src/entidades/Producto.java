package entidades;

public class Producto extends Venta{
    
    private String producto_id;
    private String producto_nombre;
    private String producto_tipo;
    private String producto_marca;
    private double producto_precio;
    private double producto_stock;  
    
    private double registroProducto_cantidad_vendida;
    private double registroProducto_igv_total;
    private double registroProducto_monto_total;
   

    public String getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(String producto_id) {
        this.producto_id = producto_id;
    }

    public String getProducto_nombre() {
        return producto_nombre;
    }

    public void setProducto_nombre(String producto_nombre) {
        this.producto_nombre = producto_nombre;
    }

    public String getProducto_tipo() {
        return producto_tipo;
    }

    public void setProducto_tipo(String producto_tipo) {
        this.producto_tipo = producto_tipo;
    }

    public String getProducto_marca() {
        return producto_marca;
    }

    public void setProducto_marca(String producto_marca) {
        this.producto_marca = producto_marca;
    }

    public double getProducto_precio() {
        return producto_precio;
    }

    public void setProducto_precio(double producto_precio) {
        this.producto_precio = producto_precio;
    }

    public double getProducto_stock() {
        return producto_stock;
    }

    public void setProducto_stock(double producto_stock) {
        this.producto_stock = producto_stock;
    }

    public double getRegistroProducto_cantidad_vendida() {
        return registroProducto_cantidad_vendida;
    }

    public void setRegistroProducto_cantidad_vendida(double registroProducto_cantidad_vendida) {
        this.registroProducto_cantidad_vendida = registroProducto_cantidad_vendida;
    }

    public double getRegistroProducto_igv_total() {
        return registroProducto_igv_total;
    }

    public void setRegistroProducto_igv_total(double registroProducto_igv_total) {
        this.registroProducto_igv_total = registroProducto_igv_total;
    }

    public double getRegistroProducto_monto_total() {
        return registroProducto_monto_total;
    }

    public void setRegistroProducto_monto_total(double registroProducto_monto_total) {
        this.registroProducto_monto_total = registroProducto_monto_total;
    }

    
    
    
    
}
