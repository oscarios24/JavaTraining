package training1POO.javaTrainingOnItexico;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
public class OperacionesConArreglos {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		
		System.out.println("De que medida quieres el arreglo? ");
		int repeat = input.nextInt();
		int[] monedasCambio = new int[repeat];
				
		System.out.println("Ingresa los Valores del Arreglo: " + repeat + "Medida del Arreglo");
		//llenar el arreglo de monedas
		for (int i = 0; i < repeat; i++){
			System.out.println("Ingresa El valor?: " + monedasCambio[i] );
			monedasCambio[i] = input.nextInt();
		}
		//ordenar un arreglode menora mayor
		Arrays.sort(monedasCambio);
		//imprimir el arreglo del primero al Ultimo
		for(int i = 0; i < monedasCambio.length; i++){
		    System.out.println("Monedas ingresadas :" + monedasCambio[repeat -1] );
		    repeat --;
		}
		int[] arreglo2 = {1,2,3,4};
		//Funcion para comparar arreglos
		if (Arrays.equals(monedasCambio, arreglo2)){
			//System.out.println("Los arreglos son igules");
		}else {
		System.out.println("Los arreglos son diferentes");
		}
		System.out.println("Cual valor quieres encontrar? ");
		int numeroAbuscar = input.nextInt();
		
		int value = Arrays.binarySearch(monedasCambio, numeroAbuscar);
		System.out.println("Valor encontrado en el index :" + arreglo2[value]);			
		input.close();

	}

}

