/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lodica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author 1059237155
 */
public class Equipo {
   public String Nombre_equipo;
   public ArrayList <Jugador> listajugadores;

    public Equipo() {
    }

    public String getNombre_equipo() {
        return Nombre_equipo;
    }

    public void setNombre_equipo(String Nombre_equipo) {
        this.Nombre_equipo = Nombre_equipo;
    }

    public ArrayList<Jugador> getListajugadores() {
        return listajugadores;
    }

    public void setListajugadores(ArrayList<Jugador> listajugadores) {
        this.listajugadores = listajugadores;
    }

    public Equipo(String Nombre_equipo, ArrayList<Jugador> listajugadores) {
        this.Nombre_equipo = Nombre_equipo;
        this.listajugadores = listajugadores;
    }

}