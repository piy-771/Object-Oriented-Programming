class Animal1{
    void speak(){
        System.out.println("Animal Speak");
    }
}
class Dog extends Animal1{
    @Override
    void speak() {           //we can give high access level to a function but we can't give weak accesslevel
        System.out.println("Dog Bark");
    }
}
class BullDog extends Dog{


}
public class DemoExample3 {
    public static void main(String[] args) {
        Animal1 object = new BullDog();
        object.speak();
        object = new Dog();
        object.speak();;

    }
}
