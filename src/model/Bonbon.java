package model;

public class Bonbon extends Suessigkeit {

    String _suessSauer;

    public Bonbon(String marke, int gewicht, String suessSauer) {
        super(marke, gewicht);
        setSuessSauer(suessSauer);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String auspacken() {
        // TODO Auto-generated method stub
        return null;
    }

    public void setSuessSauer(String suessSauer) {
        this._suessSauer = suessSauer;
    }
    public String getSuessSauer() {
        return _suessSauer;
    }
    
}
