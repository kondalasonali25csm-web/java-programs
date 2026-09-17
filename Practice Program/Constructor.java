package practice;

public class Constructor {
    String name;
    int rollNo;
    float fee;
    char sec;

    public Constructor(){
        this.name="Radha";
        this.rollNo =266;
        this.fee=25000.50f;
        this.sec='D';
    }

    public void  sample(){
        System.out.println("name :" + name);
        System.out.println("roll no. :" + rollNo);
        System.out.println("fee :" + fee);
        System.out.println("sec :" + sec);
    }

    public static void  main(String[] args){
        Constructor c= new Constructor();
        System.out.println("information about Radha ");
        c.sample();
    }
}
