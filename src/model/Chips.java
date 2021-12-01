package model;

public class Chips extends Suessigkeit {

    String _sorte;

    public Chips(String marke, String sorte) {
        super(marke);
        setSorte(sorte);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String auspacken() {
        // TODO Auto-generated method stub
        return null;
    }

    public void setSorte(String sorte) {
        this._sorte = sorte;
    }
    public String getSorte() {
        return _sorte;
    }
    
}
