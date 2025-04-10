/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Resumen {

    Espacios espacios = new Espacios(0, "", 0, "");

    public void resumenGeneral() {
        JOptionPane.showMessageDialog(null, "Este es el resumen general:\n"
                + "- Total de habitaciones Libres: " + totalHabitacionesL() + "\n"
                + "- Total de habitaciones Ocupadas: " + totalHabitacionesO() + "\n"
                + "- Total de habitaciones Sucias: " + totalHabitacionesS() + "\n"
                + "- Ganancia actual del hotel: " + gananciaTotal() + "\n");
    }

    public boolean totalHabitacionesL() {
        //este metodo llamaba al contador de estado libres 
        espacios.getContadorLibres();
        return true;
    }

    public boolean totalHabitacionesO() {
        //este metodo llamaba al contador de estado Ocupados 
        espacios.getContadorOcupados();
        return true;
    }

    public boolean totalHabitacionesS() {
        //este metodo llamaba al contador de estado sucios 
        espacios.getContadorSucios();
        return true;
    }

    public boolean gananciaTotal() {
        //no se logro funcion de esta parte pero la podía hacer con un contador que sumara todos los precios que se 
        //digitaban
        espacios.getGananciaActual();
        return true;
    }
}
