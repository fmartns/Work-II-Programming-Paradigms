public class Motorcycle extends Vehicle {
    
    @Override
    public void showUtility() {
        System.out.println("Veículo de duas rodas.");
    }

    @Override
    public void startEngine() {
        System.out.println("Ligando o motor da moto.");
    }
}

