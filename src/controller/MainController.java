package controller;
import model.*;
import view.Output;

import java.util.ArrayList;

public class MainController {

    public void demoData(){

        ArrayList<Suessigkeit> suessigkeiten = new ArrayList<Suessigkeit>();
        
        Bonbon b = new Bonbon("Nestle", 23, "süß");
        suessigkeiten.add(b);
        Chips c = new Chips("funny", "sourcreme");
        suessigkeiten.add(c);
        Kaugummi k = new Kaugummi("Hubbabubba", "Erdbeere");
        suessigkeiten.add(k);
        Lolly l = new Lolly("Nestle");
        suessigkeiten.add(l);
        Schokoriegel s = new Schokoriegel("Nestle", 100);
        suessigkeiten.add(s);

        Output o = new Output();

        for (Suessigkeit suessigkeit : suessigkeiten) {
            o.printData(suessigkeit.auspacken());
        }

    
        

    }

    
}
