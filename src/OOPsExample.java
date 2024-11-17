class Car1 {
    //Attributes(Encapsulation)
    private String brand;
    private String color;
    private  int speed;

    //Constructor
    public Car1(String brand,String color){
        this.brand = brand;
        this.color = color;
        speed = 0;  //Default speed is 0.
    }

    //Method to start the car
    public  void start(){
        System.out.println(brand + " car is started");
    }

    //Method to accelerate the car
    public void accelerate(int increment){
        speed += increment;
        System.out.println(brand + " car is now running at " + speed + " km/h");
    }

    //Getter for Speed(Data Encapsulation)
    public int getSpeed() {
        return speed;
    }
}
public class OOPsExample {
    public static void main(String[] args) {
        //Create objects (Instances of the Car class)
        Car1 car1Object = new Car1("Tesla","Black");
        Car1 car1Object1 = new Car1("Ford","White");

        //Use methods of Car Objects
        car1Object.start();
        car1Object1.accelerate(20);

        car1Object1.start();
        car1Object1.accelerate(30);

        System.out.println("Car 1 speed: " + car1Object.getSpeed() + " km/hr");
        System.out.println("Car 2 speed: " + car1Object1.getSpeed() + " km/hr");

    }
}
