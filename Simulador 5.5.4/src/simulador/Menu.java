/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

import javax.swing.JOptionPane;

/**
 * @author Arbay Fernández Solano y Aaron Jara Molina 
 *
 */
public class Menu {

    /**
     * La Interacción con el Usuario se Realiza desde Aquí: Se tendrá el Menú,
     * el Cuál está en partes...
     *
     */
    public void Menu() {
        //Declaración de Variables:
        int optmost; //Variable Entera "optmost", para seleccionar una Opción del Menú
        int opt; //Variable Entera "opt", para seleccionar una Opción del Menú
        int convertidor; //Variable Entera para usar en el Convertidor
        String tab1 = ""; //Variable Tabuladora, que sirve para Concatenar el Menú
        String tab2 = ""; //Variable Tabuladora, que sirve para Concatenar el Menú

        //Proceso de Definición de las Instancias: 
        Simulacion miSimulacion = new Simulacion();
        Producto miProducto = new Producto();
        Convertidor miConvertidor = new Convertidor();
        

        /*
         * A continuación, se seteará el producto, esto, solo se puede realizar 1 vez.
         **/
        //Solicitud del Nombre del Producto a Crear:
        miProducto.setNombre(JOptionPane.showInputDialog("Digite el Nombre del Producto que Realizarán las Máquinas: "));
        //Solicitud del Precio del Producto a Crear:
        miProducto.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Digite el Precio de Venta del Producto que se Creará: ¢")));

        /**
         * Menú Para Cambiar Las Opciones de las Máquinas:
         */
        do { //Ciclo de Accesos al Menú

            /**
             * PRIMER INTENTO DE MENÚ: (Por Oscar F. Fonseca Salicetti)
             * System.out.println("Opciones del menú: "+'\n'+"1 para agregar las
             * ID de las maquinas"+'\n'+ "2 para agregar los costos de compra"+
             * '\n'+ "3 para agregar los costos de produccion"+'\n'+ "4 para
             * agregar la capacidad por hora de produccion de las maquinas" +
             * '\n'+ "5 para agregar el numero para falla"+'\n'+ "6 para agregar
             * el tiempo de garantia osea el tiempo máximo en que se va a
             * reparar"+'\n'+ "7 para no hacer nada");
             *
             **/
            //Concatenación y Orden del Menú de Opciones:
            tab1 += "SELECCIONE UNA OPCIÓN:\n\n"
                    + "\n1) Para Definir Las Horas de Trabajo (Uso del Convertidor)...\n"
                    + "\n2) Para Agregar o Mostrar  Las ID de las Máquinas...\n"
                    + "\n3) Para Agregar Los Costos de Compra de las Máquinas...\n"
                    + "\n4) Para Agregar Los Costos de Produccion...\n"
                    + "\n5) Para Agregar la produccion por hora de las maquinas...\n"
                    + "\n6) Para Agregar El Número Para la Falla...\n"
                    + "\n7) Para Agregar El Tiempo de Garantía (Tiempo Máximo en que se va a Reparar una Falla)...\n"
                    + "\n8) Para Mostrar los productos producidos...\n"
                    + "\n9) Recomendación de cual maquina comprar...\n"
                    + "\n10) SALIDA...\n";

            //Proceso del Switch que Permite la Escogencia del Menú
            do { //Ciclo de Acceso, para el cierre del Programa

                JOptionPane.showMessageDialog(null, tab1); //Despliegue del Menú Concatenado
                opt = Integer.parseInt(JOptionPane.showInputDialog("Digite Una Opción: ")); //Toma del Número de Opción Elegida

                if ((opt > 10) || (opt < 1)) { //Condiciones de Acceso al Menú
                    //Aviso de Error en Caso de No Cumplirse la Condición
                    JOptionPane.showMessageDialog(null, "Error de Dígito", "ERROR!", JOptionPane.ERROR_MESSAGE);
                    System.err.println("Error de Dígito");

                } else { //De Sí Cumplirse la Condición; se deberá proceder con el siguiente proceso:

                    switch (opt) { //Lectura de la Opción Escogida para el Acceso al Menú
                        case 8:
                            System.out.println(miSimulacion.simula());
                            break;
                        //Casos de Acción,según la Opción del Menú
                        case 2: //Digitar o mostrar los ID's de las Máquinas
                            
                            optmost = Integer.parseInt(JOptionPane.showInputDialog("Digite una Opción:\n" + "1- Cargar iD\n" + "2- Mostrar ID"));
                            switch (optmost) {

                                //Casos de Acción,según la Opción del Submenú
                                case 1: //Digitar los ID's de las Máquinas
                                    miSimulacion.llamadaSetIdMaquina1(JOptionPane.showInputDialog("Digite el ID de la Máquina 1"));
                                    miSimulacion.llamadaSetIdMaquina2(JOptionPane.showInputDialog("Digite el ID de la Máquina 2"));
                                    break; //Fin del Caso 1

                                case 2: //Mostrar las ID's de las Máquinas
                                    JOptionPane.showMessageDialog(null, miSimulacion.llamadaGetIdMaquina1(), "ID de la Máquina #1", JOptionPane.WARNING_MESSAGE);
                                    JOptionPane.showMessageDialog(null, miSimulacion.llamadaGetIdMaquina2(), "ID de la Máquina #2", JOptionPane.WARNING_MESSAGE);
                                    break; // Fin del Caso 2
                            }
                            break; //Fin del Caso 1

                        case 3: //Digitar el Costo de las Máquinas
                            optmost = Integer.parseInt(JOptionPane.showInputDialog("Digite una Opción:\n" + "1- Cargar los Costos\n" + "2- Mostrar los Costos"));

                            switch (optmost) {

                                //Casos de Acción,según la Opción del Submenú
                                case 1: //Digitar los Costos de las Máquinas
                                    miSimulacion.llamadaSetCostoDeMaquina1(Double.parseDouble(JOptionPane.showInputDialog("Digite el Costo de la Máquina 1 ¢")));
                                    miSimulacion.llamadaSetCostoDeMaquina2(Double.parseDouble(JOptionPane.showInputDialog("Digite el Costo de la Máquina 2 ¢")));
                                    break; //Fin del Caso 1

                                case 2: //Mostrar los Costos de las Máquinas
                                    JOptionPane.showMessageDialog(null, miSimulacion.llamadaGetCostoDeMaquina1(), "El costo de la maquina #1", JOptionPane.WARNING_MESSAGE);
                                    JOptionPane.showMessageDialog(null, miSimulacion.llamadaGetCostoDeMaquina2(), "El costo de la maquina #2", JOptionPane.WARNING_MESSAGE);
                                    break; // Fin del Caso 2
                            }

                            break; //Fin del Caso 2

                        case 4: //Digitar el Costo de Producción de las Máquinas
                            optmost = Integer.parseInt(JOptionPane.showInputDialog("Digite una Opción:\n" + "1- Cargar los Costos de produccion de las maquinas\n" + "2- Mostrar los Costos de produccion de las maquinas"));
                            switch (optmost) {
                                //Casos de Acción,según la Opción del Submenú
                                case 1: //Digitar los Costos de producción de las Máquinas
                                    miSimulacion.llamadaSetCostoProMaquina1(Double.parseDouble(JOptionPane.showInputDialog("Digite el Costo de Producción de la Máquina 1 ¢")));
                                    miSimulacion.llamadaSetCostoProMaquina2(Double.parseDouble(JOptionPane.showInputDialog("Digite el Costo de Producción de la Máquina 2 ¢")));
                                    break; //Fin del Caso 1

                                case 2: //Mostrar los Costos de produccion de las Máquinas
                                    JOptionPane.showMessageDialog(null, miSimulacion.llamadaGetCostoProMaquina1(), "Costo de producción de la Máquina #1", JOptionPane.WARNING_MESSAGE);
                                    JOptionPane.showMessageDialog(null, miSimulacion.llamadaGetCostoProMaquina2(), "Costo de producción de la Máquina #2", JOptionPane.WARNING_MESSAGE);
                                    break; // Fin del Caso 2
                            }

                            break; //Fin del Caso 3

                        case 5: //Digitar la Producción por Hora de las Máquinas
                            optmost = Integer.parseInt(JOptionPane.showInputDialog("Digite una Opción:\n" + "1- Cargar la producción por hora de las maquinas\n" + "2- Mostrar la producción por hora de las maquinas"));
                            switch (optmost) {
                                //Casos de Acción,según la Opción del Submenú
                                case 1: //Digitar la producción por horas de las Máquinas
                                    miSimulacion.llamadaSetProduccionMaquina1(Double.parseDouble(JOptionPane.showInputDialog("Digite la Producción por Hora de la Máquina 1")));
                                    miSimulacion.llamadaSetProduccionMaquina2(Double.parseDouble(JOptionPane.showInputDialog("Digite la Producción por Hora de la Máquina 2")));
                                    break; //Fin del Caso 1

                                case 2: //Mostrar la producción por horas de las Máquinas
                                    JOptionPane.showMessageDialog(null, miSimulacion.llamadaGetProduccionMaquina1(), "Producción por hora de la Máquina #1", JOptionPane.WARNING_MESSAGE);
                                    JOptionPane.showMessageDialog(null, miSimulacion.llamadaGetProduccionMaquina2(), "Producción por hora de la Máquina #2", JOptionPane.WARNING_MESSAGE);
                                    break; // Fin del Caso 2
                            }
                            break; //Fin del Caso 4

                        case 6: //Digitar el Número de Fallas de las Máquinas
                            optmost = Integer.parseInt(JOptionPane.showInputDialog("Digite una Opción:\n" + "1- Cargar el número de fallas de las maquinas\n" + "2- Mostrar el número de fallas de las maquinas"));
                            switch (optmost) {
                                //Casos de Acción,según la Opción del Submenú
                                case 1: //Digitar el número de fallas de las Máquinas
                                    miSimulacion.llamadaSetFalla1(Double.parseDouble(JOptionPane.showInputDialog("Digite el Número de la Falla de la Máquina 1")));
                                    miSimulacion.llamadaSetFalla2(Double.parseDouble(JOptionPane.showInputDialog("Digite el Número de la Falla de la Máquina 2")));
                                    break; //Fin del Caso 1

                                case 2: //Mostrar el número de fallas de las Máquinas
                                    JOptionPane.showMessageDialog(null, miSimulacion.llamadaGetFalla1(), "Número de fallas de la Máquina #1", JOptionPane.WARNING_MESSAGE);
                                    JOptionPane.showMessageDialog(null, miSimulacion.llamadaGetFalla2(), "Número de fallas de la Máquina #2", JOptionPane.WARNING_MESSAGE);
                                    break; // Fin del Caso 2
                            }
                            break; //Fin del Caso 5

                        case 7: //Digite los Tiempos Máximos en Ser Reparadas las Máquinas
                            optmost = Integer.parseInt(JOptionPane.showInputDialog("Digite una Opción:\n" + "1- Cargar el tiempo máximo de reparación de las maquinas\n" + "2- Mostrar el tiempo máximo de reparación de las maquinas"));
                            switch (optmost) {
                                //Casos de Acción,según la Opción del Submenú
                                case 1: //Digitar el tiempo máximo en ser reparadas las Máquinas
                                    miSimulacion.llamadaSetTiempoReparacionMaximo(Integer.parseInt(JOptionPane.showInputDialog("Digite el Tiempo Máximo que Tarda la Máquina 1 en Ser Reparada")));
                                    miSimulacion.llamadaSetTiempoReparacionMaximo2(Integer.parseInt(JOptionPane.showInputDialog("Digite el Tiempo Máximo que Tarda la Máquina 2 en Ser Reparada")));
                                    break; //Fin del Caso 1

                                case 2: //Mostrar el tiempo máximo en ser reparadas las Máquinas
                                    JOptionPane.showMessageDialog(null, miSimulacion.llamadaGetTiempoReparacionMaximo1(), "Tiempo máximo de reparación de la Máquina #1", JOptionPane.WARNING_MESSAGE);
                                    JOptionPane.showMessageDialog(null, miSimulacion.llamadaGetTiempoReparacionMaximo2(), "Tiempo máximo de reparación de la Máquina #2", JOptionPane.WARNING_MESSAGE);
                                    break; // Fin del Caso 2
                            }
                            break; //Fin del Caso 6
                        case 1: //Toma y Despliegue de los Estados de Tiempo a Trabajar
                            miSimulacion.setHoras(Integer.parseInt(JOptionPane.showInputDialog("Digite las Horas de Trabajo: ")));
                            break; //Fin del Caso 7
                        case 9:
                            miSimulacion.Eleccion();
                            break;
                        case 10: //Opción de Salida del Programa
                            System.exit(0); //Salir del Programa
                            break; //Fin del Caso 7

                        default: //Acción por Defecto si se escoge otro Número NO Provisto en el Menú
                            //Despliegue de Mensajes de Errores:
                            JOptionPane.showMessageDialog(null, "Número Incorrecto", "ERROR!", JOptionPane.ERROR_MESSAGE);
                            System.err.println("Número Incorrecto");
                    } //Fin del Switch del Menú
                } //Fin del Else de la Condición de Entrada al Menú del If

            } while (opt != 10); //Fin del Ciclo de Clausura que Cierra el Menú

        } while (opt < 11); //Fin del Ciclo de Acceso al Menú
    }
}
