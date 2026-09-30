package ec.edu.espoch.concessionaire;

public class Automobile {

    public Automobile(String brand, int model, double engine, FuelType fuelType, CarType carType, int numberOfDoors, int numberOfSeats, double maximumSpeed, Color color, double currentSpeed) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuelType = fuelType;
        this.carType = carType;
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.maximumSpeed = maximumSpeed;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public String brand;
    public int model;
    public double engine;
    public FuelType fuelType;
    public CarType carType;
    public int numberOfDoors;
    public int numberOfSeats;
    public double maximumSpeed;
    public Color color;
    public double currentSpeed;

    public boolean accelerate(double speed) {
        if (currentSpeed + speed> maximumSpeed) {
            System.out.println("No se puede acelerar: se superaria la velocidad máxima de " + maximumSpeed + "Km/h");
            return false;
        } else {
            currentSpeed+= speed;
            return true;
        }

    }

    public boolean decelerate(double speed) {
        if (currentSpeed-speed <= 0) {
            System.out.println("No se puede desacelerar menos de 0 km/h");
            return false;
        } else {
            currentSpeed-= speed;
            return true;
        }

    }

    public double brake() {
        return currentSpeed = 0;
    }

    public double estimateArrivalTime(double distance) {
        double time = distance / currentSpeed;

        return time;
    }

    public void display() {
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("engine: " + engine);
        System.out.println("fuelType: " + fuelType);
        System.out.println("carType: " + carType);
        System.out.println("numberOfDoors: " + numberOfDoors);
        System.out.println("numberOfSeats: " + numberOfSeats);
        System.out.println("maximumSpeed: " + maximumSpeed);
        System.out.println("color: " + color);
        System.out.println("currentSpeed: " + currentSpeed);

    }

}
