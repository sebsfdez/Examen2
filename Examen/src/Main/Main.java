/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llamado de constructores de clases
        Espacios espacios = new Espacios(0, "", 0, "");
        Resumen resumen = new Resumen();

        while (true) {
            //llamado de metodo static que desplega opciones
            int opciones = opciones();

            //switch en donde cada opcion es un llamado de metodo de cada clase segun lo que se escoge
            switch (opciones) {

                case 1:
                    espacios.opciones();
                    break;

                case 2:
                    resumen.resumenGeneral();
                    break;

            }
            //salida
            if (opciones == 3) {
                JOptionPane.showMessageDialog(null, "Has elegido *salir*");
                break;
            }
            //validacion
            if (opciones > 3 || opciones < 1) {
                JOptionPane.showMessageDialog(null, "¡Invalido!");
                continue;
            }

        }

    }

    //metodo de opciones
    public static int opciones() {

        return Integer.parseInt(JOptionPane.showInputDialog("Menu principal | Opciones:\n"
                + "1. Espacios\n"
                + "2. Resumen\n"
                + "3. Salir"));
    }

}
