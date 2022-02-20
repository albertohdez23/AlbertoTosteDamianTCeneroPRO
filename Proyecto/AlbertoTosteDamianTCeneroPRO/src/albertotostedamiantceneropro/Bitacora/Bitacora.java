/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertotostedamiantceneropro.Bitacora;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * Esta clase define la estructura del buscador de proyectos creados El usuario
 * podrá tanto buscar, borrar y observar los proyectos creados
 *
 * @author JDamian
 */
public class Bitacora {

    String nombre;
    HashMap<String, Proyecto> Proyecto;
    TreeSet<Proyecto> proyectoFecha;

    public Bitacora(String nombre) {
        this.nombre = nombre;
        Proyecto = new HashMap<>();
        proyectoFecha = new TreeSet<>((Proyecto o1, Proyecto o2) -> o1.getFecha().compareTo(o2.getFecha()));
    }

    public Bitacora() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<String, Proyecto> getProyecto() {
        return Proyecto;
    }

    public void setProyecto(HashMap<String, Proyecto> Proyecto) {
        this.Proyecto = Proyecto;
    }

    public TreeSet<Proyecto> getProyectoFecha() {
        proyectoFecha.addAll(Proyecto.values());
        return proyectoFecha;
    }

    public void setProyectoFecha(TreeSet<Proyecto> proyectoFecha) {
        this.proyectoFecha = proyectoFecha;
    }
     
}
