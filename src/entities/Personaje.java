/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class Personaje implements Serializable{
    
    private Long id;
    private String tipo;
    private int hp;
    private int mp;
    private Equipo equipo;
    
    public Personaje() {    
    }
    

    public Personaje(String tipo, int hp, int mp) {
        this.tipo = tipo;
        this.hp = hp;
        this.mp = mp;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
