package cz.czechitas.ukol3;

public class Procesor {

    private String vyrobce; // v bajtech
    private long rychlost; //  Hz

    public String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public long getRychlost() {
        return rychlost;
    }

    public void setRychlost(long rychlost) {
        this.rychlost = rychlost;
    }

    @Override
    public String toString() {return "" + vyrobce + "" + rychlost ;}

}
