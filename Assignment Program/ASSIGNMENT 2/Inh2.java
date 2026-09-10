class C2{
    void show2(){
        System.out.println(" from C2");
    }
}
class C3{
    void show3(){
        System.out.println("from C3 ");
    }
}
// ERROR: Java does not allow extending two classes
class C1 extends C2, C3{
void show1(){
System.out.println(“C1”);
}

public class Inh2 {
    public static void main(String args[])
    {
        C2 c = new C1();
        c.show2();
        c.show3();
      c.show1();
    }
}
