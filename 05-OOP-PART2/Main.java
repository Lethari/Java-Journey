//this is a redundant way to write code as you manually set values.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("BMW");
        car.setModel("X5");
        car.setColor("Blue");
        car.setDoors(4);
        car.setConvertible(false);

        System.out.println("make: " + car.getMake());
        System.out.println("model: " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("911 Targa");
        targa.setColor("Red");
        targa.setDoors(2);
        targa.setConvertible(true);
        targa.describeCar();
    }
    
}
