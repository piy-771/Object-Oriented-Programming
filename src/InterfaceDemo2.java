interface A{
    void disp();
}
interface B extends A{
    void display();
}
interface C extends A{
    void print();
}
interface D extends  B,C{
    void hello();
}

class Test implements D{
    @Override
    public void hello() {
        System.out.println("Hello, I am a D class method");
    }

    @Override
    public void display() {
        System.out.println("Hello, I am a B class method");
    }

    @Override
    public void print() {
        System.out.println("Hello, I am a C class method");
    }

    @Override
    public void disp() {
        System.out.println("Hello, I am a A class method");
    }
}
class Test1 implements D{
    @Override
    public void hello() {
        System.out.println("A");
    }

    @Override
    public void display() {
        System.out.println("B");
    }

    @Override
    public void print() {
        System.out.println("C");
    }

    @Override
    public void disp() {
        System.out.println("D");
    }
}
public class InterfaceDemo2 {
    public static void main(String[] args) {
        D object = new Test();
        object.hello();
        object.display();
        object.disp();
        object.print();

        object = new Test1();
             object.hello();
        object.display();
        object.disp();
        object.print();
        
    }

}
