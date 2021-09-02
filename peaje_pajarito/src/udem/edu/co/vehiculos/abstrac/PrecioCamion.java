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
 * Abstracta que diferencia camion de motos y automovil
 */
public class PrecioCamion {
    //diferenciar camion de automovil o moto por precio de peaje
    
    //atrbituos globales
    public int preciocamion;
    public String tipo;

    
    
    /**
     * Constructor de la clase  camion sin automovil ni moto
    */
    public PrecioCamion() {
        this.preciocamion= 35000;
        this.tipo= "Camion";
    }
}
    
    
