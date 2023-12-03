package modelo;

/**
 *
 * @author cesar
 */
public class CABECERA_VENTA {
    
    private int idCabeceraVenta;
    
    private int id_cliente;
    
    private double valorPrecio;
    
    private String fechaVenta;
    
    private int estado;
    
    public CABECERA_VENTA (){
    
        this.idCabeceraVenta=0;
        this.id_cliente=0;
        this.valorPrecio=0.0;
        this.fechaVenta="";
        this.estado=0;
    }

    public CABECERA_VENTA(int idCabeceraVenta, int id_cliente, double valorPrecio, String fechaVenta, int estado) {
        this.idCabeceraVenta = idCabeceraVenta;
        this.id_cliente = id_cliente;
        this.valorPrecio = valorPrecio;
        this.fechaVenta = fechaVenta;
        this.estado = estado;
    }
    
    

    public int getIdCabeceraVenta() {
        return idCabeceraVenta;
    }

    public void setIdCabeceraVenta(int idCabeceraVenta) {
        this.idCabeceraVenta = idCabeceraVenta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public double getValorPrecio() {
        return valorPrecio;
    }

    public void setValorPrecio(double valorPrecio) {
        this.valorPrecio = valorPrecio;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
