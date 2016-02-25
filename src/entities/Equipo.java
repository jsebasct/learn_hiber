/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 *
 * @author USUARIO
 */
public class Equipo implements Serializable {
    
    private Long id;
    private String nombre;
    private Set<Jugador> jugadores;

    public Equipo() {
        
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Jugador> getPersonajes() {
        return jugadores;
    }

    public void setPersonajes(Set<Jugador> personajes) {
        this.jugadores = personajes;
    }
           
//    public List<Personaje> getPersonajes() {
//        return this.personajes;
//    }
    
}
