/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertotostedamiantceneropro;

/**
 *
 * @author Alberto Hernández Medina
 */
public class AlbertoTosteDamianTCeneroPRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NumAleatorio numSecreto=new NumAleatorio(10, 1);
        System.out.println(numSecreto.getNum());
        
        Interfaz hud = new Interfaz();
        
        System.out.println(hud.menuInicio());
        System.out.println(hud.menuDificultad());
        System.out.println(hud.menuJuego());
        
        
    }
    
}


