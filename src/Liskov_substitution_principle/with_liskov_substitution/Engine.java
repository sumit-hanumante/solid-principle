package Liskov_substitution_principle.with_liskov_substitution;


public class Engine {

    private int cc;
    private String type;

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
