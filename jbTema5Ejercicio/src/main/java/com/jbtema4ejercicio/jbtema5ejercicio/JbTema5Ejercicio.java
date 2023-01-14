/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.jbtema4ejercicio.jbtema5ejercicio;

/**
 *
 * @author alexn
 */
public class JbTema5Ejercicio {

    public static void main(String[] args) {
        
        CocheCRUDImpl myCoche = new CocheCRUDImpl ();
        
        myCoche.save();
        myCoche.findAll();
        myCoche.delete();
     
    }
}
