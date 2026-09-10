interface I1{
    void apple();
}
class C1 implements I1{
    public void apple(){
        System.out.println("this is apple");
    }
}
public class Main{
    public static void main(String args[]){
        C1 c = new C1();
        c.apple();
    }
}
