package entidades;

public class RegistroVentaCliente {
    
    private String cliente_Nombre;
    private String cliente_DNI_RUC;
    private String cliente_Producto_compra;
    private String cliente_Producto_tipo;
    private double cliente_Producto_precio;
    private double cliente_Cantidad_comprada;
    private double cliente_IGV_total;
    private double cliente_Total_soles;
    private String cliente_Fecha_Venta;
    
    //Estas variables son para el reporte
    private String fecha_antes;
    private String fecha_actual;

    
    public String getCliente_Nombre() {
        return cliente_Nombre;
    }

    public void setCliente_Nombre(String cliente_Nombre) {
        this.cliente_Nombre = cliente_Nombre;
    }

    public String getCliente_DNI_RUC() {
        return cliente_DNI_RUC;
    }

    public void setCliente_DNI_RUC(String cliente_DNI_RUC) {
        this.cliente_DNI_RUC = cliente_DNI_RUC;
    }

    public String getCliente_Producto_compra() {
        return cliente_Producto_compra;
    }

    public void setCliente_Producto_compra(String cliente_Producto_compra) {
        this.cliente_Producto_compra = cliente_Producto_compra;
    }

    public String getCliente_Producto_tipo() {
        return cliente_Producto_tipo;
    }

    public void setCliente_Producto_tipo(String cliente_Producto_tipo) {
        this.cliente_Producto_tipo = cliente_Producto_tipo;
    }

    public double getCliente_Producto_precio() {
        return cliente_Producto_precio;
    }

    public void setCliente_Producto_precio(double cliente_Producto_precio) {
        this.cliente_Producto_precio = cliente_Producto_precio;
    }

    public double getCliente_Cantidad_comprada() {
        return cliente_Cantidad_comprada;
    }

    public void setCliente_Cantidad_comprada(double cliente_Cantidad_comprada) {
        this.cliente_Cantidad_comprada = cliente_Cantidad_comprada;
    }

    public double getCliente_IGV_total() {
        return cliente_IGV_total;
    }

    public void setCliente_IGV_total(double cliente_IGV_total) {
        this.cliente_IGV_total = cliente_IGV_total;
    }

    public double getCliente_Total_soles() {
        return cliente_Total_soles;
    }

    public void setCliente_Total_soles(double cliente_Total_soles) {
        this.cliente_Total_soles = cliente_Total_soles;
    }

    public String getCliente_Fecha_Venta() {
        return cliente_Fecha_Venta;
    }

    public void setCliente_Fecha_Venta(String cliente_Fecha_Venta) {
        this.cliente_Fecha_Venta = cliente_Fecha_Venta;
    }

    public String getFecha_antes() {
        return fecha_antes;
    }

    public void setFecha_antes(String fecha_antes) {
        this.fecha_antes = fecha_antes;
    }

    public String getFecha_actual() {
        return fecha_actual;
    }

    public void setFecha_actual(String fecha_actual) {
        this.fecha_actual = fecha_actual;
    }


   
    
    
}