package training1POO.javaTrainingOnItexico;
import java.util.Scanner;


public class Practica3Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//c1 = 5;
		//c2 = 10;
		//c3 25;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cuantos repeticiones quieres? ");
		int repeat = input.nextInt();
		//int maxChangeSize = 10;
		int[] monedasCambio = new int[repeat];
		int moneda,cambio = 0;
		int j,auxiliar = 0;
		
		
		System.out.println("Ingresaras " + repeat + " Monedas");
		for (int i = 0; i < repeat; i++){
			System.out.println("Que moneda quieres ingresar?");
			monedasCambio[i] = input.nextInt();
		}
		
		//Ordenar el arreglo de enteros de mayor a menor
		for (int i=0; i< monedasCambio.length; i++){
			for(j=i+1; j< monedasCambio.length; j++ ){
				if(monedasCambio[i] < monedasCambio[j]){
					auxiliar = monedasCambio[i];
					monedasCambio[i] = monedasCambio[j];
					monedasCambio[j]= auxiliar;
				}
			} 
		}
		
		for(int i = 0; i < repeat; i++){
		    System.out.println("Monedas ingresadas :" + monedasCambio[i] );
		}
		System.out.println("Que monto tienes? ");
		int monto = input.nextInt();
		for(int i = 0; i < repeat; i++){
			if (monedasCambio[i] >= monedasCambio[i]){
				moneda = monto / monedasCambio[i];
				cambio = monto % monedasCambio[i];
				System.out.println("Valor moneda $: " + monedasCambio[i] + " Cuantas Monedas tendras = $" + moneda);
				monto = cambio;
				}//fin del if si monto >= 25
			if (monto < monedasCambio[i] && monto != 0){
				System.out.println("Ya no tenemos mas cabio para $ " + monto);
			}else if(monto == 0){
				System.out.println("Cambio COMPLETADO EN 0");			
			}
		}
		
		

			
		input.close();

	}

}
