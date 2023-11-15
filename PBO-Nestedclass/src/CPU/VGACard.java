package CPU;
// inner class VGACard
public class VGACard {
    String manufacturer;
    String model;

    VGACard(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void getVGACardInfo() {
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Model: " + this.model);
    }
}
