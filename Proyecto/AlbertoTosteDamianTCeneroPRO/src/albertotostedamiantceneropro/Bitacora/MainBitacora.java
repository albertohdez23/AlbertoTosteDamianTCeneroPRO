/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertotostedamiantceneropro.Bitacora;

import java.util.Scanner;

/**
 *
 * @author Alberto Hernández Medina
 */
public class MainBitacora {
    
    public static void switchModificarAnotacion(Anotacion A1){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la cabecera:");
        String cab = sc.nextLine();
        
        A1.setCabecera(cab);
        
        System.out.println("Introduce el cuerpo");
        String body = sc.nextLine();
        
        A1.setCuerpo(body);
    }
    
    public static void switchAnotacion(Proyecto pro1) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("==========");
        System.out.println("1.- Crear Anotación");
        System.out.println("2.- Modificar Anotación");
        System.out.println("3.- Eliminar Anotación");
        System.out.println("0.- Cancelar");

        int opcion = sc.nextInt(); sc.nextLine();
        boolean salir = false;
        
        boolean hayAnotacion = false;
        Anotacion A1 = null;
        
        do {
            switch (opcion) {
                case 1:
                    System.out.println("Indique el Nombre");
                    String name = sc.nextLine();
                    
                    System.out.println("Escriba la cabecera");
                    String cabe = sc.nextLine();
                    
                    System.out.println("Escriba el cuerpo");
                    String body = sc.nextLine();
                    
                    A1 = new Anotacion(name, cabe, body);
                    pro1.anotacion.put(name, A1);
                    hayAnotacion = true;
                    break;
                case 2:
                    if (hayAnotacion) {
                        System.out.println("Indique el nombre");
                        String nombre = sc.nextLine();

                        if (pro1.anotacion.containsKey(nombre)) {
                            switchModificarAnotacion(pro1.anotacion.get(nombre));
                        } else {
                            System.out.println("La Anotacion no existe");
                        }
                    } else {
                        System.out.println("No existe ninguna Anotación");
                    }
                    break;
                case 3:
                    System.out.println("Introduzca el nombre de la Anotación");
                    String nombre = sc.nextLine();
                    
                    if (pro1.anotacion.containsKey(nombre)) {
                        pro1.anotacion.remove(nombre);
                        System.out.println("La anotación ha sido eliminada");
                    } else {
                        System.out.println("La Anotacion no existe");
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

    public static void switchModificarProyecto(Proyecto pro1) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("==========");
        System.out.println("1.- Modificar Nombre");
        System.out.println("2.- Modificar Descripcion");
        System.out.println("0.- Cancelar");

        int opcion = sc.nextInt(); sc.nextLine();
        boolean salir = false;

        do {
            switch (opcion) {
                case 1:
                    //Modificar Nombre
                    System.out.println("Indique el Nombre:");
                    String name = sc.nextLine();
                    
                    pro1.setNombre(name);
                    System.out.println("El nombre se ha cambiado correctamente");
                    break;
                case 2:
                    //Modificar Descripcion
                    System.out.println("Indique el Descripcion:");
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

    public static void switchProyecto(Bitacora bit1) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("==========");
        System.out.println("1.- Crear Proyecto");
        System.out.println("2.- Modificar Proyecto");
        System.out.println("3.- Eliminar Proyecto");
        System.out.println("4.- Mostrar Proyecto");
        System.out.println("5.- Organizar Anotaciones");
        System.out.println("0.- Cancelar");

        int opcion = sc.nextInt(); sc.nextLine();
        boolean salir = false;
        
        boolean hayProyecto = false;
        Proyecto pro1 = null;
        
        do {
            switch (opcion) {
                case 1:
                    System.out.println("Indique el Nombre:");
                    String name = sc.nextLine();
                    System.out.println("Escriba una pequeña descripcion");
                    String descrip = sc.nextLine();

                    pro1 = new Proyecto(name, descrip);
                    bit1.Proyecto.put(name, pro1);
                    hayProyecto = true;
                    break;
                case 2:
                    if (hayProyecto) {
                        System.out.println("Indique el nombre");
                        String nombre = sc.nextLine();
                        
                        if(bit1.Proyecto.containsKey(nombre)){
                            switchModificarProyecto(bit1.Proyecto.get(nombre));
                        }else{
                            System.out.println("El proyecto no existe");
                        }
                    } else {
                        System.out.println("No existe ningún Proyecto");
                    }
                    break;
                case 3:
                    System.out.println("Introduzca el nombre del Proyecto");
                    String nombre = sc.nextLine();
                    
                    if (bit1.Proyecto.containsKey(nombre)) {
                        bit1.Proyecto.remove(nombre);
                        System.out.println("El proyecto ha sido eliminado");
                    } else {
                        System.out.println("El proyecto no existe");
                    }
                    break;
                case 4:
                    //Se añade el metodo de inetrfaz mostarProyecto
                    break;
                case 5:
                    if (hayProyecto) {
                        switchAnotacion(pro1);
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

        System.out.println("Indique el Nombre:");
        String name = sc.nextLine();

        Bitacora bit1 = new Bitacora(name);
        
        System.out.println("MENU");
        System.out.println("==========");
        System.out.println("1.- Mostrar Bitácora");
        System.out.println("2.- Organizar Proyecto");
        System.out.println("0.- Salir");

        int opcion = sc.nextInt();sc.nextLine();
        boolean salir = false;
        
        do {
            switch (opcion) {
                case 1:
                    //Se añade el metodo de inetrfaz mostarBitacora
                    break;
                case 2:
                    switchProyecto(bit1);
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
