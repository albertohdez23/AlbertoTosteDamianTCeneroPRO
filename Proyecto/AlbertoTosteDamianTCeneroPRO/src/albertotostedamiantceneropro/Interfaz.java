/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertotostedamiantceneropro;

/**
 * La clase Interfaz es la encargada de mostrar todo en pantalla, desde el menu inicial,
 * el HUD de la partida, o la tabla de puntuaciones.
 * @author Alejandro Toste
 */
public class Interfaz {
    
    /**
     * Muestra el menu de inicio. 
     * @return String con saltos de linea con la estructura del menu.
     */
    public String menuInicio(){
        String res = "";
        
        res += "+---------------Menú---------------+\n";
        res += "|1. Jugar una pratida              |\n";
        res += "|2. Mostrar la tabla de puntuación |\n";
        res += "|3. Salir                          |\n";
        res += "+----------------------------------+\n";
        
        return res;
    }   
    /**
     * Muestra el menu para empezar el juego con sus opciones.
     * Cuando se eliga una dificultad, la opción de la dificultad se actualizará a la dificultad actual
     * @return String con saltos de linea con la estructura del menu.
     */
        public String menuJuego(){
        String res = "";
        int esp = 31; // espacios totales para el recuadrod
        String dificultad="";
        int gDificultad = 1; // CAMBIAR
            switch (gDificultad) { // Definir el String de dificultad para calcular el espacio sobrantes //CAMBIAR
                case 1:
                    dificultad = "Fácil";
                    break;
                case 2:
                    dificultad = "Moderada";
                    break;
                case 3:
                    dificultad = "Difícil";
                    break;
                default:
                    dificultad = "Elegir dificultad";
            }
        
        
        String espacios = "";
            for (int i = 0; i < esp - dificultad.length(); i++) { //Calculo del espacio sobrante
                espacios += " ";
            }
            
            
        res += "+-----------Menú de juego----------+\n";
        res += "|1. " + dificultad + espacios +   "|\n";
        res += "|2. Empezar juego.                 |\n";
        res += "|3. Cancelar.                      |\n";
        res += "+----------------------------------+\n";
        
        return res;
    }
        /**
     * Muestra el menu para la eleccion de la dificultad con sus opciones.
     * @return String con saltos de linea con la estructura del menu.
     */
        public String menuDificultad(){
        String res = "";
        
        res += "+--------Menú de dificultad--------+\n";
        res += "|1. Fácil.                         |\n";
        res += "|2. Moderada.                      |\n";
        res += "|3. Difícil.                       |\n";
        res += "|3. Cancelar.                      |\n";
        res += "+----------------------------------+\n";
        
        return res;
    }
     /** Muestra el menu para la eleccion de la dificultad con sus opciones.
     * @return String con saltos de linea con la estructura del menu.
     */
        public String interfazJuego(){
        String res = "";
        int gDificultad = 3;
        
        int fallos=0;
        String contenedor1 = "["+fallos+"]";
        
        
       /* 
        switch (gDificultad) { // Definir el String de dificultad para calcular el espacio sobrantes en el rango
                case 1:
                     = "Fácil";
                    break;
                case 2:
                    dificultad = "Moderada";
                    break;
                case 3:
                    dificultad = "Difícil";
                    break;
                default:
                    dificultad = "Elegir dificultad";
            }
        */
            res += "+--------------------------------+\n";
            res += "+                                +\n";
            res += "+--------------------------------+\n";
        return res;
    }
    public String espacioHud(){
        String res ="";
        
        return res;
    }    
    
}
