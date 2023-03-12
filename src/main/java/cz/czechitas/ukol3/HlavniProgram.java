package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.

        Pocitac pocitacPB;
        pocitacPB = new Pocitac();
        System.out.println(pocitacPB);
        pocitacPB.zapniSe();


        Disk diskPB;
        diskPB= new Disk();
        diskPB.setKapacita(268_435_456_000L);
        diskPB.setVyuziteMisto(113_816_633_344L);
        System.out.println(diskPB.toString());

        Pamet pametPB;
        pametPB=new Pamet();
        pametPB.setKapacitaPameti(8_589_934_592L);
        System.out.println(pametPB.toString());


        Procesor procesorPB;
        procesorPB= new Procesor();
        procesorPB.setRychlost(3_200_000_000L);
        procesorPB.setVyrobce("Apple");
        System.out.println(procesorPB.toString());

        pocitacPB.setPevnyDisk(diskPB);
        pocitacPB.setRam(pametPB);
        pocitacPB.setCpu(procesorPB);


        System.out.println(pocitacPB);
        pocitacPB.zapniSe();
        pocitacPB.zapniSe();

        pocitacPB.vytvorSouborOVelikosti(53_687_091_200L);

        pocitacPB.vymazSouboryOVelikosti(75_161_927_680L);


        pocitacPB.vypniSe();
        pocitacPB.vypniSe();




        System.out.println("Program spuštěn.");
    }

}
