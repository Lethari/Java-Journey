
public class Car {//blueprint
    //attributes (private encapulate the variables)
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Grey";
    private int doors = 2;
    private boolean convertible = true;

    //getters used to access the private variables
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    //setters used to set the private variables
    public void setMake(String make) {
        if(make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch(lowerCaseMake) {
            case "bmw":
            case "porsche":
            case "tesla":
                this.make = make;
                break;
            default:
                System.out.println("Unsupported make: " + make);
        }
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    //method
    public void describeCar() {
        System.out.println(doors + "door " +
            color + " " +
            model + " " +
            make + " " +
            (convertible ? "Convertible" : " "));
    }
    
}
