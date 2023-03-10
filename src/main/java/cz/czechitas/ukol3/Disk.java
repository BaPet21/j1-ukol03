package cz.czechitas.ukol3;

public class Disk {

    private long kapacita; // v bajtech
    private long vyuziteMisto; // v bajtech

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    @Override
    public String toString() {return  kapacita + " " + vyuziteMisto ;}
    }




