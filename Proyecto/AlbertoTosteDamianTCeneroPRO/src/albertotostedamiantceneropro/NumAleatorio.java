/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertotostedamiantceneropro;

import java.util.Random;

/**
 * Esta clase genera el número aleatorio que el jugador debe tratar de adivinar
 * NumMax delimita el máximo valor que podrá tener el numero aleatorio
 * NumMin delimita el valor mínimo que podrá obtener el numero aleatorio
 * @author JDamián
 */
public class NumAleatorio {
    private int numMax;
    private int numMin;
    private int num;
/**
 * Constructor que recibe los limites, tanto superior e inferior, del numero 
 * generado aleatoriamente que el jugador tratara de adivinar
 * @param numMax
 * @param numMin 
 */
    public NumAleatorio(int numMax, int numMin) {
        Random rnd = new Random();
        this.numMax = numMax;
        this.numMin = numMin;
        this.num = rnd.nextInt(numMax-numMin)+numMin;
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

    @Override
    public String toString() {
        return "NumAleatorio{" + "num=" + num + '}';
    }
    
}
