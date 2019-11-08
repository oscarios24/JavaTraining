package training1POO.javaTrainingOnItexico;
import java.util.Scanner;

public class Practice4Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear una objeto de la clase scanner
		Scanner input = new Scanner(System.in);
		int[] arraydeEnteros = {1,2,3,4,5,6,7,8,9,10};
		int i;
		boolean encontrado = false;
		for (i=0; i < arraydeEnteros.length;i++){
			System.out.println("Numero del Array:" + arraydeEnteros[i]);
			
		}
		//Buscar un elemento en el array
		System.out.println("Que numero quieres ingresar el 1 al 10 ?");
		int numero = input.nextInt();
		for (i=0; i < arraydeEnteros.length; i++){
			if (numero == arraydeEnteros[i]){
				System.out.println("Numero encontrado en la posicion " + arraydeEnteros[i-1]);
				encontrado = true;
				break;
			}
							
		}//fin del for
		
		if (encontrado){
			System.out.println("Encontrado # " + numero + "At index" + i);
			}else {
				System.out.println(numero +  "No esta en el Array");
			}
	}

}
