package modelo.dto;
// Generated 06-dic-2018 13:18:24 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Estacionamiento generated by hbm2java
 */
public class Estacionamiento  implements java.io.Serializable {


     private Integer idEstacionamiento;
     private String descripcion;
     private int valor;
     private Set<Boleta> boletas = new HashSet<Boleta>(0);

    public Estacionamiento() {
    }

	
    public Estacionamiento(String descripcion, int valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }
    public Estacionamiento(String descripcion, int valor, Set<Boleta> boletas) {
       this.descripcion = descripcion;
       this.valor = valor;
       this.boletas = boletas;
    }
   
    public Integer getIdEstacionamiento() {
        return this.idEstacionamiento;
    }
    
    public void setIdEstacionamiento(Integer idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getValor() {
        return this.valor;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Set<Boleta> getBoletas() {
        return this.boletas;
    }
    
    public void setBoletas(Set<Boleta> boletas) {
        this.boletas = boletas;
    }




}

