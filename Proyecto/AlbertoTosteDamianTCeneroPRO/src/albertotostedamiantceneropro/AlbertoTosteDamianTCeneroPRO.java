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
        
        System.out.println("BIENVENIDO");
        System.out.println("Introduce tu nombre:");
        String nick = sc.nextLine();
        
        Jugador P1 = new Jugador(nick);
        P1.setMejorIntento(3);
        P1.setPartidasJugadas(5);
        for (int i = 0; i < 11; i++) {
            P1.historial.add(i);
        }
        
        menu();
        
        boolean salir = false;
        
        do{
            System.out.println("Selecciona una Opción:");
            int opcion = sc.nextInt(); sc.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("Se inicia la partida");
                    break;
                case 2:
                    System.out.println("Historial");
                    System.out.println(P1.historial);
                    System.out.print("Tu mejor partida: ");
                    System.out.println(P1.getMejorIntento() + " intentos");
                    break;
                case 3:
                    System.out.println("Se muestra el ranking");
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            
        }while(salir);
        
        NumAleatorio numSecreto=new NumAleatorio(10, 1);
    }
    
    static void menu(){
        System.out.println("MENU");
        System.out.println("===================");
        System.out.println("1.- Iniciar Partida");
        System.out.println("2.- Ver Historial");
        System.out.println("3.- Ver Ranking");
        System.out.println("0.- EXIT");
    }
}


