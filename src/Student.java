public class Student {
    //Attributes
    String name;
    int rollNo;
    String address;
    String email;

    public static void main(String[] args) {
        Student rohit = new Student();
        rohit.name = "Rohit Sharma";
        rohit.rollNo = 45;
        rohit.address = "Bhopal";
        rohit.email = "rohit@gmail.com";
        System.out.println("Name = "+rohit.name);
        System.out.println("Roll number = "+rohit.rollNo);
        System.out.println("Address = "+rohit.address);
        System.out.println("Email = "+rohit.email);
    }
}
