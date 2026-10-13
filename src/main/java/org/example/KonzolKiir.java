/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.io.FileNotFoundException;

/**
 *
 * @author install
 */
public class KonzolKiir {
    Film film;
    public KonzolKiir() throws FileNotFoundException {
        this.film = new Film();
        kiirMennyi();
        
    }
            void kiirMennyi(){
                System.out.println("Filmek Száma: " + film.mennyi);
    }
           
}
