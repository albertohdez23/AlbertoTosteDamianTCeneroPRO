/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdivinarNumero;

import java.util.Scanner;

/**
 * Esta clase define todos los elementos de la clase partida y la dificultad de 
 * la misma
 * @author Alejandro Toste
 * @author JDamian
 */ 
public class Partida {
    NumAleatorio secreto;
    int secretoAEnviar;
    int mayorQue;
    int menorQue;
    int rangoMin;
    int rangoMax;
    int fallos;
    int introducido;
    Jugador nick;
    int dificultad;
/**
 * Este contructor define la estructura de la partida
 * @param nick nombre del jugador
 * @param dificultad modo de juego seleccionado por el jugador
 */
    public Partida( int dificultad) {
        
        this.dificultad = dificultad;
        iniciarPartida(dificultad);
    }

    public NumAleatorio getSecreto() {
        return secreto;
    }

    public void setSecreto(NumAleatorio secreto) {
        this.secreto = secreto;
    }

    public int getMayorQue() {
        return mayorQue;
    }

    public void setMayorQue(int mayorQue) {
        this.mayorQue = mayorQue;
    }

    public int getMenorQue() {
        return menorQue;
    }

    public void setMenorQue(int menorQue) {
        this.menorQue = menorQue;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    public Jugador getNick() {
        return nick;
    }

    public void setNick(Jugador nick) {
        this.nick = nick;
    }
    public int getDificultad() {
        return dificultad;
    }

    public void iniciarPartida(int dificultad) {
        this.dificultad = dificultad;

        switch (dificultad) {

            case 1:
                rangoMin = 0;
                rangoMax = 25;
                secreto = new NumAleatorio(rangoMax, rangoMin);
                secretoAEnviar = -1;
                break;
            case 2:
                rangoMin = 0;
                rangoMax = 50;
                secreto = new NumAleatorio(rangoMax, rangoMin);
                secretoAEnviar = -1;
                break;
            case 3:
                rangoMin = 0;
                rangoMax = 100;
                secreto = new NumAleatorio(rangoMax, rangoMin);
                secretoAEnviar = -1;
                break;
        }
    }

    public void introducirDato(int num) {
        introducido = num;
        if (introducido == secreto.getNum()) {
            secretoAEnviar = secreto.getNum();
        } else if (introducido < secreto.getNum()) {
            setMayorQue(introducido);
            setFallos(fallos + 1);
            secretoAEnviar = - 1;
        } else {
            setMenorQue(introducido);
            setFallos(fallos + 1);
            secretoAEnviar = - 1;
        }
    }

    public int secretoAEnviar() {
        return secretoAEnviar;
    }
    /**
     * agrega los fallos al jugador al finalizar la partida
     */
    public void terminarPartida(Jugador player) {
        this.nick = player;
        this.nick.setUltimoIntento(fallos);
        
        switch (dificultad) {
        
            case 1:
                if (player.mejorIntentoF > player.ultimoIntento) {
                    player.mejorIntentoF = fallos;
                }
                nick.historialFacil.add(fallos);
                break;
            case 2:
                if (player.mejorIntentoM > player.ultimoIntento) {
                    player.mejorIntentoM = fallos;
                }
                nick.historialMedio.add(fallos);
                break;
            case 3:
                if (player.mejorIntentoD > player.ultimoIntento) {
                    player.mejorIntentoD = fallos;
                }
                nick.historialDificil.add(fallos);
                break;
        }
                
    }

}
