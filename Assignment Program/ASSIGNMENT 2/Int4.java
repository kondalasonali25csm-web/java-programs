interface I1{
    void car();
}

interface I2{
    void bus();
}

class C1 implements I1, I2{
    public void car() {
        System.out.println("this is car");
    }
    public void bus()    {
        System.out.println("this is bus");
    }

    
    public static void main(String args[])  {     
        C1 c = new C1();
        c.car();
        c.bus();
    }
}
