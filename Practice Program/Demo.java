package practice;

public class Demo {
    int x=100;
    int addition(int a, int b){

        return a + b;
    }

    void multiplication(){
        int a=4,b=5;
        System.out.println("product" + (a*b));
    }

    int sub(){
        int a=10 ,b=1;
        return a-b+1 ;
    }
    void div(int p , int q){
        System.out.println("quotient is" + (p/q));
    }

    public static void main(String[] args) {
        Demo a=new Demo();
        int s=a.addition(4,5);
        System.out.println("sum is"  +  s);
        int k=a.sub();
        System.out.println("difference is"  +  k);
        a.multiplication();
        a.div(10,5);
        System.out.println("class variable" + a.x);
    }
}
