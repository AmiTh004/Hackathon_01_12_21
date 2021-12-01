package model;

public class Kaugummi extends Suessigkeit {

    String _geschmack;

    public Kaugummi(String marke, String geschmack) {
        super(marke);
        setGeschmack(geschmack);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String auspacken() {
        // TODO Auto-generated method stub
        return getMarke() + getGeschmack();
    }

    public void setGeschmack(String geschmack) {
        this._geschmack = geschmack;
    }

    public String getGeschmack() {
        return _geschmack;
    }
    
}
