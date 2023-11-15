package CPU;

public class Main {
    public static void main(String[] args) {
        // Membuat objek CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        // Mendapatkan informasi CPU
        myKomputer.getCPUInfo();

        // Membuat objek Processor
        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");

        // Mendapatkan informasi Processor
        i7.getProcessorInfo();

        // Membuat objek RAM
        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        // Mendapatkan informasi RAM
        rs32GB.getInfoRAM();

        // Membuat objek Hardisk
        Hardisk hardisk = new Hardisk(1000, "Seagate");

        // Mendapatkan informasi Hardisk
        hardisk.getInfoHardisk();

        // Membuat objek VGACard
        VGACard vgaCard = new VGACard("NVIDIA", "GeForce RTX 3080");

        // Mendapatkan informasi VGACard
        vgaCard.getVGACardInfo();

        // Membuat objek Motherboard
        Motherboard motherboard = new Motherboard("ASUS", "VivoBook Flip 14");

        // Mendapatkan informasi Motherboard
        motherboard.getMotherboardInfo();

        // Membuat objek PowerSupply
        PowerSupply powerSupply = new PowerSupply("Corsair", 750);

        // Mendapatkan informasi PowerSupply
        powerSupply.getPowerSupplyInfo();
    }
}
