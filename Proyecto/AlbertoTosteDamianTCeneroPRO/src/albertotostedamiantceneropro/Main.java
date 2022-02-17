/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertotostedamiantceneropro;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Alberto Hernández Medina
 */
public class Main {
    
    public static void switchDificultad(int dificultadPartida, int opcion2){
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
    }
    
    public static void switchJuego(int dificultadPartida, int eleccion, Interfaz hud){
        Scanner sc = new Scanner(System.in);
        
        boolean salir2 = false;

        do {
            System.out.println(hud.menuJuego(dificultadPartida));
            eleccion = sc.nextInt(); sc.nextLine();

            switch (eleccion) {//menuJuego
                case 1://Selecciona Dificultad
                    System.out.println(hud.menuDificultad());
                    int opcion2 = sc.nextInt();
                    sc.nextLine();
                    
                    //Llama al metodo del siguienre menú
                    switchDificultad(dificultadPartida, opcion2);
                    int num;
                    break;
                case 2://Empieza la Partida
                    if (dificultadPartida != 0) {
                        Jugador player = new Jugador("");
                        Partida Partida1 = new Partida(player, dificultadPartida);
                        Partida1.iniciarPartida(dificultadPartida);
                        do {
                            System.out.println(hud.interfazJuego(Partida1));
                            num = sc.nextInt();
                            sc.nextLine();
                            Partida1.introducirDato(num);
                        } while (num != Partida1.secreto.getNum());
                        salir2 = true;
                    } else {
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
        } while (!salir2);
    }
    
    /**
     * Main
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap <String, Jugador> busquedaJugadores = new HashMap<>();
        TreeSet <Jugador> ordenarJugadorFac = new TreeSet<>(new Comparator<Jugador>() {
            @Override
            public int compare(Jugador p1, Jugador p2) {
                return Integer.compare(p1.mejorIntento, p2.mejorIntento);
            }
        });
        
        TreeSet <Jugador> ordenarJugadorMod = new TreeSet<>(new Comparator<Jugador>() {
            @Override
            public int compare(Jugador p1, Jugador p2) {
                return Integer.compare(p1.mejorIntento, p2.mejorIntento);
            }
        });
        
        TreeSet <Jugador> ordenarJugadorDif = new TreeSet<>(new Comparator<Jugador>() {
            @Override
            public int compare(Jugador p1, Jugador p2) {
                return Integer.compare(p1.mejorIntento, p2.mejorIntento);
            }
        });
        
        
        int dificultadPartida = 0;
        Interfaz hud = new Interfaz();
        
        boolean salir = false;
        
        System.out.println(hud.espacioHud());
        sc.nextLine();
        
        do{
            System.out.println(hud.menuInicio());
            int opcion = sc.nextInt(); sc.nextLine();
            
            switch(opcion){//menuInicio
                case 1://Jugar Partida
                    int eleccion = 0;
                    switchJuego(dificultadPartida, eleccion, hud);
                    
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