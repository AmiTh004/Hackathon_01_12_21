package model;

public class Schokoriegel extends Suessigkeit {

    public Schokoriegel(String marke, double gewicht) {
        super(marke, gewicht);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String auspacken() {
        return getMarke() + getGewicht();
    }
    
}
