package modelo.dto;
// Generated 06-dic-2018 13:18:24 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int rut;
     private Usuario usuario;
     private String nombre;
     private int telefono;
     private String email;
     private Set<Compra> compras = new HashSet<Compra>(0);

    public Cliente() {
    }

	
    public Cliente(Usuario usuario, String nombre, int telefono, String email) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    public Cliente(Usuario usuario, String nombre, int telefono, String email, Set<Compra> compras) {
       this.usuario = usuario;
       this.nombre = nombre;
       this.telefono = telefono;
       this.email = email;
       this.compras = compras;
    }
   
    public int getRut() {
        return this.rut;
    }
    
    public void setRut(int rut) {
        this.rut = rut;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set<Compra> getCompras() {
        return this.compras;
    }
    
    public void setCompras(Set<Compra> compras) {
        this.compras = compras;
    }




}


