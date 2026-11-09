/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Descripción: Clase que representa la dirección física de una persona o trabajador en el sistema.
 * Esta clase se utiliza para aplicar el principio de composición dentro de otras 
 * clases del modelo (como Persona).
 *
 * @author Catalina García Santana
 */
public class Ubicacion {
    // Atributos privados para asegurar el encapsulamiento
     private String calle;
     private String numero;
     private String comuna;
     private String region;
     
    /**
     * Constructor por defecto.
     * Inicializa la ubicación con valores predeterminados asociados a la sede de la agencia.
     */
    public Ubicacion() {
        this.calle = "Sin calle";
        this.numero = "Sin numero";
        this.comuna = "Llanquihue";
        this.region = "Los Lagos";
    }

    /**
     * Constructor con parámetros.
     * Permite instanciar una ubicación con datos específicos.
     * 
     * @param calle Nombre de la calle.
     * @param numero Número de la dirección.
     * @param comuna Comuna de residencia.
     * @param region Región de residencia.
     */
    public Ubicacion(String calle, String numero, String comuna, String region) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.region = region;
    }

    // ==========================================
    // Getters & Setters (Métodos de acceso)
    // ==========================================

    /**
     * Método para obtener la calle de la ubicación
     * @return calle Nombre de la calle de la ubicación
     */
    public String getCalle() { 
        return calle;
    }
    
    /**
     * Método para modificar la calle de la ubicación
     * @param calle Nombre de la calle de la ubicación
     */
    public void setCalle(String calle) { 
        this.calle = calle;
    }
    
    /**
     * Método para obtener el número de la ubicación
     * @return numero Número de la ubicación
     */
    public String getNumero() { 
        return numero;
    }
    
    /**
     * Método para modificar el número de la ubicación
     * @param numero Número de la ubicación
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Método para obtener la comuna de la ubicación
     * @return comuna Comuna de la ubicación
     */
    public String getComuna() { 
        return comuna;
    }
    
    /**
     * Método para modificar la comuna de la ubicación
     * @param comuna Comuna de la ubicación
     */
    public void setComuna(String comuna) { 
        this.comuna = comuna;
    }

    /**
     * Método para obtener la región de la ubicación
     * @return region Región de la ubicación
     */
    public String getRegion() {
        return region;
    }
    
    /**
     * Método para modificar la región de la ubicación
     * @param region Región de la ubicación
     */
    public void setRegion(String region) {
        this.region = region;
    }
    
    /**
     * Sobreescritura del método toString para representar el objeto como texto.
     * @return Cadena de texto que indica los datos completos de la ubicación.
     */
    @Override
    public String toString() {
        return "Ubicacion{" + "calle=" + calle + ", numero=" + numero + ", comuna=" + comuna + ", region=" + region + '}';
    }
    
}