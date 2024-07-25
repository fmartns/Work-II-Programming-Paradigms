public class ElectricCar extends Car {

    @Override
    public void setCapacity(int capacity) {
        this.setRawCapacity(capacity + " watts");
    }

    @Override
    public void startEngine() {
        System.out.println("Iniciando sistema elétrico do carro.");
    }
}
