import javax.swing.*;

class Department{
    int departmentId;
    String departmentName;
    String departmentHead;
    public Department(){
        departmentId = 0;
        departmentName = null;
        departmentHead = null;
    }
    public Department(int departmentId,String departmentName){
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }
    public Department(int departmentId,String departmentName,String departmentHead){
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }
    public void print(){
        System.out.println("departmentId = " + departmentId);
        System.out.println("departmentName = " + departmentName);
        System.out.println("departmentHead = " + departmentHead);
    }
}
public class OverloadingImpl {
    public static void main(String[] args) {
        Department cs = new Department();
        cs.print();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter id"));
        String departmentName = JOptionPane.showInputDialog("Enter Department name");
        String departmentHeadName = JOptionPane.showInputDialog("Enter Department Head");
        Department aiml = new Department(id,departmentName);
        aiml.print();

        Department it = new Department(id,departmentName,departmentHeadName);
        it.print();
    }

}
