/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertotostedamiantceneropro.Bitacora;

import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Date;

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
    TreeMap<String, Anotacion> anotacion;
    TreeSet<Anotacion> anotacionesOrdenPorFecha;

    public Proyecto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        anotacion = new TreeMap<>();
        anotacionesOrdenPorFecha = new TreeSet<>((Anotacion o1, Anotacion o2) -> o1.votos - o2.votos);;
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

    public TreeMap<String, Anotacion> getAnotacion() {
        return anotacion;
    }

    public TreeSet<Anotacion> getFechaAnotaciones() {
        return anotacionesOrdenPorFecha;
    }
    
    
}
