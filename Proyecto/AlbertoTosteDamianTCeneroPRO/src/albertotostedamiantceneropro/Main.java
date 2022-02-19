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
    
    public static int switchDificultad(int dificultadPartida, int opcion2){
        switch (opcion2) {
            case 1:
                dificultadPartida = 1;
                //Partida1.dificultad = 1;
                
                break;
            case 2:
                dificultadPartida = 2;
                //Partida1.dificultad = 2;
                
                break;
            case 3:
                dificultadPartida = 3;
                //Partida1.dificultad = 3;
                
                break;
            case 0:
                
                break;
            default:
                
        }
        return dificultadPartida;
    }
    
    public static void switchJuego(int dificultadPartida, int eleccion, Interfaz hud){
        Scanner sc = new Scanner(System.in);
        
        boolean salir2 = false;
        boolean salirjuego = false;
        
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
                        num = 0;
                        
                        do {
                            if (num == Partida1.secreto.getNum()) {
                                salirjuego = true;
                            }
                            System.out.println(hud.interfazJuego(Partida1));
                            if (!salirjuego) {
                                num = sc.nextInt();
                                sc.nextLine();
                            } else {
                                sc.nextLine();
                            }
                            Partida1.introducirDato(num);
                        } while (!salirjuego);
                        /*
                        System.out.println(hud.ponerNombreJugador());
                        player.setNombre(sc.nextLine());
                        System.out.println(hud.nombreJugador(player, Partida1));
                        sc.nextLine();
                        */
                        salir2 = true;
                    }else {
                        
                    }
                    break;
                case 0://Cancelar
                    ;
                    salir2 = true;
                    break;
                default:
                    
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
                return Integer.compare(p1.mejorIntentoF, p2.mejorIntentoF);
            }
        });
        
        TreeSet <Jugador> ordenarJugadorMod = new TreeSet<>(new Comparator<Jugador>() {
            @Override
            public int compare(Jugador p1, Jugador p2) {
                return Integer.compare(p1.mejorIntentoM, p2.mejorIntentoM);
            }
        });
        
        TreeSet <Jugador> ordenarJugadorDif = new TreeSet<>(new Comparator<Jugador>() {
            @Override
            public int compare(Jugador p1, Jugador p2) {
                return Integer.compare(p1.mejorIntentoD, p2.mejorIntentoD);
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
                    switchJuego(0, 0, hud);
                    break;
                case 2://Mostrar Tabla Puntuacion
                    
                    Jugador p1 = new Jugador("Abcs");
                    p1.setHistorialFacil(10);
                    p1.setHistorialFacil(10);
                    p1.setHistorialFacil(10);
                    p1.setHistorialFacil(10);
                    p1.setHistorialFacil(10);
                    p1.setHistorialFacil(10);
                    p1.setHistorialFacil(10);
                    p1.setHistorialFacil(10);
                    p1.setHistorialFacil(10);
                    p1.setHistorialFacil(10);
                    p1.setHistorialFacil(10);
                    p1.setHistorialFacil(10);
                    p1.setHistorialFacil(10);
                    p1.setHistorialFacil(10);
                    p1.setHistorialFacil(10);
                    p1.setHistorialFacil(10);
                    p1.setHistorialMedio(10);
                    p1.setHistorialMedio(10);
                    p1.setHistorialMedio(10);
                    p1.setHistorialDificil(10);
                            
                    System.out.println(hud.Historial(p1));
                    sc.nextLine();
                    
                    //System.out.println(P1.getMejorIntento() + " intentos");
                    break;
                case 3://Mostrar Ranking
                    
                    break;
                case 0://Salir
                    salir = true;
                    break;
                default:
                    
                    break;
            }
            
        }while(!salir);
    }
}