package CPU;
// inner class Motherboard
public class Motherboard {
    String manufacturer;
    String model;

    Motherboard(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void getMotherboardInfo() {
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Model: " + this.model);
    }
}