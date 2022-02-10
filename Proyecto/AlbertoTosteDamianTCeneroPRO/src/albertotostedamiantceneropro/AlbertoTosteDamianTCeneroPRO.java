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
     * Este metodo inicia la partida e interactua con el jugador
     * Dependiendo de la opcion elegida por el jugador, el programa iniciara
     * una nueva partida, mostrara el historial de partidas junto con la mejor
     * partida y el numero de intentos, un ranking.
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
                    NumAleatorio n1 = new NumAleatorio(10, 1);                   
                    System.out.println("El número a adivinar está entre el 1"
                            + "y el 10");
                    System.out.println("Introduce el número que creas correcto");
                    int intento = sc.nextInt(); sc.nextLine();
                    int vecesIntentado = 0;
                    while (n1.getNum() != intento) {                        
                        System.out.println("Has fallado, inténtalo de nuevo");
                        vecesIntentado++;
                        //estoy haciendo mal el bucle, porque si fallas se hace infinito XD
                    }if(n1.getNum()== intento) {
                        System.out.println("¡Enhorabuena, has acertado");
                        System.out.println("Lo has intentado: "+vecesIntentado+
                                " veces");
                    }
                        
                    
                    //¿Aqui deberia tener el get.aleatorio, no?
                    //¿y en cuanto acierte un numero, el break no terminaria
                    //todo el programa y no le dejaria al usuario seguir?
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


