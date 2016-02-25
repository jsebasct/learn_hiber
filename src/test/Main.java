/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.EquipoDAO;
import entities.Equipo;
import entities.Jugador;
import java.util.LinkedList;
import java.util.List;
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
        List<Jugador> personajes = new LinkedList<Jugador>();
        personajes.add(person1);
        personajes.add(person2);
       //equipo.setPersonajes(personajes);
        
        EquipoDAO.salvarEquipo(equipo);
    }
}
