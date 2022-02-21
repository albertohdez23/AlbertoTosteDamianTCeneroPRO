/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdivinarNumero.Bitacora;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Alberto Hernández Medina
 */
public class MainBitacora {
    
    public static void switchModificarAnotacion(Anotacion A1, Interfaz hud){
        Scanner sc = new Scanner(System.in);
        
        System.out.println(hud.menuModificarAnotacionCabecera());
        String cab = sc.nextLine();
        
        A1.setCabecera(cab);
        
        System.out.println(hud.menuModificarAnotacionCuerpo());
        String body = sc.nextLine();
        
        A1.setCuerpo(body);
    }
    
    public static void switchAnotacion(Proyecto pro1, Interfaz hud) {
        Scanner sc = new Scanner(System.in);
        
        boolean salir = false;
        boolean hayAnotacion = false;
        Anotacion A1 = null;
        
        do {
            System.out.println(hud.menuAnotacion());
            int opcion = sc.nextInt(); sc.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println(hud.menuCrearAnotacionNombre());
                    String name = sc.nextLine();
                    
                    System.out.println(hud.menuCrearAnotacionCabecera());
                    String cabe = sc.nextLine();
                    
                    System.out.println(hud.menuCrearAnotacionCuerpo());
                    String body = sc.nextLine();
                    
                    A1 = new Anotacion(name, cabe, body);
                    pro1.anotacion.put(name, A1);
                    hayAnotacion = true;
                    break;
                case 2:
                    if (hayAnotacion) {
                        System.out.println(hud.menuCrearAnotacionNombre());
                        String nombre = sc.nextLine();

                        if (pro1.anotacion.containsKey(nombre)) {
                            switchModificarAnotacion(pro1.anotacion.get(nombre), hud);
                        } else {
                            System.out.println("La Anotacion no existe");
                        }
                    } else {
                        System.out.println("No existe ninguna Anotación");
                    }
                    break;
                case 3:
                    System.out.println(hud.menuElimiarAnotacion());
                    String nombre = sc.nextLine();
                    
                    if (pro1.anotacion.containsKey(nombre)) {
                        pro1.anotacion.remove(nombre);
                        System.out.println(hud.menuAnotacionEliminada(pro1.anotacion.get(nombre)));
                    } else {
                        System.out.println("La Anotacion no existe");
                    }
                    
                    break;
                case 4:
                    if (hayAnotacion) {
                        System.out.println(hud.menuCrearAnotacionNombre());
                        nombre = sc.nextLine();

                        if (pro1.anotacion.containsKey(nombre)) {
                            System.out.println(hud.menuMostrarAnotaciones(pro1.anotacion.get(nombre)));
                            sc.nextLine();
                        } else {
                            System.out.println("El proyecto no existe");
                        }
                    } else {
                        System.out.println("No existe ningún Proyecto");
                    }
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no válida");
                    break;
            }
        } while (!salir);
    }

    public static void switchModificarProyecto(Bitacora bit1, Proyecto pro1, Interfaz hud) {
        Scanner sc = new Scanner(System.in);
        
        boolean salir = false;

        do {
            System.out.println(hud.menuModificarProyectos(pro1));
            int opcion = sc.nextInt();sc.nextLine();
            
            Proyecto pro2 = null;
            
            switch (opcion) {
                case 1:
                    //Modificar Nombre
                    System.out.println(hud.menuModificarNombre());
                    String name = sc.nextLine();
                    
                    pro1.setNombre(name);
                    System.out.println("El nombre se ha cambiado correctamente");
                    break;
                case 2:
                    //Modificar Descripcion
                    System.out.println(hud.menuModificarDescripción());
                    String desc = sc.nextLine();
                    
                    pro1.setDescripcion(desc);
                    System.out.println("La descripción se ha cambiado correctamente");
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no válida");
                    break;
            }
        } while (!salir);
    }

    public static void switchProyecto(Bitacora bit1, Interfaz hud) {
        Scanner sc = new Scanner(System.in);
        
        boolean hayProyecto = false;
        Proyecto pro1 = null;
        boolean salir = false;

        do {
            System.out.println(hud.menuProyectos());
            int opcion = sc.nextInt(); sc.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println(hud.menuCrearProyectos());
                    String name = sc.nextLine();
                    System.out.println(hud.menuCrearProyectoDescripcion());
                    String descrip = sc.nextLine();

                    pro1 = new Proyecto(name, descrip);
                    bit1.Proyecto.put(name, pro1);
                    hayProyecto = true;
                    break;
                case 2:
                    if (hayProyecto) {
                        System.out.println(hud.menuBuscarProyectos());
                        String nombre = sc.nextLine();
                        
                        if(bit1.Proyecto.containsKey(nombre)){
                            switchModificarProyecto(bit1, bit1.Proyecto.get(nombre), hud);
                        }else{
                            System.out.println("El proyecto no existe");
                        }
                    } else {
                        System.out.println("No existe ningún Proyecto");
                    }
                    break;
                case 3:
                    if (hayProyecto) {
                        System.out.println(hud.menuElimiarProyecto());
                        String nombre = sc.nextLine();

                        if (bit1.Proyecto.containsKey(nombre)) {
                            bit1.Proyecto.remove(nombre);
                            System.out.println(hud.menuProyectoEliminado(bit1.Proyecto.get(nombre)));
                        } else {
                            System.out.println("El proyecto no existe");
                        }
                    }else {
                        System.out.println("No existe ningún Proyecto");
                    }
                    break;
                case 4:
                    if (hayProyecto) {
                        System.out.println(hud.menuElegirProyectos());
                        String nombre = sc.nextLine();

                        if (bit1.Proyecto.containsKey(nombre)) {
                            System.out.println(hud.menuMostrarProyecto(bit1.Proyecto.get(nombre)));
                            sc.nextLine();
                        } else {
                            System.out.println("El proyecto no existe");
                        }
                    } else {
                        System.out.println("No existe ningún Proyecto");
                    }
                    break;
                case 5:
                    if (hayProyecto) {
                        switchAnotacion(pro1, hud);
                    } else {
                        System.out.println("No existe ningún Proyecto");
                    }
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no válida");
                    break;
            }
        } while (!salir);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Interfaz hud = new Interfaz();
        
        System.out.println(hud.espacioHud());
        sc.nextLine();
        
        System.out.println(hud.menuCrearBitacora());
        String name = sc.nextLine();

        Bitacora bit1 = new Bitacora(name);
        
        boolean salir = false;
        boolean hayProyecto = false;
        
        do {
            System.out.println(hud.menuInicio());
            int opcion = sc.nextInt(); sc.nextLine();
            
            switch (opcion) {
                case 1:
                    TreeSet<Proyecto> p1 = bit1.getProyectoFecha();
                    System.out.println(hud.menuMostrarBitacora(p1));
                    break;
                case 2:
                    switchProyecto(bit1, hud);
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no válida");
                    break;
            }
        } while (!salir);
    }
}
