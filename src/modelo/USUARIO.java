package modelo;

/**
 *
 * @author cesar
 */
public class USUARIO {
    
    private int IDusuario;
    private String nombre;
    private String apellido;
    private String usuario;
    private String telefono;
    private String password;
    private int estado;
    
    
    //constructor
    
    public USUARIO(){
    this.IDusuario=0;
    this.nombre="";
    this.apellido="";
    this.usuario="";
    this.password="";
    this.telefono="";
    this.estado=0;
    
    }

    public int getIDusuario() {
        return IDusuario;
    }

    public void setIDusuario(int IDusuario) {
        this.IDusuario = IDusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
