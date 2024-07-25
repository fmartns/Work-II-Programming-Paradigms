public class Car extends Vehicle {
    private int numberOfDoors;

    public int getNumberOfDoors() { return numberOfDoors; }
    public void setNumberOfDoors(int numberOfDoors) { this.numberOfDoors = numberOfDoors; }

    @Override
    public void showUtility() {
        System.out.println("Veículo para passeio.");
    }

    @Override
    public void startEngine() {
        System.out.println("Ligando o motor do carro.");
    }
}
