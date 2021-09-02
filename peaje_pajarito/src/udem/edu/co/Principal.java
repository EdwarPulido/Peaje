/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co;

import org.json.simple.JSONArray;
import udem.edu.co.vehiculos.Automovil;
import udem.edu.co.vehiculos.Camion;
import udem.edu.co.vehiculos.Moto;




/**
 *
 * @author s207e1
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JSONArray myArray = new JSONArray();
        
        // Agregar valores mixtos al array
        myArray.add(new Automovil("XML123", "AUDI"));
        myArray.add(new Camion("OOO12", "FORCE"));
        myArray.add(new Moto("LK12", "RX"));
       
       
        
        // Generar cadena de texto JSON
        System.out.print("Lista :"+myArray);
        
        
    }
    
}
