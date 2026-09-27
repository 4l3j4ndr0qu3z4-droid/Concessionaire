package ec.edu.espoch.concessionaire;

public class Concessionaire {

    public static void main(String[] args) {
        Automobile carOne = new Automobile("Toyota", 2019, 40, FuelType.GASOLINE, CarType.FAMILY_CAR, 4,6, 200, Color.RED, 100 );
        
        System.out.println("Velocidad actual de " + carOne.currentSpeed);
        carOne.accelerate(20);
        System.out.println("Velocidad actual de " + carOne.currentSpeed);
        carOne.accelerate(50);
        System.out.println("Velocidad actual de " + carOne.currentSpeed);
        carOne.brake();
        System.out.println("Velocidad actual de " + carOne.currentSpeed);
        
    }
    
}
