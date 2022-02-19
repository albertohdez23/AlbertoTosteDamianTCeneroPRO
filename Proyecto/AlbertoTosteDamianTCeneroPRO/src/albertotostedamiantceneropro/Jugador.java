/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertotostedamiantceneropro;

import java.util.ArrayList;

/**
 * En esta clase se almacena la informacion del Jugador
 * nombre: Nos indica el nombre del jugador
 * partidasJugadas: Nos indica el numero de partidas que ha jugado en total
 * mejorIntento: Muestra la menor cantidad de intentos necesarios para adivinar
 * ultimoIntento: Esta variable almacena temporalmente los resultados de la ultima partida jugada
 * historial: Guarda todas las puntuaciones del jugador
 * @author Alberto Hernández Medina
 * @author JDamian
 */
public class Jugador {
    String nombre;
    int partidasJugadas;
    int mejorIntento;
    int ultimoIntento;
    ArrayList<Integer> historialFacil; 
    ArrayList<Integer> historialMedio;
    ArrayList<Integer> historialDificil;
    
    /**
     * Constructor que recibe un parametro tipo String
     * @param nombre: Asigna el nombre del jugador
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
        historialFacil = new ArrayList();
        historialMedio = new ArrayList();
        historialDificil = new ArrayList();
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
    

    public int getUltimoIntento() {
        return ultimoIntento;
    }

    public void setUltimoIntento(int ultimoIntento) {
        this.ultimoIntento = ultimoIntento;
    }

    public ArrayList<Integer> getHistorialFacil() {
        return historialFacil;
    }

    public void setHistorialFacil(ArrayList<Integer> historialFacil) {
        this.historialFacil = historialFacil;
    }

    public ArrayList<Integer> getHistorialMedio() {
        return historialMedio;
    }

    public void setHistorialMedio(ArrayList<Integer> historialMedio) {
        this.historialMedio = historialMedio;
    }

    public ArrayList<Integer> getHistorialDificil() {
        return historialDificil;
    }

    public void setHistorialDificil(ArrayList<Integer> historialDificil) {
        this.historialDificil = historialDificil;
    }
    
}
