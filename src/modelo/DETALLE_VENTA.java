package modelo;

/**
 *
 * @author cesar
 */
public class DETALLE_VENTA {
    
    private int id_detalleVenta;
    private int id_CabeceraVenta;
    private int id_Producto;
    private String nombre;
    private int cantidad;
    private double precioUnitario;
    private double subTotal;
    private double descuento;
    private double iva;
    private double totalPagar;
    private int estado;

    public DETALLE_VENTA() {
        
        this.id_detalleVenta=0;
        this.id_CabeceraVenta=0;
        this.id_Producto=0;
        this.nombre="";
        this.cantidad=0;
        this.precioUnitario=0.0;
        this.subTotal=0.0;
        this.descuento=0.0;
        this.iva=0.0;
        this.totalPagar=0.0;
        this.estado=0;
    
    }

    public DETALLE_VENTA(int id_detalleVenta, int id_CabeceraVenta, int id_Producto, String nombre, int cantidad, double precioUnitario, double subTotal, double descuento, double iva, double totalPagar, int estado) {
        this.id_detalleVenta = id_detalleVenta;
        this.id_CabeceraVenta = id_CabeceraVenta;
        this.id_Producto = id_Producto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subTotal = subTotal;
        this.descuento = descuento;
        this.iva = iva;
        this.totalPagar = totalPagar;
        this.estado = estado;
    }
    
    

    public int getId_detalleVenta() {
        return id_detalleVenta;
    }

    public void setId_detalleVenta(int id_detalleVenta) {
        this.id_detalleVenta = id_detalleVenta;
    }

    public int getId_CabeceraVenta() {
        return id_CabeceraVenta;
    }

    public void setId_CabeceraVenta(int id_CabeceraVenta) {
        this.id_CabeceraVenta = id_CabeceraVenta;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
