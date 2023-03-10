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
        /*do {zapniSe();
            while (ram,cpu,pevnyDisk > 0;)
        }*/
        ram>0,cpu>0,pevnyDisk>0;

        while (true){
            zapniSe();
        }
        if (ram == null) {
            System.err.println(" V pocitaci neni pamet.");

        } else if (cpu == null) {
            System.err.println(" V pocitaci neni procesor.");

        } else if (pevnyDisk == null) {
            System.err.println(" V pocitaci neni disk.");

        } else if (isPcJeZapnuty() == false) {
            System.out.println("Pocitac je jiz zapnuty");
        } else {
        }

    }

    String Pocitac = Procesor, Pamet, Disk;
        switch(Pocitac;)

    {
        case ram == null
            ;
            System.err.println(" V pocitaci neni pamet.");
            break;
        case cpu == null
            ;
            System.err.println(" V pocitaci neni procesor.");
            break;
        case pevnyDisk == null
            ;
            System.err.println(" V pocitaci neni disk.");
            break;

    }

    public void vypniSe(){
        if (isPcJeZapnuty()== true);

    }


    public void novySouborOVelikosti(long velikost){
            while (isPcJeZapnuty());

            velikost=53_687_091_200L;

        long vyuziteMisto = +velikost;

        long kapcita=268_435_456_000L;
        if (vyuziteMisto>kapcita){
            System.out.println( " Na disku neni dostatek mista.");
        }
    }
    public void vymazSouboryOVelikosti(long velikostMazanehoSouboru){
        while (isPcJeZapnuty());

        velikostMazanehoSouboru=26_843_545_600L;

        long vyuziteMisto--velikostMazanehoSouboru&&>0;
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
        return " " + cpu + ram + pevnyDisk + '}';
    }
}







