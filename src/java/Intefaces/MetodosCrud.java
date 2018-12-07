/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaces;

import java.util.List;

/**
 *
 * @author Duoc
 */
public interface MetodosCrud<Generico> {

    public boolean agregar(Generico g);

    public boolean actualizar(Generico g);

    public boolean eliminar(Object g);

    public Generico buscar(Object g);

    public List<Generico> listar();
}
