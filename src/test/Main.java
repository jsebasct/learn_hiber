/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.EquipoDAO;
import entities.Equipo;
import entities.Jugador;
import java.util.HashSet;
import java.util.Set;
import util.HibernateUtil;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        Jugador person1 = new Jugador("TipoA", 10, 10);
        Jugador person2 = new Jugador("TipoB", 10, 10);
       
        Equipo equipo = new Equipo("Equipo Lanus");
        Set<Jugador> personajes = new HashSet<>();
        personajes.add(person1);
        personajes.add(person2);
        
        person1.setEquipo(equipo);
        person2.setEquipo(equipo);
        
        System.out.println("-->" + personajes.size());
        equipo.setJugadores(personajes);
        
        EquipoDAO.salvarEquipo(equipo);
        System.out.println("End");
        
        HibernateUtil.shutdown();
    }
}
