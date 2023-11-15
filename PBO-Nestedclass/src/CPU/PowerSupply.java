package CPU;


// inner class PowerSuply

public class PowerSupply {
    String manufacturer;
    int power;

    PowerSupply(String manufacturer, int power) {
        this.manufacturer = manufacturer;
        this.power = power;
    }
    public void getPowerSupplyInfo() {
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Power: " + this.power + " Watt");
    }
}