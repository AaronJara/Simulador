/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador; //Nombre del Paquete de la Clase

import javax.swing.JOptionPane;

/**
 * @author Arbay Fernández Solano y Aaron Jara Molina
 **/
public class Simulacion { //Nombre e Inicio de la Clase "Simulación"
    /**
     * Variables de tipo double llamadas producidos1, producidos2, ganancian1, ganancian2
     * y precio respectivamente 
     **/
    double producidos1 = 0, producidos2 = 0;
    double ganancian1;
    double ganancian2;
    double gananciab1;
    double gananciab2;
    double precio;

    Simulacion() { //Nombre e Inicio del Método Constructor
        //Método Constructor Vacio:Sin Parámetros a Recibir
    } //Fin del Método Constructor
    int horas;
    //Proceso de Definición de las Instancias: 
    Producto miProducto = new Producto();
    Maquina miMaquina1 = new Maquina();
    Maquina miMaquina2 = new Maquina();
    Convertidor miConvertidor = new Convertidor();
    /**
     * Método get de tipo double de mi variable ganancian1.
     * @return ganancian1
     **/
    public double getGanancian1() {
        return ganancian1;
    }
     /**
     * Método set de tipo void de mi variable ganancian1.
     * @param ganancian1
     **/
    public void setGanancian1(double ganancian1) {
        this.ganancian1 = ganancian1;
    }
    /**
    * Método get de tipo double de mi variable ganancian2.
    * @return 
    **/
    public double getGanancian2() {
        return ganancian2;
    }
    /**
     * Método set de tipo void de mi variable ganancian2.
     * @param ganancian2 
     **/
    public void setGanancian2(double ganancian2) {
        this.ganancian2 = ganancian2;
    }
    /**
     * Método get de tipo double de mi variable gananciab1.
     * @return 
     **/
    public double getGananciab1() {
        return gananciab1;
    }
    /**
     * Método set de tipo void de mi variable gananciab1. 
     * @param gananciab1 
     **/
    public void setGananciab1(double gananciab1) {
        this.gananciab1 = gananciab1;
    }
    /**
     * Método get de tipo double de mi variable gananciab2.
     * @return 
     **/
    public double getGananciab2() {
        return gananciab2;
    }
    /**
     * Método set de tipo void de mi variable gananciab2.
     * @param gananciab2 
     **/
    public void setGananciab2(double gananciab2) {
        this.gananciab2 = gananciab2;
    }

    //Toma y Muestras de los Valores Necesarios para el Proceso:
    /**
     * Acontinuacion se llamarán los set y los gets de máquina todos por aparte
     * y por cada maquina: Esto se debe a la necesidad de manejar y mostrar los
     * cambios 1 por 1 desde el menú principal
     * @param id
     **/
    //Primero los Métodos de la Máquina 1:
    public void llamadaSetIdMaquina1(String id) {
        miMaquina1.setID(id);
    } //Fin del set Método de Identificación
    /**
     * Método get de tipo integer de mi variable horas.
     * @return 
     **/
    public int getHoras() {
        return horas;
    }
    /**
     * Método set de tipo void de mi variable horas.
     * @param horas 
     **/
    public void setHoras(int horas) {
        this.horas = horas;
    }
    /**
     * Método get de tipo String de mi variable miMaquina1
     * @return this.miMaquina1.getID()
     **/
    public String llamadaGetIdMaquina1() {
        return this.miMaquina1.getID();
    } //Fin del Método get de Identificación
    /**
     * Método set de tipo void llamado llamadaSetCostoDeMaquina1.
     * @param costoMaquina 
     **/
    public void llamadaSetCostoDeMaquina1(double costoMaquina) {
        miMaquina1.setCostoMaquina(costoMaquina);
    } //Fin del Método set de Costo de Máquina
    /**
     * Método get de tipo double llamado llamadaGetCostoDeMaquina1 
     * @return this.miMaquina1.getCostoMaquina()
     **/
    public double llamadaGetCostoDeMaquina1() {
        return this.miMaquina1.getCostoMaquina();
    } //Fin del Método get de Costo de Máquina
    /**
     * Método set de tipo void llamado llamadaSetCostoProMaquina1
     * @param costoProduccion 
     **/
    public void llamadaSetCostoProMaquina1(double costoProduccion) {
        miMaquina1.setCostoProduccion(costoProduccion);
    } //Fin del Método de Costo por Máquina
    /**
     * Método get de tipo double llamado llamadaGetCostoProMaquina1.
     * @return this.miMaquina1.getCostoProduccion
     **/
    public double llamadaGetCostoProMaquina1() {
        return this.miMaquina1.getCostoProduccion();
    }
    /**
     * Método set de tipo void llamado llamadaSetCostoProduccionMaquina1.
     * @param produccion 
     **/
    public void llamadaSetProduccionMaquina1(double produccion) {
        miMaquina1.setProduccion(produccion);
    } //Fin del Método de Producción de la Máquina
    /**
     * Método get de tipo double llamado llamadaGetProduccionMaquina1.
     * @return this.miMaquina1.getProduccionHora()
     **/
    public double llamadaGetProduccionMaquina1() {
        return this.miMaquina1.getProduccionHora();
    }
    /**
     * Método set de tipo void llamado llamadaSetTiempoReparacionMaximo
     * @param tiempo 
     **/
    public void llamadaSetTiempoReparacionMaximo(int tiempo) {
        miMaquina1.setTiempoReparacion(tiempo);
    } //Fin del Método que marca el Tiempo Máximo de Reparación de la Máquina
    /**
     * Método get de tipo double llamado llamadaGetTiempoReparacionMaximo1
     * @return this.miMaquina1.getTiempoReparacion()
     **/
    public double llamadaGetTiempoReparacionMaximo1() {
        return this.miMaquina1.getTiempoReparacion();
    }
     /**
     * Método set de tipo void llamado llamadaSetFalla1. 
     * @param falla
     **/
    public void llamadaSetFalla1(double falla) {
        miMaquina1.setFalla(falla);
    } //Fin del Método que se encarga de hacer fallar la máquina
    /**
     * Método get de tipo double llamado llamadaGetFalla1
     * @return this.miMaquina1.getFalla()
     **/
    public double llamadaGetFalla1() {
        return this.miMaquina1.getFalla();
    }
    
    //Luego los Métodos de la Maquina 2:
    public void llamadaSetIdMaquina2(String id) {
        miMaquina2.setID(id);
    } //Fin del Método de Identificación
    /**
    * Método get de tipo String llamado llamadaGetIdMaquina2
    * @return this.miMaquina2.getID()
    **/
    public String llamadaGetIdMaquina2() {
        return this.miMaquina2.getID();
    } //Fin del Metodo get de Costo de Máquina
    /**
    * Método set de tipo void llamado llamadaSetCostoDeMaquina2. 
    * @param costoMaquina
    **/
    public void llamadaSetCostoDeMaquina2(double costoMaquina) {
        miMaquina2.setCostoMaquina(costoMaquina);
    } //Fin del Método de Costo de Máquina
    /**
    * Método get de tipo double llamado llamadaGetCostoDeMaquina2
    * @return this.miMaquina2.getCostoMaquina()
    **/
    public double llamadaGetCostoDeMaquina2() {
        return this.miMaquina2.getCostoMaquina();
    } //Fin del Método get de Costo de Máquina
    /**
    * Método set de tipo void llamado llamadaSetCostoProMaquina2. 
    * @param costoProduccion
    **/
    public void llamadaSetCostoProMaquina2(double costoProduccion) {
        miMaquina2.setCostoProduccion(costoProduccion);
    } //Fin del Método de Producción de la Máquina
    /**
    * Método get de tipo double llamado llamadaGetCostoProMaquina2
    * @return this.miMaquina2.getCostoProduccion()
    **/
    public double llamadaGetCostoProMaquina2() {
        return this.miMaquina2.getCostoProduccion();
    }
    /**
    * Método set de tipo void llamado llamadaSetProduccionMaquina2. 
    * @param produccion
    **/
    public void llamadaSetProduccionMaquina2(double produccion) {
        miMaquina2.setProduccion(produccion);
    } //Fin del Método que marca el Tiempo Máximo de Reparación de la Máquina
    /**
    * Método get de tipo double llamado llamadaGetProduccionMaquina2
    * @return this.miMaquina2.getProduccionHora()
    **/
    public double llamadaGetProduccionMaquina2() {
        return this.miMaquina2.getProduccionHora();
    }
    /**
    * Método set de tipo void llamado llamadaSetTiempoReparacionMaximo2. 
    * @param tiempo
    **/
    public void llamadaSetTiempoReparacionMaximo2(int tiempo) {
        miMaquina2.setTiempoReparacion(tiempo);
    } //Fin del Método que marca el Tiempo Máximo de Reparación de la Máquina
    /**
    * Método get de tipo double llamado llamadaGetTiempoReparacionMaximo2
    * @return this.miMaquina2.getTiempoReparacion()
    **/
    public double llamadaGetTiempoReparacionMaximo2() {
        return this.miMaquina2.getTiempoReparacion();
    }
    /**
    * Método set de tipo void llamado llamadaSetFalla2. 
    * @param falla
    **/
    public void llamadaSetFalla2(double falla) {
        miMaquina2.setFalla(falla);
    } //Fin del Método que se encarga de hacer fallar la máquina
    /**
     * Método get de tipo double de mi 
     * @return this.miMaquina2.getFalla()
     **/
    public double llamadaGetFalla2() {
        return this.miMaquina2.getFalla();
    }
    /**
     * Metodo encargado de llevar a cabo la simulación;
     * Se rige mediando ciclos, por el tiempo dado por el usuario...
     **/
    public void simula() { //Inicio del Método que carga la Simulación
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
        //Retorno de los Resultados Obtenidos en Ambas Máquinas
        JOptionPane.showMessageDialog(null, "Los Productos Producidos Por la Máquina " + miMaquina1.getID() + " fueron " + producidos1 + '\n' + " y " + '\n' + "Los Productos Producidos por la Máquina " + miMaquina2.getID() + " fueron " + producidos2, "INFORMACIÓN", JOptionPane.WARNING_MESSAGE);

    }//Fin del Método que despliega los resultados de la Simulación 
    /**
     * Método get de tipo double de mi variable precio.  
     * @return precio
     **/ 
    public double getPrecio() {
        return precio;
    }
    /**
     * Método set de tipo void de mi variable precio
     * @param precio 
     **/
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
    * Método de tipo void llamado gananciaBruta
    * Muesta la gancian bruta de las maquinas basado en la siguiente operación:
    * ganancia bruta = (productos producidos * el precio) menos el costo de producción de la máquina.
    **/
    public void gananciaBruta() {
        if (gananciab1 == 0.0) {
            gananciab1 = (producidos1 * getPrecio()) - llamadaGetCostoProMaquina1();
            gananciab2 = (producidos2 * getPrecio()) - llamadaGetCostoProMaquina2();

        } else {
            gananciab1 = 0.0;
            gananciab2 = 0.0;
            gananciab1 = (producidos1 * getPrecio()) - llamadaGetCostoProMaquina1();
            gananciab2 = (producidos2 * getPrecio()) - llamadaGetCostoProMaquina2();
        }
        JOptionPane.showMessageDialog(null, "La ganancia Bruta de la maquina " + miMaquina1.getID() + " es de: " + getGananciab1() + " y de la maquina " + miMaquina2.getID() + " es de: " + getGananciab2(), "INFORMACIÓN", JOptionPane.WARNING_MESSAGE);

    }
    /**
     * Método de tipo void llamado gananciaNeta
     * Muesta la gancian neta de las maquinas basado en la siguiente operación:
     * ganancia neta = (productos producidos * el precio) menos el costo de la máquina.
     **/
    public void gananciaNeta() {
        if (ganancian1 == 0.0) {
            ganancian1 = (producidos1 * getPrecio()) - llamadaGetCostoDeMaquina1();
            ganancian2 = (producidos2 * getPrecio()) - llamadaGetCostoDeMaquina2();

        } else {
            ganancian1 = 0.0;
            ganancian2 = 0.0;
            ganancian1 = (producidos1 * getPrecio()) - llamadaGetCostoDeMaquina1();
            ganancian2 = (producidos2 * getPrecio()) - llamadaGetCostoDeMaquina2();
        }
        JOptionPane.showMessageDialog(null, "La ganancia neta de la maquina " + miMaquina1.getID() + " es de: " + getGanancian1() + " y de la maquina " + miMaquina2.getID() + " es de: " + getGanancian2(), "INFORMACIÓN", JOptionPane.WARNING_MESSAGE);
    }
    /**
     * Método de tipo void llamado Eleccion
     * Compara la ganancia neta de las maquinas y recomienda cual debe comprar 
     * dependiendo de cual obtuvo más ganancias.
     **/
    public void Eleccion() {
        if (ganancian1 > 0 || ganancian2 > 0) {
            if (ganancian1 > ganancian2) {
                JOptionPane.showMessageDialog(null, "Compre la maquina: " + miMaquina1.getID(), "INFORMACIÓN", JOptionPane.WARNING_MESSAGE);
            } else if (ganancian2 > ganancian1) {
                JOptionPane.showMessageDialog(null, "Compre la maquina: " + miMaquina2.getID(), "INFORMACIÓN", JOptionPane.WARNING_MESSAGE);
            } else if (ganancian1 == ganancian2) {
                JOptionPane.showMessageDialog(null, "Compre Ambas Máquinas", "INFORMACIÓN", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO compre ninguna Máquina", "INFORMACIÓN", JOptionPane.WARNING_MESSAGE);
        }
    } //Fin de la Clase "Simulación"
}
