package training1POO.javaTrainingOnItexico;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
public class Triangulito {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		
		System.out.println("De que medida quieres el arreglo? ");
		int repeat = input.nextInt();
		int[] asteriscos = new int[repeat];
		for (int i= 0; i < asteriscos.length; i++){
			for(int j =0; j < i+1; j++){
					System.out.print("*");
			}
			System.out.println();		
		}
		
		for (int i= 0; i < asteriscos.length; i++){
			for(int j =repeat; j > i ; j--){
					System.out.print("*");
			}
			System.out.println();		
		}
		input.close();
	}
	

}
