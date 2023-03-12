package cz.czechitas.ukol3;

public class Pocitac {

    private boolean pcJeZapnuty;

    private Procesor cpu;
    private Pamet ram;

    private Disk pevnyDisk;


    public boolean isPcJeZapnuty() {
        return pcJeZapnuty;
    }

    public void zapniSe() {
        if (isPcJeZapnuty()) {
            System.err.println("Pocitac je jiz zapnuty");
            return;
        }

        boolean isOk = true;

        if (ram == null) {
            System.err.println(" V pocitaci neni pamet.");
            isOk = false;

        }
        if (cpu == null) {
            System.err.println(" V pocitaci neni procesor.");
            isOk = false;

        }
        if (pevnyDisk == null) {
            System.err.println(" V pocitaci neni disk.");
            isOk = false;

        }

        if (isOk) {
            pcJeZapnuty = true;
        }
    }

    public void vypniSe(){
        if (isPcJeZapnuty()) {
            pcJeZapnuty = false;
        }

    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (!isPcJeZapnuty()) {
            System.err.println("Pocitac neni zapnuty...");
            return;
        }

        long vyuziteMisto = pevnyDisk.getVyuziteMisto();
        long kapacita = pevnyDisk.getKapacita();

        vyuziteMisto+=velikost;

        if (vyuziteMisto > kapacita) {
            System.err.println("Na disku neni dostatek mista.");
        }
        else {
            pevnyDisk.setVyuziteMisto(vyuziteMisto);
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (!isPcJeZapnuty()) {
            System.err.println("Pocitac neni zapnuty...");
            return;
        }

        long vyuziteMisto = pevnyDisk.getVyuziteMisto();
        vyuziteMisto-=velikost;

        if (vyuziteMisto < 0) {
            System.err.println("?");
        }
        else {
            pevnyDisk.setVyuziteMisto(vyuziteMisto);
        }
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    @Override
    public String toString() {
        return "Pocitac: CPU: " + cpu + ", RAM: " + ram + ", HDD: " + pevnyDisk;
    }
}







