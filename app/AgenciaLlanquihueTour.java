/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import model.Persona; // Modelo de persona
import model.Trabajador; // Modelo de trabajador
import model.Ubicacion; // Modelo de ubicación

/**
 * Descripción: Clase principal que actúa como punto de entrada para el sistema de la agencia Llanquihue Tour.
 * Su propósito es validar el funcionamiento del modelo de clases mediante la instanciación
 * de objetos y la aplicación de los principios de composición y herencia.
 *
 * @author Catalina García Santana
 */
public class AgenciaLlanquihueTour {
    /**
     * Método principal que ejecuta la aplicación.
     * Crea instancias de ubicaciones, personas y trabajadores para verificar cómo 
     * se relacionan (composición) y presenta los datos registrados por consola.
     * 
     * @param args los argumentos de la línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Imprime el encabezado principal del sistema
        System.out.println("=================================================================");
        System.out.println("       REGISTRO DE EMPLEADOS - AGENCIA LLANQUIHUE TOUR            ");
        System.out.println("=================================================================\n");

        // Instanciación de una ubicación y una persona base
        Ubicacion ubi1 =new Ubicacion ("Las Rosas","741","Llanquihue","Los Lagos");
        Persona persona1 = new Persona("Gonzalo Solar Paredes", "17.432.890-K", "+56976543210", ubi1);
        
        // Instanciación de un trabajador aplicando herencia y composición de ubicación
        Ubicacion ubi2 = new Ubicacion("Eleuterio Ramirez", "1120", "Osorno", "Los Lagos");
        Trabajador t1 = new Trabajador("Valentina Herrera Fuentes", "18.912.345-6", "+56981234567", ubi2, "EMP-102", "Coordinadora de Logistica", 950000);
        
        // Instanciación de un segundo trabajador con su respectiva ubicación
        Ubicacion ubi3 = new Ubicacion("Diego Portales", "890", "Puerto Montt", "Los Lagos");
        Trabajador t2 = new Trabajador("Mara Soto", "18.654.321-0", "+56955554444", ubi3, "EMP-003", "Operadora de Transporte", 780000);
        
        // Impresión de los registros utilizando el método toString() sobreescrito en cada clase
        System.out.println("--- REGISTRO #1: CONTACTO ---"); // Persona 1
        System.out.println(persona1.toString());

        System.out.println("\n--- REGISTRO #2: COORDINADORA DE LOGISTICA  ---"); // Trabajador 1
        System.out.println(t1.toString());

        System.out.println("\n--- REGISTRO #3: OPERADORA DE TRANSPORTE  ---"); // Trabajador 2
        System.out.println(t2.toString());
        
        // Mensaje de éxito
        System.out.println("\n=================================================================");
        System.out.println("Ejecucion finalizada con exito.");
    }
    
}