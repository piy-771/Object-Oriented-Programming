import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

abstract class Employe{
    abstract double calculateSalary();
}
class Manager extends  Employe{
    @Override
    double calculateSalary() {
        double salary = Integer.parseInt(JOptionPane.showInputDialog("Enter salary"));
        double travelAllowance = (salary*10)/100;
        double prominentFund = (salary*12)/100;
        double netSalary = salary +travelAllowance-prominentFund;
        return netSalary;
    }
}
class  Accountant extends Employe{
    @Override
    double calculateSalary() {
        double salary = Integer.parseInt(JOptionPane.showInputDialog("Enter salary"));
        double travelAllowance = (salary*5)/100;
        double prominentFund = (salary*12)/100;
        double netSalary = salary +travelAllowance-prominentFund;
        return netSalary;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Employe obj = new Manager();
        double result = obj.calculateSalary();
        System.out.println("Result = " + result);

        obj = new Accountant();
        double result1 = obj.calculateSalary();
        System.out.println("Result = " + result1);
    }




}
