package training1POO.javaTrainingOnItexico;
import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create  a new object of fhe class Scanner to allow user enter information. 
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Cuantas veces lo quieres ejecutar");
		int veces = input.nextInt();
		int sumaEdades = 0;
		
		for (int i=0; i< veces; i++){
		System.out.println("Ingresa tu nombre");
		String nombre = input.next();
		System.out.println("Ingresa su edad");
		
		int edad = input.nextInt();
		if (nombre.equals("oscar") ){
			if (edad == 42){
				sumaEdades = sumaEdades + edad;
				System.out.println("Que perfil tiens?");
				String perfil = input.next();
				if (perfil.equals("tester")){
					System.out.println("Que salario quieres?");
					int sueldo = input.nextInt();
					if (sueldo >= 50000){
						System.out.println("Tu salario sera" + sueldo);
						System.out.println("Ya puedes quedarte a trabajar si es si escribe true si es no escribe false");
						boolean disponibilidad = input.nextBoolean();
						if (disponibilidad == true){
							System.out.println("Contratado YA ERES UN ITEXICAN");
							
						}else{
							System.out.println("Haz ingresado un valor incorrecto");
						}
						
					}else {
						System.out.println("Tu salario es menor de 50000");
					}
				}
				
			}else {
				System.out.println("No tienes 42 sale bye");
			}
			
		}else {
			System.out.println("Sale bye");
		}

	}
	System.out.println("Promedio" + sumaEdades / veces);	
		input.close();
}// fin del for
	
	
}
