package org.example;

import java.io.FileNotFoundException;
import java.util.Set;


public class Film {

    String cim;
    int megjelenEv;
    String rendezo;
    float ertekeles;
    Fajlebeolvas fb;
    int mennyi;
    String ertekeltFilm;
    String FilmEvbol;
    
    public Film() throws FileNotFoundException {
        this.fb = new Fajlebeolvas();
        this.cim = cim;
        this.megjelenEv = megjelenEv;
        this.rendezo = rendezo;
        this.ertekeles = ertekeles;
        mennyiFilm();
        
        
    }
    
    void mennyiFilm(){
        setMennyi(fb.filmEv.size());
        
    }

    public void setMennyi(int mennyi) {
        this.mennyi = mennyi;
    }

    
}
