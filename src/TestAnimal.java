class Animal{
    void speak(){
        System.out.println("Animal Speak");
    }
}
public class TestAnimal {
    public static void main(String[] args) {
        //Anonymous class
        Animal dog = new Animal(){
            @Override
            void speak() {
                System.out.println("Dogs Bark");
            }
        } ;
        dog.speak();

        Animal cat = new Animal(){
            @Override
            void speak() {
                System.out.println("Cat meow");
            }
        };
        cat.speak();
    }
}
