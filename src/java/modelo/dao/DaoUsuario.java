/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import interfaces.MetodosCrud;
import java.util.List;
import modelo.dto.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Artiko1
 */
public class DaoUsuario implements MetodosCrud<Usuario>{
    //Declaramos variables
    private Session sesion;//la que contiene todo los query
    private Transaction tx;
    
    //Metodo para iniciar la sesion con la BD
    public void iniOperacion(){
      sesion = HibernateUtil.getSessionFactory().openSession();
      tx = sesion.beginTransaction();
    }

    @Override
    public boolean agregar(Usuario g) {
    
     try {
            iniOperacion();
            sesion.save(g);
            tx.commit();
            sesion.close();
            return true;
        } catch (Exception e) {
            tx.rollback();
            sesion.close();
            throw new RuntimeException("No se pudo almacenar el usuario");
        }
    }

    @Override
    public boolean actualizar(Usuario g) {
       try {
            iniOperacion();
            Usuario usu = buscar(g.getIdUsuario());
            usu.setUser(g.getUser());
            usu.setPass(g.getPass());
            usu.setRut(g.getRut());
            usu.setNombre(g.getNombre());
            usu.setApellido(g.getApellido());
            usu.setTelefono(g.getTelefono());
            usu.setCorreo(g.getCorreo());
            sesion.update(usu);
            tx.commit();
            sesion.close();
            return true;
        } catch (Exception e) {
            tx.rollback();
            sesion.close();
            throw new RuntimeException("No se pudo actualizar el Usuario");
        }
    }


    @Override
    public boolean eliminar(Object o) {
      try {
             iniOperacion();
             Usuario usu = buscar(o);
             sesion.delete(usu);
             tx.commit();
             sesion.close();
             return true;
        } catch (Exception e) {
             tx.rollback();
             sesion.close();
             throw new RuntimeException("No se pudo eliminar el Usuario");
        }
    }

    @Override
    public Usuario buscar(Object o) {
        try {
            iniOperacion();
            List<Usuario> lista = sesion.createQuery("from Usuario where id="+o).list();
            for (Usuario usu : lista){
                return usu;
            }
        } catch (Exception e) {
               tx.rollback();
               sesion.close();
               throw new RuntimeException("No se pudo el Usuario");
        }
          return null;
    }

    @Override
    public List<Usuario> listarTodo() {
      try {
            iniOperacion();
            List<Usuario>lista = sesion.createQuery("from Usuario").list();
            return lista;
        } catch (Exception e) {
            tx.rollback();
            sesion.close();
            throw new RuntimeException("No se pudo listar los Usuario");
        }
    }

    @Override
    public boolean actualizarEstado(Usuario g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
