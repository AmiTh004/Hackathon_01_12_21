package model;

public class Bonbon extends Suessigkeit {

    String _suessSauer;

    public Bonbon(String marke, double gewicht, String suessSauer) {
        super(marke, gewicht);
        setSuessSauer(suessSauer);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String auspacken() {
        return getMarke() + getGewicht() + getSuessSauer();
    }

    public void setSuessSauer(String suessSauer) {
        this._suessSauer = suessSauer;
    }
    public String getSuessSauer() {
        return _suessSauer;
    }
    
}
