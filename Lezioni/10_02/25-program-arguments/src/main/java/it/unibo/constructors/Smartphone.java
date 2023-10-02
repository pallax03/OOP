package it.unibo.constructors;

class Smartphone {

    static final boolean DEF_HAS_GPS = true;
    static final boolean DEF_HAS_3G = true;
    static final boolean DEF_HAS_NFC = true;
    static final int DEF_SD_SIZE = 8192;
    static final int DEF_RAM_SIZE = 1024;
    static final int DEF_N_CPU = 2;

    int nCPU;
    int ram;
    int sdSize;
    String brand;
    String model;
    boolean hasGPS;
    boolean has3G;
    boolean hasNFC;

    Smartphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    Smartphone(String brand, String model, int nCPU, int ram, int sdSize, boolean hasGPS, boolean has3G, boolean hasNFC) {
        this(brand, model, hasGPS, has3G);
        
        this.nCPU = nCPU;
        this.ram = ram;
        this.sdSize = sdSize;
        this.hasNFC = hasNFC;
    }

    Smartphone(String brand, String model, boolean hasGPS, boolean has3G) {
        this(brand, model);
        this.hasGPS = hasGPS;
        this.has3G = has3G;
    }

    Smartphone(String brand, String model, int sdSize) {
        this(brand, model);
        this.sdSize = sdSize;
    }

    Smartphone(String brand, String model, boolean hasNFC) {
        this(brand, model);
        this.hasNFC = hasNFC;
    }

    void printStringRep() {
        System.out.println("Smartphone info:");
        System.out.println("n CPU(s): " + this.nCPU);
        System.out.println("RAM amount: " + this.ram);
        System.out.println("SD size: " + this.sdSize);
        System.out.println("brand: " + this.brand);
        System.out.println("model: " + this.model);
        System.out.println("hasGPS: " + this.hasGPS);
        System.out.println("has3G: " + this.has3G);
        System.out.println("hasNFC: " + this.hasNFC + "\n");
    }

    public static void main(final String[] args) {
        // 1) Creare lo smarthpone HTC One sdSize:1024
        Smartphone smartphone1 = new Smartphone("HTC", "One", 1024);
        smartphone1.printStringRep();

        // 2) Creare lo smarthpone Samsung Galaxy Note 3 ram:2048 cpu:4
        // sdSize:8192 gps:true nfc:true 3g:true
        Smartphone smartphone2 = new Smartphone("Samsung", "Galaxy Note 3", 4, 2048, 8192, true, true, true);
        smartphone2.printStringRep();

        // 3) Creare lo smarthpone Apple iPhone 5S nfc:false
        Smartphone smartphone3 = new Smartphone("Apple", "Iphone 5S", false);
        smartphone3.printStringRep();

        // 4) Creare lo smarthpone Google Nexus 4 gps:true 3g:true
        Smartphone smartphone4 = new Smartphone("Google", "Nexus 4", true, true);
        smartphone4.printStringRep();

        // 5) Utilizzare il metodo printStringRep per stampare in standard
        // output le informazioni di ciascun telefono
    }
}
