class Outer{
    String message = "I am outer class";
    class Inner{
        public void print(){
            System.out.println(message);
        }
    }
}
public class InnerDemo {
    public static void main(String[] args) {
        Outer outerObject = new Outer();
        Outer.Inner innerObject = outerObject.new Inner();
    }
}
