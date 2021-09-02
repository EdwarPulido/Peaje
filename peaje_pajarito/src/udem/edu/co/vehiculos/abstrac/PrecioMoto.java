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
 * Abstracta que diferencia moto de automovil y camion
 */
public class PrecioMoto {
    
    //diferenciar moto de camion o vehiculo por precio de peaje
    //atrbituos globales
    public int preciomoto;
    public String tipo;

    
    /**
     * Constructor de la clase  moto sin camion ni automovil
    */
    public PrecioMoto() {
        this.preciomoto= 0;
        this.tipo= "Moto";
    }
    
    
}
