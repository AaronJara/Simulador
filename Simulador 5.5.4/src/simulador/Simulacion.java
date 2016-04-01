/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador; //Nombre del Paquete de la Clase

import javax.swing.JOptionPane;

/**
 * @author Arbay Fernández Solano y Aaron Jara Molina
 *
 */
public class Simulacion { //Nombre e Inicio de la Clase "Simulación"

    double producidos1 = 0, producidos2 = 0;
    double ganancian1;
    double ganancian2;

    Simulacion() { //Nombre e Inicio del Método Constructor
        //Método Constructor Vacio:Sin Parámetros a Recibir
    } //Fin del Método Constructor
    int horas;
    //Proceso de Definición de las Instancias: 
    Producto miProducto = new Producto();
    Maquina miMaquina1 = new Maquina();
    Maquina miMaquina2 = new Maquina();
    Convertidor miConvertidor = new Convertidor();

    //Toma y Muestras de los Valores Necesarios para el Proceso:
    /**
     * Acontinuacion se llamarán los set y los gets de máquina todos por aparte
     * y por cada maquina: Esto se debe a la necesidad de manejar y mostrar los
     * cambios 1 por 1 desde el menú principal
     *
     *
     * @param id
     */
    //Primero los Métodos de la Máquina 1:
    public void llamadaSetIdMaquina1(String id) {
        miMaquina1.setID(id);
    } //Fin del set Método de Identificación

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String llamadaGetIdMaquina1() {
        return this.miMaquina1.getID();
    } //Fin del Método get de Identificación

    public void llamadaSetCostoDeMaquina1(double costoMaquina) {
        miMaquina1.setCostoMaquina(costoMaquina);
    } //Fin del Método set de Costo de Máquina

    public double llamadaGetCostoDeMaquina1() {
        return this.miMaquina1.getCostoMaquina();
    } //Fin del Método get de Costo de Máquina

    public void llamadaSetCostoProMaquina1(double costoProduccion) {
        miMaquina1.setCostoProduccion(costoProduccion);
    } //Fin del Método de Costo por Máquina

    public double llamadaGetCostoProMaquina1() {
        return this.miMaquina1.getCostoProduccion();
    }

    public void llamadaSetProduccionMaquina1(double produccion) {
        miMaquina1.setProduccion(produccion);
    } //Fin del Método de Producción de la Máquina

    public double llamadaGetProduccionMaquina1() {
        return this.miMaquina1.getProduccionHora();
    }

    public void llamadaSetTiempoReparacionMaximo(int tiempo) {
        miMaquina1.setTiempoReparacion(tiempo);
    } //Fin del Método que marca el Tiempo Máximo de Reparación de la Máquina

    public double llamadaGetTiempoReparacionMaximo1() {
        return this.miMaquina1.getTiempoReparacion();
    }

    public void llamadaSetFalla1(double falla) {
        miMaquina1.setFalla(falla);
    } //Fin del Método que se encarga de hacer fallar la máquina

    public double llamadaGetFalla1() {
        return this.miMaquina1.getFalla();
    }

    //Luego los Métodos de la Maquina 2:
    public void llamadaSetIdMaquina2(String id) {
        miMaquina2.setID(id);
    } //Fin del Método de Identificación

    public String llamadaGetIdMaquina2() {
        return this.miMaquina2.getID();
    } //Fin del Metodo get de Costo de Máquina

    public void llamadaSetCostoDeMaquina2(double costoMaquina) {
        miMaquina2.setCostoMaquina(costoMaquina);
    } //Fin del Método de Costo de Máquina

    public double llamadaGetCostoDeMaquina2() {
        return this.miMaquina2.getCostoMaquina();
    } //Fin del Método get de Costo de Máquina

    public void llamadaSetCostoProMaquina2(double costoProduccion) {
        miMaquina2.setCostoProduccion(costoProduccion);
    } //Fin del Método de Producción de la Máquina

    public double llamadaGetCostoProMaquina2() {
        return this.miMaquina2.getCostoProduccion();
    }

    public void llamadaSetProduccionMaquina2(double produccion) {
        miMaquina2.setProduccion(produccion);
    } //Fin del Método que marca el Tiempo Máximo de Reparación de la Máquina

    public double llamadaGetProduccionMaquina2() {
        return this.miMaquina2.getProduccionHora();
    }

    public void llamadaSetTiempoReparacionMaximo2(int tiempo) {
        miMaquina2.setTiempoReparacion(tiempo);
    } //Fin del Método que marca el Tiempo Máximo de Reparación de la Máquina

    public double llamadaGetTiempoReparacionMaximo2() {
        return this.miMaquina2.getTiempoReparacion();
    }

    public void llamadaSetFalla2(double falla) {
        miMaquina2.setFalla(falla);
    } //Fin del Método que se encarga de hacer fallar la máquina

    public double llamadaGetFalla2() {
        return this.miMaquina2.getFalla();
    }

    /*
     * Metodo encargado de llevar a cabo la simulación;
     * Se rige mediando ciclos, por el tiempo dado por el usuario...
     */
    public String simula() { //Inicio del Método que carga la Simulación
        int tiempoMaximoReparacion1 = 1; //Se encarga de reparar la maquina 1 cuando se cumple su tiempo.
        int tiempoMaximoReparacion2 = 1; //Se encarga de reparar la maquina 2 cuando se cumple su tiempo.
        int cont = 0; //Contador de las horas, cada ciclo representa 1 hora
        //Valor de las Producciones por máquina
        while (getHoras() > cont) {
            cont++;
            //Generacion de la posible falla:
            if (miMaquina1.randomFalla() > miMaquina1.getFalla()) {
                miMaquina1.setEstado(false);
                tiempoMaximoReparacion1++;
            } else {
                miMaquina1.setEstado(true);
            }
            if (miMaquina2.randomFalla() > miMaquina2.getFalla()) {
                miMaquina2.setEstado(false);
                tiempoMaximoReparacion2++;
            } else { //De lo Contrario...
                miMaquina2.setEstado(true); //Máquina en Estado "true"
            }
            if (miMaquina1.getEstado() == false) {
                producidos1 = producidos1 + 0;
            }
            if (miMaquina2.getEstado() == false) {
                producidos2 = producidos2 + 0;

            }
            //Reparacion de la Maquina por medio del Tiempo Máximo de Reparacion:
            if (tiempoMaximoReparacion1 >= miMaquina1.getTiempoReparacion()) {
                miMaquina1.setEstado(true);
            }
            if (tiempoMaximoReparacion2 >= miMaquina2.getTiempoReparacion()) {
                miMaquina2.setEstado(true);
            }
            /*
             *Aquí se Genera la Producción de los Productos
             */
            if (miMaquina1.getEstado() == true) {
                producidos1 = producidos1 + miMaquina1.getProduccionHora();
            }
            if (miMaquina2.getEstado() == true) {
                producidos2 = producidos2 + miMaquina2.getProduccionHora();

            }
        }
        return ("Los Productos Producidos Por la Máquina " + miMaquina1.getID() + " fueron " + producidos1 + '\n' + " y " + '\n' + "Los Productos Producidos por la Máquina " + miMaquina2.getID() + " fueron " + producidos2); //Retorno de los Resultados Obtenidos en Ambas Máquinas

    }//Fin del Método que despliega los resultados de la Simulación 

    public String gananciaBruta() {
        double gananciam1 = (producidos1 * miProducto.getPrecio()) - llamadaGetCostoProMaquina1();
        double gananciam2 = (producidos2 * miProducto.getPrecio()) - llamadaGetCostoProMaquina2();
        return ("La ganancia bruta de la maquina " + miMaquina1.getID() + " es de: " + gananciam1 + " y la de la maquina " + miMaquina2.getID() + " es de: " + gananciam2);
    }

    public String gananciaNeta() {
        ganancian1 = (producidos1 * miProducto.getPrecio()) - llamadaGetCostoDeMaquina1();
        ganancian2 = (producidos2 * miProducto.getPrecio()) - llamadaGetCostoDeMaquina2();
        return ("La ganancia neta de la maquina " + miMaquina1.getID() + " es de: " + ganancian1 + " y la de la maquina " + miMaquina2.getID() + " es de: " + ganancian2);

    }

    public void Eleccion() {
        if (ganancian1 > ganancian2) {
            System.out.println("Compre la maquina1");
        } else {
            System.out.println("compre la maquina2");
        }
    }
} //Fin de la Clase "Simulación"
