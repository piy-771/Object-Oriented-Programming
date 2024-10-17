class A1{
    void show(){
        System.out.println("Parent A class");
    }
}
class B1 extends A1{
    void display(){
        System.out.println("Child B1 of parent A1");
    }
}

class  C1 extends  A1{
    void showInfo(){
        System.out.println("Child C1 of parent class A1");
    }
}

class D1 extends B1{

}

class  E1 extends  C1{

}

public class HierarchicalDemo {
    public static void main(String[] args) {
        D1 object = new D1();
        object.display();
        object.show();

        E1 object1 = new E1();
        object1.showInfo();
        object1.show();

    }
}
