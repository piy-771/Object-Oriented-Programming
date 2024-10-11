import javax.swing.*;

abstract  class Shape{
    abstract double calculateArea();
}
class Circle extends Shape{
    @Override
    double calculateArea() {
        final double pi = 3.14;
        int radius = Integer.parseInt(JOptionPane.showInputDialog("Enter radius"));
        return pi*radius*radius;
    }
}
class Rectangle extends Shape{
    @Override
    double calculateArea() {
        int length = Integer.parseInt(JOptionPane.showInputDialog("Enter length"));
        int breadth = Integer.parseInt(JOptionPane.showInputDialog("Enter breadth"));
        return length*breadth;
    }
}
public class AbstractDemo1 {
    public static void main(String[] args) {
        Shape obj = new Circle();
        System.out.println(obj.calculateArea());

        obj = new Rectangle();
        System.out.println(obj.calculateArea());
    }
}
