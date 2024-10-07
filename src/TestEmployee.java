import javax.swing.*;

class Employee{
    //Attributes
    String name;
    String address;
    String email;
    double salary;

    void setDetails(){
        name = JOptionPane.showInputDialog("Enter employee name");
        address = JOptionPane.showInputDialog("Enter employee address");
        email = JOptionPane.showInputDialog("Enter employee email");
        salary = Double.parseDouble(JOptionPane.showInputDialog("Enter employee salary"));
    }

    void getDetails(){
        JOptionPane.showMessageDialog(null,"Employee Name = \t"+name);
        JOptionPane.showMessageDialog(null,"Employee Address = \t"+address);
        JOptionPane.showMessageDialog(null,"Employee Email = \t"+email);
        JOptionPane.showMessageDialog(null,"Employee Salary = \t"+salary);
    }

}

public class TestEmployee {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setDetails();
        obj.getDetails();
;    }
}
