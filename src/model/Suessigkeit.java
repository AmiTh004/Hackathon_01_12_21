package model;

public abstract class Suessigkeit {
    
    String _marke;
    int _gewicht;

    public Suessigkeit(String marke, int gewicht){
        setGewicht(gewicht);
        setMarke(marke);
    }

    public Suessigkeit(String marke){
        setMarke(marke);
    }

    public abstract String auspacken();

    public void setMarke(String marke) {
        this._marke = marke;
    }
    public String getMarke() {
        return _marke;
    }

    public void setGewicht(int gewicht) {
        this._gewicht = gewicht;
    }
    public int getGewicht() {
        return _gewicht;
    }

}
