/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Descripción: Clase que representa a un empleado de la agencia Llanquihue Tour.
 * Hereda de la clase base general (Persona), extendiendo sus atributos 
 * e incorporando datos específicos laborales.
 *
 * @author Catalina García Santana
 */
public class Trabajador extends Persona{
    // Atributos privados propios de la clase Trabajador (encapsulamiento)
    private String idEmpleado;
    private String cargo;
    private int sueldo;
    
    /**
     * Constructor por defecto.
     */
    public Trabajador() {
    }
    
    /**
     * Constructor con parámetros específicos del trabajador.
     * 
     * @param idEmpleado Identificador único del empleado (ej. EMP-102).
     * @param cargo Rol que cumple en la agencia.
     * @param sueldo Salario mensual del trabajador.
     */
    public Trabajador(String idEmpleado, String cargo, int sueldo) {
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    
    /**
     * Constructor completo que inicializa tanto los atributos heredados de Persona 
     * como los específicos de Trabajador.
     * 
     * @param nombre Nombre completo del trabajador.
     * @param rut RUT del trabajador.
     * @param telefono Teléfono de contacto.
     * @param ubicacion Objeto Ubicacion (Composición).
     * @param idEmpleado Identificador único del empleado.
     * @param cargo Rol que cumple en la agencia.
     * @param sueldo Salario mensual del trabajador.
     */
    public Trabajador(String nombre, String rut, String telefono, Ubicacion ubicacion, String idEmpleado, String cargo, int sueldo){
        // Llamada al constructor de la superclase (Persona) para inicializar atributos heredados
        super(nombre, rut, telefono, ubicacion);
        this.idEmpleado = idEmpleado; 
        this.cargo = cargo; 
        this.sueldo = sueldo; 
    }
    
    // ==========================================
    // Getters & Setters (Métodos de acceso)
    // ==========================================
    /**
     * Método para obtener el identificador del empleado
     * @return idEmpleado Identificador del empleado
     */
    public String getIdEmpleado() { 
        return idEmpleado;
    }
    
    /**
     * Método para modificar el identificador del empleado
     * @param idEmpleado Identificador del empleado
     */
    public void setIdEmpleado(String idEmpleado) { 
        this.idEmpleado = idEmpleado;
    }

    /**
     * Método para obtener el cargo del empleado
     * @return cargo Cargo del empleado
     */
    public String getCargo() { 
        return cargo;
    }
    
    /**
     * Método para modificar el cargo del empleado
     * @param cargo Cargo del empleado
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Método para obtener el sueldo del empleado
     * @return sueldo Sueldo del empleado
     */
    public int getSueldo() { 
        return sueldo;
    }

    /**
     * Método para modificar el sueldo del empleado
     * @param sueldo Sueldo del empleado
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    /**
     * Sobreescritura del método toString.
     * Utiliza super.toString() para obtener los datos de la clase padre y 
     * concatena los atributos específicos de Trabajador en la cadena de texto.
     * 
     * @return Cadena de texto con los datos completos del trabajador.
     */
    @Override
    public String toString() {
        return super.toString() + " | IDEmpleado=" + idEmpleado + ", Cargo=" + cargo + ", Sueldo=" + sueldo; 
    }
    
}