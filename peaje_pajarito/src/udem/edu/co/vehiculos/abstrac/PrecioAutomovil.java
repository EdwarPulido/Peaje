/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.vehiculos.abstrac;

/**
 *
 * @author s207e1
 * @since 02/09/2021
 * Abstracta que diferencia automovil de motos y camion
 */
public class PrecioAutomovil {
    //diferenciar automovil de camion o moto por precio de peaje
    
    //atrbituos globales
    public String PrecioAutomovil;
    public String tipo;
    
    
    /**
     * Constructor de la clase  automovil sin camion ni moto
    */
    public PrecioAutomovil() {
        this.PrecioAutomovil= "8600";
        this.tipo= "Automovil";
        
    }
}
