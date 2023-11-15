package CPU;

// inner class Harddisk
public class Hardisk {
    int kapasitas;
    String manufacturer;

    Hardisk(int kapasitas, String manufacturer) {
        this.kapasitas = kapasitas;
        this.manufacturer = manufacturer;
    }

    public void getInfoHardisk() {
        System.out.println("Kapasitas Hardisk: " + this.kapasitas + " GB");
        System.out.println("Pabrik: " + this.manufacturer);
    }
}