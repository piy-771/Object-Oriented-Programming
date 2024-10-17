
class Parent{
    void showInfo(){
        System.out.println("Parent class show info");
    }
}
class Child extends Parent{

    void showInfo(){
        super.showInfo();
        System.out.println("Child class show info");
    }
}
public class DemoExample2 {
    public static void main(String[] args) {
        Child object = new Child();
        object.showInfo();
    }
}
