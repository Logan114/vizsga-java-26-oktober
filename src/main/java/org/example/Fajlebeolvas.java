/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author install
 */
class Fajlebeolvas {
    HashMap<String, String> filmRendezo = new HashMap<>();
    HashMap<String, String> filmEv = new HashMap<>();
    HashMap<String, String> filmErtekeles = new HashMap<>();

    public Fajlebeolvas()throws FileNotFoundException{
        try (BufferedReader br = new BufferedReader(new FileReader("filmek.txt"))) {
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] segedvaltozo;
                segedvaltozo = sor.split(";");
                filmRendezo.put(segedvaltozo[2], segedvaltozo[1]); //0 cim,1 ev, 2 rendezo, 3 ertekeles
                filmEv.put(segedvaltozo[1], segedvaltozo[0]); //0 cim,1 ev, 2 rendezo, 3 ertekeles
                filmErtekeles.put(segedvaltozo[3], segedvaltozo[0]); //0 cim,1 ev, 2 rendezo, 3 ertekeles
            }
            
                

    }   catch (IOException ex) {
            Logger.getLogger(Fajlebeolvas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
 

    public Fajlebeolvas(String filenev) throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filenev))) {
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] segedvaltozo;
                segedvaltozo = sor.split(";");
                filmRendezo.put(segedvaltozo[0], segedvaltozo[2]); //0 cim,1 ev, 2 rendezo, 3 ertekeles
                filmEv.put(segedvaltozo[0], segedvaltozo[1]); //0 cim,1 ev, 2 rendezo, 3 ertekeles
                filmErtekeles.put(segedvaltozo[0], segedvaltozo[3]); //0 cim,1 ev, 2 rendezo, 3 ertekeles
            }
            
  
    }

}
}
