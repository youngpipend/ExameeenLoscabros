/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import modelo.dto.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Duoc
 */
public class LoginDao {

    private Session sesion;
    private Transaction tx;

    public void iniOperacion() {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    public Usuario buscar(String user, String pass) {
        try {
            iniOperacion();
            List<Usuario> lista = sesion.createQuery("from Usuario where user = '" + user + "' and pass = '" + pass + "'").list();
            for (Usuario aux : lista) {
                if (aux.getUser().equals(user) && aux.getPass().equals(pass)) {
                    return aux;
                }
            }
        } catch (Exception e) {
            sesion.close();
            throw new RuntimeException("Usuario no registrado.");
        }
        return null;
    }
}
