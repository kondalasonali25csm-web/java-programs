class C2{
    void men()
    {
        System.out.println("this is men");
    }
}
interface I1{
    void women();
}
class C1 extends C2 implements I1
{
    public void women()
    {
        System.out.println("this is women");
    }

    public static void main(String args[])
    {
        C1 c = new C1();
        c.men();
        c.women();
    }
}
