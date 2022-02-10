/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertotostedamiantceneropro;

import java.util.Random;

/**
 *
 * @author JDamián
 * @version 1.0
 * Este código establace y devuelve el número aleatorio que el jugador
 * tratará de adivinar.
 */
public class NumAleatorio {
    private int numMax;
    private int numMin;
    private int num;
/**
 * @param numMax establece el valor MÁXIMO que puede conseguir el número aleatorio.
 * @param numMin establece el valor MÍNIMO del número aleatorio.
 */
    public NumAleatorio(int numMax, int numMin) {
        Random rnd = new Random();
        this.numMax = numMax;
        this.numMin = numMin;
        this.num = rnd.nextInt(numMax-numMin)+numMin;
    }
    /**
     * Contructor por defecto
     */
    public NumAleatorio() {
    }
    

    public int getNum() {
        return num;
    }

    public int getNumMax() {
        return numMax;
    }

    public void setNumMax(int numMax) {
        this.numMax = numMax;
    }

    public int getNumMin() {
        return numMin;
    }

    public void setNumMin(int numMin) {
        this.numMin = numMin;
    }
}
