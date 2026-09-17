package practice;

import java.util.Scanner;

public class AcceptsInputs {
    public static void main(String[] args){
        System.out.println("enter two numbers to add:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("sum is" + (x+y));
    }
}
