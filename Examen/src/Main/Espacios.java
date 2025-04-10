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
public class Espacios {

    //atributos + array + contador para llevar un registro
    private String array[][] = new String[6][6];
    private int numero;
    private String tipo;
    private int precioPorNoche;
    private String estado;
    private int contadorGeneral = 0;
    private int contadorOcupados = 0;
    private int contadorLibres = 0;
    private int contadorSucios = 0;
    private int gananciaActual = 0;

    //constructor
    public Espacios(int numero, String tipo, int precioPorNoche, String estado) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.estado = estado;

        //for anidado donde lleno todos los espacios con vacia
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = "Vacio";
            }
        }

    }

    //getter y setter
    public String[][] getArray() {
        return array;
    }

    public void setArray(String[][] array) {
        this.array = array;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(int precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getContadorOcupados() {
        return contadorOcupados;
    }

    public void setContadorOcupados(int contadorOcupados) {
        this.contadorOcupados = contadorOcupados;
    }

    public String getAlmacenNumR() {
        return almacenNumR;
    }

    public void setAlmacenNumR(String almacenNumR) {
        this.almacenNumR = almacenNumR;
    }

    public String getAlmacenEstadoR() {
        return almacenEstadoR;
    }

    public void setAlmacenEstadoR(String almacenEstadoR) {
        this.almacenEstadoR = almacenEstadoR;
    }

    public String getAlmacenTipoR() {
        return almacenTipoR;
    }

    public void setAlmacenTipoR(String almacenTipoR) {
        this.almacenTipoR = almacenTipoR;
    }

    public String getAlmacenPrecioR() {
        return almacenPrecioR;
    }

    public void setAlmacenPrecioR(String almacenPrecioR) {
        this.almacenPrecioR = almacenPrecioR;
    }

    public int getContadorLibres() {
        return contadorLibres;
    }

    public void setContadorLibres(int contadorLibres) {
        this.contadorLibres = contadorLibres;
    }

    public int getContadorGeneral() {
        return contadorGeneral;
    }

    public void setContadorGeneral(int contadorGeneral) {
        this.contadorGeneral = contadorGeneral;
    }

    public int getContadorSucios() {
        return contadorSucios;
    }

    public void setContadorSucios(int contadorSucios) {
        this.contadorSucios = contadorSucios;
    }

    public int getGananciaActual() {
        return gananciaActual;
    }

    public void setGananciaActual(int gananciaActual) {
        this.gananciaActual = gananciaActual;
    }

    //metodo de opciones
    public void opciones() {
        while (true) {
            int opciones = Integer.parseInt(JOptionPane.showInputDialog("Opciones de visualizacion:\n"
                    + "1. Reservar\n"
                    + "2. Observar Espacios\n"
                    + "3. Modificar\n"
                    + "4. Regresar al menu principal"));
            switch (opciones) {
                case 1:
                    reservar();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    modificar();
                    break;

            }
            if (opciones == 4) {
                break;
            }
            if (opciones > 4 || opciones < 1) {
                JOptionPane.showMessageDialog(null, "Opcion invalida!");
                continue;
            }
        }
    }

    //metodo mostrar el array
    public boolean mostrar() {

        //prefijar columnas
        array[0][0] = "*Hotel*";
        array[0][1] = "*R/ 1*";
        array[0][2] = "*R/ 2*";
        array[0][3] = "*R/ 3*";
        array[0][4] = "*R/ 4*";
        array[0][5] = "*R/ 5*";
        //prefijar filas
        array[1][0] = "*Piso 1*";
        array[2][0] = "*Piso 2*";
        array[3][0] = "*Piso 3*";
        array[4][0] = "*Piso 4*";
        array[5][0] = "*Piso 5*";

        //forma de mostrar en tabla la matriz 
        String mostrarTabla = "";

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                mostrarTabla += array[i][j] + "     ";
            }
            mostrarTabla += "\n\n";
        }
        //puse R/: room para saber que r es de habitacion
        JOptionPane.showMessageDialog(null, "Has elegido *Visualizar*(R/: room)\n\n" + mostrarTabla);

        return true;
    }

    //variables de almacenamiento para poder usar en modificar info 
    String almacenNumR = "";
    String almacenEstadoR = "";
    String almacenTipoR = "";
    String almacenPrecioR = "";

    //metodo de reservas
    public boolean reservar() {
        //while para seguir repitiendo el ciclo hasta que se decida salir
        while (true) {

            //ingreso de datos
            int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el piso en que se encuentra: "));
            int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de habitacion en que se encuentra: "));
            String numR = JOptionPane.showInputDialog("Ingrese el numero de habitacion ");
            almacenNumR = numR;//aca meto la info dentro de los almacenes
            String estadoR = JOptionPane.showInputDialog("Ingrese el estado en que se encuentra(Libre, Ocupado,Sucia): ");
            almacenEstadoR = estadoR;
            String tipoR = JOptionPane.showInputDialog("Ingrese el tipo de habitacion(Simple, Doble): ");
            almacenTipoR = tipoR;
            String precioR = JOptionPane.showInputDialog("Ingrese el precio de la habitacion: ");
            almacenPrecioR = precioR;

            //condicion para ir reemplazando la info por la que se digita
            if (array[fila][columna] == "Vacio") {
                array[fila][columna] = numR + "|" + estadoR + "|" + precioR + "|" + tipoR;

            }
            //se rellena el contador general para el metodo modificar
            contadorGeneral += 1;

            //se rellena el contador para resumen
            if (estadoR.equalsIgnoreCase("ocupado")) {
                contadorOcupados += 1;

            } //se rellena el contador para resumen
            else if (estadoR.equalsIgnoreCase("libre")) {
                contadorLibres += 1;

                //se rellena el contador para resumen
            } else if (estadoR.equalsIgnoreCase("sucia")) {
                contadorSucios += 1;
            }

            JOptionPane.showMessageDialog(null, "cantidad reservas: " + contadorGeneral);

            //salida
            String salir = JOptionPane.showInputDialog("Deseas reservar otra?(y/n)");
            if (salir.equalsIgnoreCase("n")) {
                break;
            }
        }
        return true;
    }

    //metodo de modificacion
    public boolean modificar() {
        //Verificamos si hay reservas dentro del programa
        if (contadorGeneral == 0) {
            JOptionPane.showMessageDialog(null, "Aún no hay registrado");
            return false;
        }

        //localizar la habitacion
        String d = JOptionPane.showInputDialog("Digite el numero de habitacion: ");
        int num = Integer.parseInt(d);

        //Se agrega la logica para encontrar el numero de habitacion
        boolean encontrado = false;
        for (int i = 0; i < contadorGeneral; i++) {
            if (almacenNumR.equals(d)) {
                encontrado = true;
                //Se muestra al empleado 
                JOptionPane.showMessageDialog(null, "espacio encontrado..." + "\n"
                        + "Estado : " + almacenEstadoR + "\n"
                        + "Tipo: " + almacenTipoR + "\n"
                        + "Precio: " + almacenPrecioR);

                //Se solicita para modificar los datos del empleado
                String nuevoEstado = JOptionPane.showInputDialog("Digite el nuevo Estado ", almacenEstadoR); //aparece la info de una para ser cambiada
                String nuevoTipo = JOptionPane.showInputDialog("Digite el nuevo tipo: ", almacenTipoR);
                String nuevoPrecio = JOptionPane.showInputDialog("Digite el nuevo precio: ", almacenPrecioR);

                JOptionPane.showMessageDialog(null, "Datos actualizados...");
                break;

            }
            //validacion
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "¡habitacion no encontrada!");
            }
        }

        return true;
    }

}
