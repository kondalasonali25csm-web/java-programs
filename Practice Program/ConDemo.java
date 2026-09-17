package practice;

public class ConDemo {
    String name;
    int rollNo;

    public ConDemo(){
        this.name="Radha";
        this.rollNo=290;
    }

    public ConDemo(String s, int i){
        this.name=s;
        this.rollNo=i;
    }

    public void sample(){
        System.out.println(name);
        System.out.println(rollNo);
    }

    public void samp(){
        System.out.println(this.name);
        System.out.println(this.rollNo);
    }

    public static void  main(String[] args){
        ConDemo cd= new ConDemo();
        cd.sample();
        ConDemo c= new ConDemo("Krushn",291);
        c.samp();
    }
}
