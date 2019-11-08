package training1POO.javaTrainingOnItexico;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
public class PooTest1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		
		System.out.println("Ingresa una cadena ");
		//String a = input.next();
		        
			String a = "Landeta";
        ArrayList<String> listas = new ArrayList<String>();
        listas.add("a");
        listas.add("e");
        listas.add("i");
        listas.add("o");
        listas.add("u");
       
        for(int i = 0; i < a.length(); i++) {
            if(listas.contains( String.valueOf(a.charAt(i)) )) {
            	System.out.println("Ingresa una cadena " );
            }
        }
    
		
		
		input.close();
	}
	

}

