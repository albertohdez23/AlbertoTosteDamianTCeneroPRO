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
        
        res += "\n";     
        res += "\n"; 
        res += "\n"; 
        res += "\n"; 
        res += "\n"; 
        res += "+---------------Menú---------------+\n";
        res += "|1. Jugar una pratida              |\n";
        res += "|2. Mostrar la tabla de puntuación |\n";
        res += "|3. Mostrar Ranking                |\n";
        res += "|0. Salir                          |\n";
        res += "+----------------------------------+\n";
        res += "\n"; 
        res += "\n"; 
        res += "\n"; 
        res += "\n"; 
        
        return res;
    }   
    /**
     * Muestra el menu para empezar el juego con sus opciones.
     * Cuando se eliga una dificultad, la opción de la dificultad se actualizará a la dificultad actual
     * @return String con saltos de linea con la estructura del menu.
     */
        public String menuJuego(int diff){
        String res = "";
        int esp = 31; 
        String dificultad="";
        int gDificultad = diff; 
            switch (gDificultad) {
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
        res += "\n";     
        res += "\n"; 
        res += "\n"; 
        res += "\n"; 
        res += "\n";   
        res += "+-----------Menú de juego----------+\n";
        res += "|1. " + dificultad + espacios +   "|\n";
        res += "|2. Empezar juego.                 |\n";
        res += "|0. Cancelar.                      |\n";
        res += "+----------------------------------+\n";
        res += "\n"; 
        res += "\n"; 
        res += "\n"; 
        res += "\n"; 


                return res;
    }
        /**
     * Muestra el menu para la eleccion de la dificultad con sus opciones.
     * @return String con saltos de linea con la estructura del menu.
     */
        public String menuDificultad(){
        String res = "";
        
        res += "\n"; 
        res += "\n"; 
        res += "\n"; 
        res += "\n"; 
        res += "+--------Menú de dificultad--------+\n";
        res += "|1. Fácil.                         |\n";
        res += "|2. Moderada.                      |\n";
        res += "|3. Difícil.                       |\n";
        res += "|0. Cancelar.                      |\n";
        res += "+----------------------------------+\n";
        res += "\n"; 
        res += "\n"; 
        res += "\n"; 
        
        
        return res;
    }
     /** Muestra el menu para la interfaz.
     * @return String con saltos de linea con la estructura del menu.
     */
        public String interfazJuego(Partida p){
            
        String res = "";
        String rango = "";
        
        int gDificultad = p.getDificultad();
        int esp = 32;
        
        String espacios= ""; 
        int fallos=p.getFallos();
        
        String espMayor= "";
        String mayor = "" + p.getMayorQue();
        String espMenor= "";
        String menor = "" + p.getMenorQue();
        
        int numsecreto = p.secretoAEnviar();
        String secreto ="";
        
            if (numsecreto < 10) {
                secreto = "___" + numsecreto +  "____";
            }
            if (numsecreto > 10 && numsecreto < 100) {
                secreto = "___" + numsecreto +  "___";
            }
            if (numsecreto > 99) {
                secreto = "__" + numsecreto +  "___";
            }
            if (numsecreto == -1) {
                secreto = "________";
            }
        
        for (int i = 0; i < 6 - mayor.length(); i++) {
                espMayor += " ";
            }
        
        for (int i = 0; i < 6 - menor.length(); i++) {
                espMenor += " ";
            }
        
        String contenedor1 = "[ "+fallos+" ]";
        for (int i = 0; i <   esp - contenedor1.length() -20; i++) {
                espacios += " ";
            }
        
        
       
        switch (gDificultad) {
                case 1:
                    rango = "  Rango: [0 - 25]  ";
                    break;
                case 2:
                    rango = "  Rango: [0 - 50]  ";
                    break;
                case 3:
                    rango = "  Rango: [0 - 100] ";
                    break;
                
            }
        
            res += "+----------------------------------------------------+\n";            
            res += "|  "+rango+"       fallos:     "+ contenedor1 + espacios + "|\n";
            res += "|                                                    |\n";
            res += "|                                                    |\n";
            res += "|     Mayor que                        Menor que     |\n";
            res += "|  +-------------+                  +-------------+  |\n";
            res += "|  |             |                  |             |  |\n";
            res += "|  | "+ espMayor +mayor + "      |                  |      " + menor + espMenor +" |  |\n";
            res += "|  |             |                  |             |  |\n";
            res += "|  +-------------+     "+ secreto +"     +-------------+  |\n";
            res += "|                                                    |\n";
            res += "|                                                    |\n";
            res += "+----------------------------------------------------+\n";
        return res;
    }
        
        /**
         * Este menú indica al jugador que ajuste la vista de la terminal a solo lo que se muestra para
         * que solo se muestre un menu a la vez en pantalla.
         * @return 
         */
    public String espacioHud(){
        String res ="";
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
    /**
     * Se muestra una tala con las puntuaciones de los jugadores.
     * @return 
     */
    public String marcadores(){
        String res ="";
            res += "+----------------------------------------------------+\n";
           
            res += "+----------------------------------------------------+";
        return res;
    }
    
}
