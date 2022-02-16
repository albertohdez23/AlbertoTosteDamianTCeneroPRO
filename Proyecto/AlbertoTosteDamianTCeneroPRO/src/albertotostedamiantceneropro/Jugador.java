/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertotostedamiantceneropro;

import java.util.ArrayList;

/**
 *
 * @author Alberto Hernández Medina
 */
public class Jugador {
    String nombre;
    int partidasJugadas;
    int mejorIntento;
    ArrayList<Integer> historial = new ArrayList<>();

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public int getMejorIntento() {
        return mejorIntento;
    }

    public void setMejorIntento(int mejorIntento) {
        this.mejorIntento = mejorIntento;
    }
    
    public void agregarNumHist(int num){
        historial.add(num);
    }

    @Override
    public String toString() {
        return "Historial: " + historial;
    }
}
