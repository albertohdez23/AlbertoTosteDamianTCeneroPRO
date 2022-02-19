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

    public static int switchDificultad(int opcion2) {
        int dificultadPartida = 0;
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

    public static void switchJuego(int eleccion, Interfaz hud, HashMap busquedaJugadores) {
        Scanner sc = new Scanner(System.in);

        boolean salir2 = false;
        boolean salirjuego = false;
        int dificultadPartida = 0;

        do {
            System.out.println(hud.menuJuego(dificultadPartida));
            eleccion = sc.nextInt();
            sc.nextLine();

            switch (eleccion) {//menuJuego
                case 1://Selecciona Dificultad
                    System.out.println(hud.menuDificultad());
                    int opcion2 = sc.nextInt();
                    sc.nextLine();

                    //Llama al metodo del siguienre menú
                    dificultadPartida = switchDificultad(opcion2);
                    int num;
                    break;
                case 2://Empieza la Partida
                    if (dificultadPartida != 0) {

                        Partida Partida1 = new Partida(dificultadPartida);
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
                        System.out.println(hud.ponerNombreJugador());
                        String nombreJugador = sc.nextLine();

                        if (busquedaJugadores.containsKey(nombreJugador)) {
                            Partida1.terminarPartida((Jugador) busquedaJugadores.get(nombreJugador));
                            System.out.println(hud.nombreJugador((Jugador) busquedaJugadores.get(nombreJugador), Partida1));
                            sc.nextLine();
                        } else {
                            Jugador player = new Jugador("");
                            player.setNombre(nombreJugador);
                            Partida1.terminarPartida(player);
                            System.out.println(hud.nombreJugador(player, Partida1));
                            busquedaJugadores.put(player.getNombre(), player);
                            sc.nextLine();
                        }

                        salir2 = true;
                    } else {

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
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Jugador> busquedaJugadores = new HashMap<>();
        TreeSet<Jugador> ordenarJugadorFac = new TreeSet<>(new Comparator<Jugador>() {
            @Override
            public int compare(Jugador p1, Jugador p2) {
                return Integer.compare(p1.mejorIntentoF, p2.mejorIntentoF);
            }
        });

        TreeSet<Jugador> ordenarJugadorMod = new TreeSet<>(new Comparator<Jugador>() {
            @Override
            public int compare(Jugador p1, Jugador p2) {
                return Integer.compare(p1.mejorIntentoM, p2.mejorIntentoM);
            }
        });

        TreeSet<Jugador> ordenarJugadorDif = new TreeSet<>(new Comparator<Jugador>() {
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

        do {
            System.out.println(hud.menuInicio());
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {//menuInicio
                case 1://Jugar Partida
                    switchJuego(0, hud, busquedaJugadores);
                    break;
                case 2://Mostrar Tabla Puntuacion
                    if(busquedaJugadores.isEmpty()) {
                            System.out.println(hud.jugadoresNoRegistrados());
                            sc.nextLine();
                        }else{
                        System.out.println(hud.BuscarJugador());
                        String identificador = sc.nextLine();
                        if (busquedaJugadores.containsKey(identificador)) {
                            System.out.println(hud.Historial(busquedaJugadores.get(identificador)));
                            sc.nextLine();
                        } else{
                            System.out.println(hud.jugadoresNoEncontrado());
                            sc.nextLine();
                        }
                    }
                    break;
                case 3://Mostrar Ranking

                    break;
                case 0://Salir
                    salir = true;
                    break;
                default:

                    break;
            }

        } while (!salir);
    }
}
