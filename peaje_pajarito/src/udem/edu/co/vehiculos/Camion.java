/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.vehiculos;

import udem.edu.co.interfac.Vehiculos;
import udem.edu.co.vehiculos.abstrac.PrecioCamion;

/**
 *
 * @author s207e1
 */
public class Camion extends PrecioCamion implements Vehiculos{
    //atributos globales
    private String placa;
    private String marca;

    

   //constructor
    public Camion(String placa, String marca) {
        super();
        this.placa = placa;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    @Override
	public String toString() {
		return  "{\nPLACA  : "+ this.getPlaca()+","+
                        "\nMARCA : "+this.getMarca()+","+
                        "\nValor_Peaje : "+super.preciocamion+","+
                        "\nTIPO : "+super.tipo+"\n}";
	}
    
    
    
}
