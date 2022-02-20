/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertotostedamiantceneropro.Bitacora;

import java.util.TreeSet;
import java.util.Date;
import java.util.HashMap;

/**
 * Esta clase define la estructura de los proyectos que introducirá el usuario
 * Así mismo, las anotaciones que se introduzcan sobre el proyecto, serán
 * ordenadas por fecha
 *
 * @author JDamian
 */
public class Proyecto {
    String nombre;
    String descripcion;
    Date fecha;
    HashMap<String, Anotacion> anotacion;
    TreeSet<Anotacion> anotacionesOrdenPorFecha;

    public Proyecto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        anotacion = new HashMap<>();
        anotacionesOrdenPorFecha = new TreeSet<>((Anotacion a1, Anotacion a2) -> a1.getFechaAnotacion().compareTo(a2.getFechaAnotacion()));
    }

    public Proyecto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public HashMap<String, Anotacion> getAnotacion() {
        return anotacion;
    }

    public TreeSet<Anotacion> getFechaAnotaciones() {
        return anotacionesOrdenPorFecha;
    }
    
    
}
