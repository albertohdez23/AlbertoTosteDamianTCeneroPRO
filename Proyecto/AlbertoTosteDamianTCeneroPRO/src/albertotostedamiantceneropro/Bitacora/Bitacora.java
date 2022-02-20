/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertotostedamiantceneropro.Bitacora;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Esta clase define la estructura del buscador de proyectos creados El usuario
 * podrá tanto buscar, borrar y observar los proyectos creados
 *
 * @author JDamian
 */
public class Bitacora {

    String nombre;
    TreeMap<String, Proyecto> Proyecto;
    TreeSet<Proyecto> proyectoFecha;

    public Bitacora(String nombre) {
        this.nombre = nombre;
        Proyecto = new TreeMap<>();
        proyectoFecha = new TreeSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeMap<String, Proyecto> getProyecto() {
        return Proyecto;
    }

    public TreeSet<Proyecto> getProyectoFecha() {
        return proyectoFecha;
    }

}
