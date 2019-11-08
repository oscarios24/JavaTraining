package training1POO;
import java.util.Scanner;
import java.io.IOException;

public class Helloword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world test Oscar");
		Scanner scaner = new Scanner(System.in); 
		
		System.out.println("Enter your name:");
		String name = scaner.nextLine();
		System.out.println("Your name is:" + name);
		System.out.println("Enter your age:");
		String age = scaner.nextLine();
		int age1 = Integer.parseInt(age);
		System.out.println("Age:" + age1);
		scaner.close();
		if (age1 == 42){
			System.out.println("Hello Oscar");
		}else System.out.println("Please enter other age.");
		
	}

}
