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
public class Main {

    /**
     * Main
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        int dificultadPartida = 0;
        Interfaz hud = new Interfaz();
        
        //Jugador P1 = new Jugador("");
       
        //Partida Partida1 = new Partida(P1, dificultadPartida);
        
        boolean salir = false;
        
        System.out.println(hud.espacioHud());
        sc.nextLine();
        
        do{
            System.out.println(hud.menuInicio());
            int opcion = sc.nextInt(); sc.nextLine();
            
            switch(opcion){//menuInicio
                case 1://Jugar Partida
                    boolean salir2 = false;
                   
                    do{
                        System.out.println(hud.menuJuego(dificultadPartida));
                        int eleccion = sc.nextInt(); sc.nextLine();
                        
                        switch (eleccion) {//menuJuego
                            case 1://Selecciona Dificultad
                                System.out.println(hud.menuDificultad());
                                int opcion2 = sc.nextInt(); sc.nextLine();

                                switch (opcion2) {
                                    case 1:
                                        dificultadPartida = 1;
                                        //Partida1.dificultad = 1;
                                        System.out.println("Dificultad Fácil Seleccionada");
                                        break;
                                    case 2:
                                        dificultadPartida = 2;
                                        //Partida1.dificultad = 2;
                                        System.out.println("Dificultad Moderada Seleccionada");
                                        break;
                                    case 3:
                                        dificultadPartida = 3;
                                        //Partida1.dificultad = 3;
                                        System.out.println("Dificultad Difícil Seleccionada");
                                        break;
                                    case 0:
                                        System.out.println("Cancelando...");
                                        break;
                                    default:
                                        System.out.println("Opccion no válida");
                                }
                                int num;
                                break;

                            case 2://Empieza la Partida
                                if (dificultadPartida != 0){
                                    Jugador player = new Jugador("");
                                    Partida Partida1 = new Partida(player, dificultadPartida);
                                    Partida1.iniciarPartida(dificultadPartida);
                                    do {
                                        System.out.println(hud.interfazJuego(Partida1));
                                        num = sc.nextInt(); sc.nextLine();
                                        Partida1.introducirDato(num);
                                    } while (num != Partida1.secreto.getNum());
                                    salir2 = true;
                                }else{
                                    System.out.println("Dificultad no Seleccionada");
                                }
                                break;
                            case 0://Cancelar
                                System.out.println("Cancelando...");
                                salir2 = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }while(!salir2);
                    
                    break;
                case 2://Mostrar Tabla Puntuacion
                    System.out.println("Historial");
                    //System.out.println(P1.historial);
                    System.out.print("Tu mejor partida: ");
                    //System.out.println(P1.getMejorIntento() + " intentos");
                    break;
                case 3://Mostrar Ranking
                    System.out.println("Se muestra el ranking");
                    break;
                case 0://Salir
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            
        }while(!salir);
    }
}