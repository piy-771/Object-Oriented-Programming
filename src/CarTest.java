class Car{
    String carName = "Ferrari";
    String model = "562";
    public void print(){
        System.out.println("Car Name = "+ carName);
        System.out.println("Car Model = " + model);
    }

    class Engine{
        void enginePrint(){
            print();
        }

    }
}
public class CarTest {
    public static void main(String[] args) {
        Car carObject = new Car();
        Car.Engine engineObject = carObject.new Engine();
        engineObject.enginePrint();

    }
}
