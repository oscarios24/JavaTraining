package training1POO.javaTrainingOnItexico;
import java.util.Scanner;

public class MaquinaDeCambio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an object of the class scanner to allowuser to enter new values from the keyword. 
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa la cantidad");
		int monto = input.nextInt();
		int c1 = 25;
		int c2 = 10;
		int c3 = 5;
		int moneda,cambio = 0;
		System.out.println("Monto ingresado por el usuario $: " + monto);	
	if (monto >= c1 || monto >= c2 || monto >= c3){
		if (monto >= c1){
			moneda = monto / c1;
			cambio = monto % c1;
			System.out.println("Monedas de $25: " + moneda);
			monto = cambio;
			
		}//fin del if si monto >= 25
		if (monto >= c2){
			moneda = monto / c2;
			cambio = monto % c2;
			System.out.println("Monedas de $10 :" + moneda);
			monto = cambio;
		}//fin del if si monto >= 10
		
		if (monto >= c3){
			moneda = monto / c3;
			cambio = monto % c3;
			System.out.println("Monedas de $5: " + moneda);
			monto = cambio;
			}//fin del if si monto >= 5
		if (monto < 5 && monto != 0){
			System.out.println("Ya no tenemos mas cabio para $" + monto);
		}else if(monto == 0){
			System.out.println("Cambio COMPLETADO EN 0");			
		}		
	}else { 
		
		System.out.println("No hay cambio disponible para:$ " + monto);
		System.out.println("El monto ingresado debe de ser mayor a $5 pechereques");
	}
		
	input.close();	
	}

}

