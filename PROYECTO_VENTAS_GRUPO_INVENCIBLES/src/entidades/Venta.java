package entidades;

public class Venta {
    
    private double venta_cantidad_vendida;
    private double venta_igv_total;
    private double venta_monto_total;
    
    private String fecha_ant;
    private String fecha_des;
    private String venta_fecha;
    private String venta_Cliente;

    public double getVenta_cantidad_vendida() {
        return venta_cantidad_vendida;
    }

    public void setVenta_cantidad_vendida(double venta_cantidad_vendida) {
        this.venta_cantidad_vendida = venta_cantidad_vendida;
    }

    public double getVenta_igv_total() {
        return venta_igv_total;
    }

    public void setVenta_igv_total(double venta_igv_total) {
        this.venta_igv_total = venta_igv_total;
    }

    public double getVenta_monto_total() {
        return venta_monto_total;
    }

    public void setVenta_monto_total(double venta_monto_total) {
        this.venta_monto_total = venta_monto_total;
    }

    public String getFecha_ant() {
        return fecha_ant;
    }

    public void setFecha_ant(String fecha_ant) {
        this.fecha_ant = fecha_ant;
    }

    public String getFecha_des() {
        return fecha_des;
    }

    public void setFecha_des(String fecha_des) {
        this.fecha_des = fecha_des;
    }

    public String getVenta_fecha() {
        return venta_fecha;
    }

    public void setVenta_fecha(String venta_fecha) {
        this.venta_fecha = venta_fecha;
    }

    public String getVenta_Cliente() {
        return venta_Cliente;
    }

    public void setVenta_Cliente(String venta_Cliente) {
        this.venta_Cliente = venta_Cliente;
    }

   
 
  
    
}
