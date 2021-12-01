package model;

public abstract class Suessigkeit {
    
    String _marke;
    double _gewicht;

    public Suessigkeit(String marke, double gewicht){
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

    public void setGewicht(double gewicht) {
        this._gewicht = gewicht;
    }
    public double getGewicht() {
        return _gewicht;
    }

}
