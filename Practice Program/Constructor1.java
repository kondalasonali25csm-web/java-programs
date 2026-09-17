package practice;

public class Constructor1 {
    String name;
    int rollNo;
    float fee;
    char sec;

    public Constructor1(String s,int i,float f,char c){
        this.name=s;
        this.rollNo =i;
        this.fee=f;
        this.sec=c;
    }

    public void  sample(){
        System.out.println("name :" + this.name);
        System.out.println("roll no. :" + this.rollNo);
        System.out.println("fee :" + this.fee);
        System.out.println("sec :" + this.sec);
    }

    public static void  main(String[] args){
        Constructor1 c= new Constructor1("Krushn",268,25000.50f,'D');
        System.out.println("Information ");
        c.sample();
    }
}
