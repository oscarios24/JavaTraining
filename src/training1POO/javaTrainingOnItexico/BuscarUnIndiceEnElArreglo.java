package training1POO.javaTrainingOnItexico;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
public class BuscarUnIndiceEnElArreglo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		
		System.out.println("De que medida quieres el arreglo? ");
		int repeat = input.nextInt();
		int[] arreglo = new int[repeat];
				
		System.out.println("Ingresa los Valores del Arreglo: " + repeat + " Medida del Arreglo");
		//llenar el arreglo de monedas
		for (int i = 0; i < repeat; i++){
			System.out.println("Ingresa El valor?: ");
			arreglo[i] = input.nextInt();
		}
		//ordenar un arreglode menora mayor
		//Arrays.sort(monedasCambio);
		//imprimir el arreglo del primero al Ultimo
		for(int i = 0; i < arreglo.length; i++){
		    System.out.println("Valores ingresados :" + arreglo[i] );
		   }
		System.out.println("Cual valor quieres encontrar? ");
		int numeroAbuscar = input.nextInt();
		for (int i = 0; i < arreglo.length; i++){
			if (arreglo[i] == numeroAbuscar ){
				System.out.println("Numero Encontrado en el indice" + arreglo[i]);
				break;
			}
			
		}
		
		//int nextValue = 1;
		int valorMasgrande = 0;
		for (int i= 0; i < arreglo.length; i++){
			//nextValue = arreglo[i+1]
				for (int j= 0; i < arreglo.length; j++){
					if (arreglo[valorMasgrande] < arreglo[j]){
						valorMasgrande = arreglo[j];
						System.out.println("El valor mas grende fue " + valorMasgrande);
						} 
					else {
						System.out.println(arreglo[valorMasgrande]+ " Es Mayor que " + arreglo[j] );
							
					}
					
					
				}		
		
		}
		System.out.println("El valor mas grende fue " + valorMasgrande);
		
		/**nextValue = 0;
		int valorMaschiquito = 0;
		for (int i= 0; i < arreglo.length; i++){
			if (arreglo[i] < arreglo[nextValue +1] && i < arreglo.length ){
				valorMaschiquito = arreglo[i];
				nextValue ++;
				System.out.println("El valor mas chiquito fue " + valorMaschiquito);
				} else {
					nextValue ++;
				}
		
		}
		System.out.println("El valor mas chiquito fue " + valorMaschiquito); **/
		
		
		
		//IMPRIMER EL MAS PEQUE;O Y EL MAS GRANDE DEL ARREGLO
		//Ordenamos el Arreglo mediante la funcion Arrays, esta ordenara de menor a mayor
		/**Arrays.sort(arreglo);
		//Imprimir el Arreglo ordenado
		for(int i = 0; i < arreglo.length; i++){
		    System.out.println("Valor:" + arreglo[i] );
		   }
		int primerValorDelArreglo = 0;
		int ultimoValorDelArreglo = arreglo.length;
		System.out.println("El valor mas peque;o del arreglo es: " + arreglo[primerValorDelArreglo]);
		System.out.println("El valor mas grande grande del arreglo es: " + arreglo[ultimoValorDelArreglo -1]);
		input.close(); **/
		
		

	}

}