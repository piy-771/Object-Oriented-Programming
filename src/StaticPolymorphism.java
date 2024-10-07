
class Message{
    public void showMessage(){
        System.out.println("Hello User");
    }
    public  void showMessage(String message){
        System.out.println(message);
    }
    public void showMessage(int id,String message){
        System.out.println("ID = " + id);
        System.out.println("Message = " + message);
    }
    public void  showMessage(String subject,String message){
        System.out.println("Subject = " + subject);
        System.out.println("Message = " + message);
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        Message object = new Message();
        object.showMessage();
        object.showMessage("This is function overloading");
        object.showMessage(123,"This is third method with different behavior");
        object.showMessage("Email","piyushsahu2103@gmail.com");
    }
}
