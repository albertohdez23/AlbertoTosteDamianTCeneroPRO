/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertotostedamiantceneropro;

import java.util.Scanner;

/**
 *
 * @author Alberto Hernández Medina
 */
public class AlbertoTosteDamianTCeneroPRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        NumAleatorio numSecreto=new NumAleatorio(10, 1);
        System.out.println(numSecreto.getNum());
        
        Interfaz hud = new Interfaz();
        
        sc.nextLine();
        System.out.println(hud.espacioHud());
        sc.nextLine();
        System.out.println(hud.menuJuego());
        sc.nextLine();
        System.out.println(hud.menuDificultad());
        
        
        
        
    }
    
}


