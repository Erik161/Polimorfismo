/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author Asus Tuf
 */
public class CalculadoraDeArea {
     private Forma forma;

    public CalculadoraDeArea(Forma forma) {
        this.forma = forma;
    }

    public double obtenerArea() {
        return forma.calcularArea();
    }
}
