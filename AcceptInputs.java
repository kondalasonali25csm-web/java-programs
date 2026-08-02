package myprogs.basics;
import java.util.Scanner;
public class AcceptInputs {
	public static void main(String[] args) {
	System.out.println(" enter 2 numbers");
	Scanner s= new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		System.out.println("Result is:"+ (x+y));
	}
	}

