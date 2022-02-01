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
 */
public class NumAleatorio {
    private int numMax;
    private int numMin;
    private int num;

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
}
