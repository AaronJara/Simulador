/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package simulador; //Nombre del Paquete de la Clase

/**
 * @author Arbay Fernández Solano y Aaron Jara Molina
 **/

public class Convertidor { //Nombre e Inicio de la Clase "Convertidor"

    private int horas; //Declaración de los Atributos de "horas" trabajadas
    private int dias; //Declaración de los Atributos de "días" trabajados
    private int semanas; //Declaración de los Atributos de "semanas" trabajadas
    private int meses; //Declaración de los Atributos de "meses" trabajados
    private int años; //Declaración de los Atributos de "años" trabajados

    public Convertidor() { //Nombre e Inicio del Método Constructor
        //Método Constructor Vacio:Sin Parámetros a Recibir
    } //Fin del Método Constructor

    public void setHoras(int horas) { //Nombre e Inicio del Método setHoras, que recibe la variable entera "horas"
        this.horas = horas; //Declaración del valor de "horas"
    } //Fin del Método que recibe las horas laboradas

    public void setDias(int dias) { //Nombre e Inicio del Método setDías, que recibe la variable entera "dias"
        this.dias = dias; //Declaración del valor de "dias"
    } //Fin del Método que recibe los días laborados

    public void setSemanas(int semanas) { //Nombre e Inicio del Método setSemanas, que recibe la variable entera "semanas"
        this.semanas = semanas; //Declaración del valor de "semanas"
    } //Fin del Método que recibe las semanas laboradas

    public void setMeses(int meses) { //Nombre e Inicio del Método setMeses, que recibe la variable entera "meses"
        this.meses = meses; //Declaración del valor de "meses"
    } //Fin del Método que recibe los meses laborados

    public void setAños(int años) { //Nombre e Inicio del Método setAños, que recibe la variable entera "años"
        this.años = años; //Declaración del valor de "años"
    } //Fin del Método que recibe los años laborados

    public int getHoras() { //Nombre e Inicio del Método getHoras, que retorna el valor de la variable "horas"
        return (this.horas); //Muestra del valor de "horas"
    } //Fin del Método que despliega las horas laboradas

    public int getDias() { //Nombre e Inicio del Método getDías, que retorna el valor de la variable "dias"
        return (this.dias); //Muestra del valor de "dias"
    } //Fin del Método que despliega los días laborados

    public int getSemanas() { //Nombre e Inicio del Método getSemanas, que retorna el valor de la variable "semanas"
        return (this.semanas); //Muestra del valor de "semanas"
    } //Fin del Método que despliega las semanas laboradas

    public int getMeses() { //Nombre e Inicio del Método getMeses, que retorna el valor de la variable "meses"
        return (this.meses); //Muestra del valor de "meses"
    } //Fin del Método que despliega los meses laborados

    public int getAños() { //Nombre e Inicio del Método getAños, que retorna el valor de la variable "años"
        return (this.años);//Muestra del valor de "años"
    } //Fin del Método que despliega los años laborados

    public String converHoras() { //Nombre e Inicio del Método que Convierte una Cantidad Grande de Horas a Dias
        this.dias = 0; //Se Inicializan los días en Cero
        while(horas >= 24){
            this.dias = this.dias + 1; //Entonces valla agregando uno a los días
            this.horas = this.horas - 24; //Y reste las 24 horas de un día agregado
        }
        return ("La Cantidad de Horas Introducidas Equivalen a: " + this.dias + " días."); //Muestra de Resultados
    } //Fin del Método para Convertir Horas

    public String converDias() { //Nombre e Inicio del Método que Convierte una Cantidad Grande de Dias en Semanas
        this.semanas = 0; //Se Inicializan las Semanas en Cero  
        while(this.dias >= 7){
            this.semanas = this.semanas + 1; //Entonces valla agregando uno a las semanas
            this.dias = this.dias - 7;
        }
        return ("La Cantidad de Días Equivalen a: " + this.semanas + " semanas."); //Muestra de Resultados
        
    } //Fin del Método para Convertir Días

    public String converSemanas() { //Nombre e Inicio del Método que Convierte una Cantidad Grande de Semanas en Meses
        this.meses = 0; //Se Inicializan los Meses en Cero   
        while(this.semanas >= 4){
            this.meses = this.meses + 1; //Entonces valla agregando uno a los meses
            this.semanas = this.semanas - 4; //Y reste las 4 semanas de un mes agregado
        }
        return ("La Cantidad de Semanas Equivalen a: " + this.meses + " meses."); //Muestra de Resultados
    } //Fin del Método para Convertir Semanas

    public String converMeses() { //Nombre e Inicio del Método que Convierte una Cantidad Grande de Meses en Años
        this.años = 0; //Se Inicializan los Años en Cero     
        while (this.meses >= 12){
            this.años = this.años + 1; //Entonces valla agregando uno a los años
            this.meses = this.meses - 12; //Y reste los 12 meses de un año agregado
        }
        return ("La Cantidad de Meses Equivalen a: " + this.años + " años."); //Muestra de Resultados
    } //Fin del Método para Convertir Meses    
} //Fin de la Clase "Convertidor"