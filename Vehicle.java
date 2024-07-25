public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private String color;
    private int numberOfWheels;
    private String capacity;

    //Getters e Setters
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getNumberOfWheels() { return numberOfWheels; }
    public void setNumberOfWheels(int numberOfWheels) { this.numberOfWheels = numberOfWheels; }

    public String getCapacity() { 
        return capacity; 
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity + " litros";
    }

    protected void setRawCapacity(String capacity) {
        this.capacity = capacity;
    }

    //Métodos padrão
    public void showInfo() {
        System.out.println("Marca: " + brand + ", Modelo: " + model + ", Ano: " + year + ", Cor: " + color + ", Rodas: " + numberOfWheels + ", Capacidade: " + capacity + ".");
    }

    public void showUtility() {
        System.out.println("Utilidade desconhecida.");
    }

    public void startEngine() {
        System.out.println("Ligando o motor.");
    }

}