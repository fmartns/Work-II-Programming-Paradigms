public class Main {
    public static void main(String[] args) {
        // Uso de polimorfismo com a classe base Vehicle
        Vehicle car1 = new Car();
        car1.setBrand("Fiat");
        car1.setModel("Mobi");
        car1.setYear(2018);
        car1.setColor("Vermelho");
        car1.setNumberOfWheels(4);
        car1.setCapacity(45);
        car1.showInfo();    // Método de Vehicle
        car1.showUtility(); // Método sobrescrito em Car
        car1.startEngine(); // Método sobrescrito em Car

        Vehicle truck1 = new Truck();
        truck1.setBrand("Volvo");
        truck1.setModel("FH");
        truck1.setYear(2022);
        truck1.setColor("Azul");
        truck1.setNumberOfWheels(8);
        truck1.setCapacity(500);
        truck1.showInfo();    // Método de Vehicle
        truck1.showUtility(); // Método sobrescrito em Truck
        truck1.startEngine(); // Método sobrescrito em Truck

        Vehicle moto1 = new Motorcycle();
        moto1.setBrand("Yamaha");
        moto1.setModel("R1");
        moto1.setYear(2020);
        moto1.setColor("Preto");
        moto1.setNumberOfWheels(2);
        moto1.setCapacity(90);
        moto1.showInfo();    //Método de Vehicle
        moto1.showUtility(); //Método sobrescrito em Motorcycle
        moto1.startEngine(); //Método sobrescrito em Motorcycle

        Vehicle electricCar1 = new ElectricCar();
        electricCar1.setBrand("Tesla");
        electricCar1.setModel("Model 3");
        electricCar1.setYear(2021);
        electricCar1.setColor("Branco");
        electricCar1.setNumberOfWheels(4);
        electricCar1.setCapacity(543);
        electricCar1.showInfo();    //Método de Vehicle
        electricCar1.showUtility(); //Método sobrescrito em ElectricCar
        electricCar1.startEngine(); //Método sobrescrito em ElectricCar
    }
}