package practice;
class Read{
    void hello(){
        System.out.println("hello all..!!");
    }
    void bye(){
        System.out.println("bye everyone..!!");
    }
}
public class CreateObject {
   public static void main(String[] args) {
       Read r = new Read();
       r.hello();
       r.bye();
   }
}
