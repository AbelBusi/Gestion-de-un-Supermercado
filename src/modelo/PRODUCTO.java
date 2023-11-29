package modelo;

/**
 *
 * @author cesar
 */
public class PRODUCTO {
    
    private int IDProducto;
    private String nombre;
    private int cantidad;
    private double precio;
    private String descripcion;
    private int porcentajeIVA;
    private int idCategoria;
    private int estado;
    
    public PRODUCTO (){
    
        this.IDProducto=0;
        this.nombre="";
        this.cantidad=0;
        this.precio=0.0;
        this.descripcion="";
        this.porcentajeIVA=0;
        this.idCategoria=0;
        this.estado=0;
        
    }

    public PRODUCTO(int IDProducto, String nombre, int cantidad, double precio, String descripcion, int porcentajeIVA, int idCategoria, int estado) {
        this.IDProducto = IDProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
        this.porcentajeIVA = porcentajeIVA;
        this.idCategoria = idCategoria;
        this.estado = estado;
    }

    public int getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPorcentajeIVA() {
        return porcentajeIVA;
    }

    public void setPorcentajeIVA(int porcentajeIVA) {
        this.porcentajeIVA = porcentajeIVA;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
