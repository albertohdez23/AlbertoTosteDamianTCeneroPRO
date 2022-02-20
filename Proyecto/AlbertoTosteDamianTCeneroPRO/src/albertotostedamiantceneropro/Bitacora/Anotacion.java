/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertotostedamiantceneropro.Bitacora;

import java.util.Date;

/**
 * Nota que sirve de aviso, recordatorio, comentario o aclaración sobre un Proyecto.
 * @author Alberto Hernández Medina
 */
public class Anotacion{
    Date fechaAnotacion;
    String nombre;
    String cabecera;
    String cuerpo;

    /**
     * Constructor de Anotacion
     * @param nombre recibe el nombre de la anotacion
     * @param cabecera recibe una pequeña frase que resuma el contenido
     * @param cuerpo recibe todo el contenido de forma larga y tendida
     */
    public Anotacion(String nombre, String cabecera, String cuerpo) {
        this.fechaAnotacion = new Date();
        this.nombre = nombre;
        this.cabecera = cabecera;
        this.cuerpo = cuerpo;
    }

    public Anotacion() {
    }

    public Date getFechaAnotacion() {
        return fechaAnotacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCabecera() {
        return cabecera;
    }

    public String getCuerpo() {
        return cuerpo;
    }
    
    //No hay toString ya que de eso se encargará otra clase
}