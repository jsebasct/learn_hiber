/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.EquipoDAO;
import entities.Equipo;
import entities.Personaje;
import java.util.LinkedList;
import java.util.List;
import util.HibernateUtil;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        Personaje person1 = new Personaje("TipoA", 10, 10);
        Personaje person2 = new Personaje("TipoB", 10, 10);
        
        Equipo equipo = new Equipo("Equipo Lanus");
        List<Personaje> personajes = new LinkedList<Personaje>();
        personajes.add(person1);
        personajes.add(person2);
        equipo.setPersonajes(personajes);
        
        EquipoDAO.salvarEquipo(equipo);
    }
}
