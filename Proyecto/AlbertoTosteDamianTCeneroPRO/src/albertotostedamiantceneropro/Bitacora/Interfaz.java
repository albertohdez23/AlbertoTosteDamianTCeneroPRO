/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertotostedamiantceneropro.Bitacora;

import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author Alejandro Toste
 */
public class Interfaz {

    
    
    
    /**
     * Muestra el menu de inicio.
     *
     * @return String con saltos de linea con la estructura del menu.
     */
    public String menuInicio() { //hecho
        String res = "";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+---------------Menú---------------+\n";
        res += "|1. Mostrar bitácora               |\n";
        res += "|2. Organizar proyecto             |\n";
        res += "|0. Salir                          |\n";
        res += "+----------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }

    public String menuCrearBitacora() {//hecho

        String res = "";

        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|            Pon un nombre a la bitácora             |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }

    public String menuMostrarBitacora(TreeSet<Proyecto> proyectoFecha) { //hecho
        
        String res = "";
        
        for (Proyecto p: proyectoFecha) {
            res += p.nombre + "  " + p.fecha + "\n";
        }
        return res;
    }

    /**
     * Muestra el menu para empezar el juego con sus opciones. Cuando se eliga
     * una dificultad, la opción de la dificultad se actualizará a la dificultad
     * actual
     *
     * @return String con saltos de linea con la estructura del menu.
     */
    public String menuProyectos() {//hecho
        String res = "";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+---------Menú de Proyectos--------+\n";
        res += "|1. Crear proyecto                 |\n";
        res += "|2. Modificar Proyecto             |\n";
        res += "|3. Eliminar proyecto              |\n";
        res += "|4. Mostrar proyecto               |\n";
        res += "|5. Organizar anotaciones          |\n";
        res += "|0. Cancelar                       |\n";
        res += "+----------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";
        return res;
    }

    public String menuElegirProyectos() {//hecho
        String res = "";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|              Que proyecto quieres ver              |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";
        return res;
    }

    public String menuMostrarProyecto(Proyecto p) {//hecho
        String res = "";
        String nombrePro = p.nombre;
        String descripcionPro = p.descripcion;

        String nombre = "";
        if (nombrePro.length() > 20) {
            for (int i = 0; i < (int) (nombrePro.length() / 20); i+=20) {
                for (int j = i; j < nombrePro.length(); j++) {
                    nombre += nombrePro.charAt(i);
                }
                nombre += "\n";
            }
        }else{
            nombre = nombrePro + "\n";
        }
        
        String descripcion = "";
        if (descripcionPro.length() > 20) {
            for (int i = 0; i < (int) (descripcionPro.length() / 20); i+=20) {
                for (int j = i; j < descripcionPro.length(); j++) {
                    descripcion += descripcionPro.charAt(i);
                }
                descripcion += "\n";
            }
        }else{
            descripcion = descripcionPro + "\n";
        }
        
        res += nombre;
        res += descripcion;
        
        
        return res;
    }

    public String menuCrearProyectos() {//hecho
        String res = "";

        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|             Pon un nombre al proyecto              |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }
    
    public String menuBuscarProyectos() {//hecho
        String res = "";

        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|          Escribe el nombre del proyecto            |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }
    
    public String menuModificarProyectos(Proyecto p) {//hecho
        String res = "";
        String proyecto = p.getNombre();
        String esp = "";
        if (proyecto.length() > 20) {
            proyecto = proyecto.substring(0, 20);
        }
        for (int i = 0; i < 20 - proyecto.length(); i++) {
            esp += " ";
        }
        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+---------Menú de Proyectos--------+\n";
        res += "| " + proyecto + esp + "            |\n";
        res += "|1. Modificar nombre               |\n";
        res += "|2. Modificar descripción          |\n";
        res += "|0. Cancelar                       |\n";
        res += "+----------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }

    public String menuModificarNombre() {//hecho
        String res = "";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|           Cambie el nombre del proyecto            |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }

    public String menuModificarDescripción() {//hecho
        String res = "";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|        Cambie la descripcion del proyecto          |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }

    public String menuElimiarProyecto() {//hecho

        String res = "";

        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|       Ponga el nombre del proyecto a eliminar      |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }

    public String menuProyectoEliminado(Proyecto p) {//hehco

        String res = "";
        String proyecto = p.getNombre();
        String esp = "";
        if (proyecto.length() > 18) {
            proyecto = proyecto.substring(0, 18);
        }
        for (int i = 0; i < 18 - proyecto.length(); i++) {
            esp += " ";
        }
        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|      Se ha eliminado el proyecto: " + proyecto + esp + "|\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }

    /**
     * Muestra el menu para la eleccion de la dificultad con sus opciones.
     *
     * @return String con saltos de linea con la estructura del menu.
     */
    public String menuAnotacion() {//hecho
        String res = "";

        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+---------Menú de Anotación--------+\n";
        res += "|1. Crear Anotacion                |\n";
        res += "|2. Modificar anotación            |\n";
        res += "|3. Eliminar anotación             |\n";
        res += "|4. Mostrar anotación              |\n";
        res += "|0. Cancelar.                      |\n";
        res += "+----------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }

    public String menuCrearAnotacionNombre() {//hecho
        String res = "";

        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|           Ponga el nombre de la anotación          |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }
    
    public String menuCrearAnotacionCuerpo() {//hecho
        String res = "";

        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|           Ponga el cuerpo de la anotación          |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }
    
    public String menuCrearAnotacionCabecera() {//hecho
        String res = "";

        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|          Ponga la cabecera de la anotación         |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }

    public String menuCrearProyectoDescripcion() {//hecho
        String res = "";

        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|         Ponga la descripción del proyecto          |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }

    public String menuModificarAnotacionCuerpo() {//hecho
        String res = "";

        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|       Ponga el nuevo cuerpo de la anotación        |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }

    public String menuModificarAnotacionCabecera() {//hecho
        String res = "";

        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|      Ponga la nueva cabecera de la anotación       |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }

    public String menuElimiarAnotacion() {//hecho

        String res = "";

        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|     Ponga el nombre de la anotacion a eliminar     |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;
    }

    public String menuAnotacionEliminada(Anotacion a) {//hecho

        String res = "";
        String anot = a.getNombre();
        String esp = "";
        if (anot.length() > 18) {
            anot = anot.substring(0, 18);
        }
        for (int i = 0; i < 18 - anot.length(); i++) {
            esp += " ";
        }
        res += "\n";
        res += "\n";
        res += "\n";
        res += "\n";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|      Se ha eliminado la anotacion: " + anot + esp + "|\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+\n";
        res += "\n";
        res += "\n";
        res += "\n";

        return res;

    }
    public String menuMostrarAnotaciones(Anotacion a) {//hecho
        String res = "";
        String nombreAnot = a.nombre;
        String descripcionAnot = a.cuerpo;

        String nombre = "";
        if (nombreAnot.length() > 20) {
            for (int i = 0; i < (int) (nombreAnot.length() / 20); i+=20) {
                for (int j = i; j < nombreAnot.length(); j++) {
                    nombre += nombreAnot.charAt(i);
                }
                nombre += "\n";
            }
        }else{
            nombre = nombreAnot + "\n";
        }
        
        String descripcion = "";
        if (descripcionAnot.length() > 20) {
            for (int i = 0; i < (int) (descripcionAnot.length() / 20); i+=20) {
                for (int j = i; j < descripcionAnot.length(); j++) {
                    descripcion += descripcionAnot.charAt(i);
                }
                descripcion += "\n";
            }
        }else{
            descripcion = descripcionAnot + "\n";
        }
        
        res += nombre ;
        res += a.cabecera + "\n";
        res += a.fechaAnotacion + "\n";
        res += descripcion;
        
        
        return res;
    }
    public String menuMostrarTodasLasAnotaciones(TreeSet<Anotacion> a ) {
        String res = "";
        
        for (Anotacion ano: a) {
            res += ano.nombre + "  " + ano.fechaAnotacion + "\n";
        }
        
        return res;
    }

    /**
     * Muestra el menu para la interfaz.
     *
     * @return String con saltos de linea con la estructura del menu.
     */
    /**
     * Este menú indica al jugador que ajuste la vista de la terminal a solo lo
     * que se muestra para que solo se muestre un menu a la vez en pantalla.
     *
     * @return
     */
    public String espacioHud() {
        String res = "";
        res += "+----------------------------------------------------+\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|   Deja visible solo este espacio en la pantalla,   |\n";
        res += "|                 luego pulse enter                  |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "|                                                    |\n";
        res += "+----------------------------------------------------+";
        return res;
    }

}