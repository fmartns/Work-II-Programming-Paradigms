public class Truck extends Vehicle {
    private double loadCapacity;

    public double getLoadCapacity() { return loadCapacity; }
    public void setLoadCapacity(double loadCapacity) { this.loadCapacity = loadCapacity; }

    @Override
    public void showUtility() {
        System.out.println("Veículo para transporte de cargas.");
    }

    @Override
    public void startEngine() {
        System.out.println("Ligando o motor do caminhão.");
    }
}