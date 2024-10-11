import javax.swing.*;

interface Shape1{
     double calculateArea();
}
class Circle1 implements Shape1{
    @Override
    public double calculateArea() {
        final double pi = 3.14;
        int radius = Integer.parseInt(JOptionPane.showInputDialog("Enter radius"));
        return pi*radius*radius;
    }
}
class Rectangle1 implements Shape1{
    @Override
    public double calculateArea() {
        int length = Integer.parseInt(JOptionPane.showInputDialog("Enter length"));
        int breadth = Integer.parseInt(JOptionPane.showInputDialog("Enter breadth"));
        return length*breadth;
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Shape obj = new Circle();
        System.out.println(obj.calculateArea());

        obj = new Rectangle();
        System.out.println(obj.calculateArea());
    }
}
