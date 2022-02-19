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
        String mayor = "";
        
            if (p.getMayorQue() == 0) {
                mayor = "";
            }else{
                mayor = "" + p.getMayorQue();
            }
            
        String espMenor= "";
        String menor = "";
            
        if (p.getMenorQue() == 0) {
                menor = "";
            }else{
                 menor = "" + p.getMenorQue();
            }
        
        
        
        int numsecreto = p.secretoAEnviar();
        String secreto ="";
        String mensajeFinal="";
        
            if (numsecreto < 10 && numsecreto > -1) {
                secreto = "___" + numsecreto +  "____";
                mensajeFinal="¡¡¡Correcto!!! pulse enter para continuar";
            }
            if (numsecreto > 10 && numsecreto < 100) {
                secreto = "___" + numsecreto +  "___";
                mensajeFinal="¡¡¡Correcto!!! pulse enter para continuar";
            }
            if (numsecreto > 99) {
                secreto = "__" + numsecreto +  "___";
                mensajeFinal="¡¡¡Correcto!!! pulse enter para continuar";
            }
            if (numsecreto == -1) {
                secreto = "________";
                mensajeFinal="                                         ";
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
            res += "|    "+ mensajeFinal +"       |\n";
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
     * Se muestra una tala con las puntuaciones de un jugador ordenado de mejor a peor, separado por dificultad.
     * @param p1 Jugador donde se recogen los datos
     * @return String con la estructura del menu del historial
     */
    public String Historial(Jugador p1){
        
        String jugador = p1.getNombre();
        
        String facil = "";
        String espfacil = "";
        if (p1.historialFacil.size() < 10) {
            for (int i = 0; i < p1.historialFacil.size(); i++) {
                facil += " " + p1.historialFacil.get(i);
            }
            for (int i = 0; i < 44 - facil.length()  ; i++) {
                espfacil += " "; 
            }
        }else{
            System.out.println(p1.historialFacil.size());
            for (int i = p1.historialFacil.size() - 10 ; i < p1.historialFacil.size(); i++) {
            facil += " " + p1.historialFacil.get(i);
            }
            for (int i = 0; i < 44 - facil.length()  ; i++) {
                espfacil += " "; 
            }
        }
        
        
        String moderado = "";
        String espMod = "";
        if (p1.historialMedio.size() < 10) {
            for (int i = 0; i < p1.historialMedio.size(); i++) {
                moderado += " " + p1.historialMedio.get(i);
            }
            for (int i = 0; i < 41 - moderado.length()  ; i++) {
                espMod += " "; 
            }
        }else{
            for (int i = p1.historialMedio.size() - 10 ; i < p1.historialMedio.size(); i++) {
            moderado += " " + p1.historialMedio.get(i);
            }
            for (int i = 0; i < 41 - moderado.length()  ; i++) {
                espMod += " "; 
            }
        }
        String dificil = "";
        String espDificil = "";
        
        if (p1.historialDificil.size() < 10) {
            for (int i = 0; i < p1.historialDificil.size(); i++) {
                dificil += " " + p1.historialDificil.get(i);
            }
            for (int i = 0; i < 42 - dificil.length()  ; i++) {
                espDificil += " "; 
            }
        }else{
            for (int i = p1.historialDificil.size() - 10 ; i < p1.historialDificil.size(); i++) {
            dificil += " " + p1.historialDificil.get(i);
            }
            for (int i = 0; i < 42 - dificil.length()  ; i++) {
                espDificil += " "; 
            }
        }
        
        
        String res ="";
            res += "+------------------------"+jugador+"------------------------+\n";
            res += "|                                                    |\n";
            res += "+----------------------------------------------------+\n";
            res += "| Fácil :"  +   facil   + espfacil +                "|\n";
            res += "+----------------------------------------------------+\n";
            res += "| Moderada :"   +  moderado  + espMod +             "|\n";
            res += "+----------------------------------------------------+\n";
            res += "| Difícil :"+  dificil    +  espDificil +           "|\n";
            res += "+----------------------------------------------------+\n";
            res += "|            Pulse enter para continuar              |\n";
            res += "+----------------------------------------------------+";
        return res;
    }
    /**
     * Menu que muesta un cartel para crear un jugador
     * @return 
     */
    public String ponerNombreJugador(){
        String res ="";
            res += "\n";
            res += "\n"; 
            res += "\n"; 
            res += "+----------------------------------------------------+\n";
            res += "|                                                    |\n";
            res += "|                                                    |\n";
            res += "|                                                    |\n";
            res += "|             Escriba su nombre de 4 letras          |\n";
            res += "|                                                    |\n";
            res += "|                                                    |\n";
            res += "|                                                    |\n";
            res += "+----------------------------------------------------+\n";
            res += "\n"; 
            res += "\n"; 
            
        return res; 
    }
    /**
     * Mustra una tabla donde se ve el jugador elegido y su puntuacion de esa partida
     * @param p1 jugador
     * @param partida partica actual
     * @return 
     */
    public String nombreJugador(Jugador p1,Partida partida){
        
        String nombre = p1.getNombre();
        String fallos = "" + partida.getFallos();
        String espFallos = "";
         for (int i = 0; i < 2 - fallos.length(); i++) {
                espFallos += " ";
            }
         
        String dificultad = "";
        
        switch (partida.getDificultad()) {
                case 1:
                    dificultad = "Fácil";
                    break;
                case 2:
                    dificultad = "Moderada";
                    break;
                case 3:
                    dificultad = "Difícil";
                    break;
               
            }
        
        
        String espdiff = "";
        
        for (int i = 0; i < 8 - dificultad.length(); i++) {
                espFallos += " ";
            }
        
        
        String res ="";
            res += "\n";
            res += "\n"; 
            res += "\n"; 
            res += "+----------------------------------------------------+\n";
            res += "|                                                    |\n";
            res += "|                                                    |\n";
            res += "|                                                    |\n";
            res += "|  "+nombre+" ---------------------- "+ dificultad + espdiff +"    Fallos: " + fallos + espFallos + "|\n";
            res += "|                                                    |\n";
            res += "|                                                    |\n";
            res += "|                                                    |\n";
            res += "+----------------------------------------------------+\n";
            res += "\n"; 
            res += "\n";
        return res;
    }
}