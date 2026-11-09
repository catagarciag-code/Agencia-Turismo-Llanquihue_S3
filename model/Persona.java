/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Descripción: Clase base general que representa a una persona vinculada a la agencia de turismo.
 * Aplica principios de encapsulamiento y sirve como superclase para 
 * entidades más específicas, como Trabajador.
 *
 * @author Catalina García Santana
 */
public class Persona {
    // Atributos privados para garantizar el encapsulamiento
    private String nombre;
    private String rut;
    private String telefono;
    // Aplicación de composición: La clase Persona contiene un objeto de tipo Ubicacion.
    private Ubicacion ubicacion;
    
    /**
     * Constructor por defecto.
     * Permite crear un objeto Persona vacío para luego asignarle valores 
     * mediante los métodos modificadores (setters).
     */
    public Persona() {
    }
    
    /**
     * Constructor con parámetros.
     * Inicializa todos los atributos de la persona, incluyendo su objeto compuesto (ubicación).
     * 
     * @param nombre Nombre completo de la persona.
     * @param rut RUT de la persona (ej. 12.345.678-9).
     * @param telefono Número de teléfono de contacto.
     * @param ubicacion Objeto de tipo Ubicacion asociado a esta persona (Composición).
     */
    public Persona(String nombre, String rut, String telefono, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
    }

    // ==========================================
    // Getters & Setters (Métodos de acceso)
    // ==========================================
    
    /**
     * Método para obtener nombre de la persona
     * @return nombre Nombre completo de la persona
     */
    public String getNombre() { 
        return nombre;
    }
    
    /**
     * Método para modificar el nombre de la persona
     * @param nombre Nombre completo de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método para obtener el RUT de la persona
     * @return rut Rut de la persona
     */
    public String getRut() {
        return rut;
    }
    
    /**
     * Método para modificar el RUT de la persona
     * @param rut Rut de la persona
     */
    public void setRut(String rut) {
        this.rut = rut;
    }
    
    /**
     * Método para obtener el teléfono de contacto de la persona
     * @return telefono Número de teléfono de la persona
     */
    public String getTelefono() {
        return telefono;
    }
    
    /**
     * Método para modificar el teléfono de contacto de la persona
     * @param telefono Número de teléfono de la persona
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método para obtener la ubicación de la persona
     * @return ubicacion Ubicación de la persona
     */
    public Ubicacion getUbicacion() {
        return ubicacion;
    }
    
    /**
     * Método para modificar la ubicación de la persona
     * @param ubicacion Ubicación de la persona
     */
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    /**
     * Sobreescritura del método toString para representar el objeto como texto.
     * Al imprimir 'ubicacion', Java llama automáticamente al método toString() 
     * de la clase Ubicacion, mostrando todos los datos anidados en la cadena.
     * 
     * @return Cadena de texto con la información completa de la persona.
     */
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + nombre + ", RUT=" + rut + ", Telefono=" + telefono + ", Ubicacion=" + ubicacion + '}';
    }
    
    
}
    
