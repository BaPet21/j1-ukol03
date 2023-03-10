package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.

        Pocitac pocitacPB;
        pocitacPB= new Pocitac();
        pocitacPB.getPevnyDisk();
        pocitacPB.getRam();
        pocitacPB.getCpu();
        System.out.println("Pocitac :" );
        pocitacPB.zapniSe();



        Disk diskPB;
        diskPB= new Disk();
        diskPB.setKapacita(268_435_456_000L);
        diskPB.setVyuziteMisto(113_816_633_344L);
        System.out.println("Disk má kapacitu " + diskPB.getKapacita() + " bajtu a využité místo " + diskPB.getVyuziteMisto() + " bajtu.");

        Pamet pametPB;
        pametPB=new Pamet();
        pametPB.setKapacitaPameti(8_589_934_592L);
        System.out.println("Kapacita paměti je " + pametPB.getKapacitaPameti() + " bajtu.");


        Procesor procesorPB;
        procesorPB= new Procesor();
        procesorPB.setRychlost(3_200_000_000L);
        procesorPB.setVyrobce("Apple");
        System.out.println("Procesor značky " + procesorPB.getVyrobce() + " o rychlosti " + procesorPB.getRychlost() + " Hz.");

        pocitacPB.setPevnyDisk(diskPB);
        pocitacPB.setRam(pametPB);
        pocitacPB.setCpu(procesorPB);



        System.out.println("Program spuštěn.");
    }

}
