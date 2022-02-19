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
    int mejorIntentoF;
    int mejorIntentoM;
    int mejorIntentoD;
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
        if (nombre.length() > 4) {
             this.nombre = nombre.substring(0,4);
        }else if (nombre.length() < 4){
            for (int i = 0; i < 4 - nombre.length(); i++) {
                nombre += " ";
            }
            this.nombre = nombre;
        }else{
            this.nombre = nombre;
        }
        
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
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

    public void setHistorialFacil(int fallos) {
        this.historialFacil.add(fallos);
    }

    public ArrayList<Integer> getHistorialMedio() {
        return historialMedio;
    }

    public void setHistorialMedio(int fallos) {
        this.historialMedio.add(fallos);
    }

    public ArrayList<Integer> getHistorialDificil() {
        return historialDificil;
    }

    public void setHistorialDificil(int fallos) {
        this.historialDificil.add(fallos);
    }
    
}
