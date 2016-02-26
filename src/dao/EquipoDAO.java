/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Equipo;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author USUARIO
 */
public class EquipoDAO {
    public static void salvarEquipo(Equipo equipo){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
//        t.begin();
        session.save(equipo);
        t.commit();
   }
}
