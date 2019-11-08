package training1POO.javaTrainingOnItexico;
import java.util.Scanner;

public class Practice2 {
	
	public static void main(String[] args) {

	//Create an object of the Scanner class to use the keyword.
	Scanner input = new Scanner(System.in);
	int conteoSuma = 0;
	int conteoResta = 0;
	int conteoMultiplicacion =0;
	for (int i =0; i<100; i++){
	System.out.println("CALCULADORA CIENTIFICA DE ITEXICO");
	System.out.println("Ingresa por favor una opcion deseada");
	System.out.println("1) Suma");
	System.out.println("2) Resta");
	System.out.println("3) Multiplicacion");
	System.out.println("4) Conteo");
	
	String opcion = input.next();
	int resultado = 0;
   	   if (opcion.equals("1") || opcion.equals("Suma")){
	    	System.out.println("Ingresa el numero 1");
	    	int numero1 = input.nextInt();
	    	System.out.println("Ingresa el numero 2");
	    	int numero2 = input.nextInt();
	    	resultado = numero1 + numero2;
	    	System.out.println("La SUMA es: " + resultado );
	    	conteoSuma++;
		}
		
		if (opcion.equals("2") || opcion.equals("Resta")){
			System.out.println("Ingresa el numero 1");
	    	int numero3 = input.nextInt();
	    	System.out.println("Ingresa el numero 2");
	    	int numero4 = input.nextInt();
	    	resultado = numero3 - numero4;
	    	System.out.println("La RESTA es: " + resultado);
	    	conteoResta++;
		}
		
		if (opcion.equals("3") || opcion.equals("Multiplicacion")){
	    	System.out.println("Ingresa el numero 1");
	    	int numero5 = input.nextInt();
	    	System.out.println("Ingresa el numero 2");
	    	int numero6 = input.nextInt();
	    	resultado = numero5 * numero6;
	    	System.out.println("La Multiplicacion es: " + resultado );
	    	conteoMultiplicacion++;
		}	
		if (opcion.equals("4")|| opcion.equals("Conteo")){
			System.out.println("Sumas totales :" + conteoSuma);
			System.out.println("Restas totales :" + conteoResta);
			System.out.println("Multiplicaciones totales :" + conteoMultiplicacion);
			conteoSuma = 0;
			conteoResta = 0;
			conteoMultiplicacion = 0;
		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("");
   
   }
	   
	
	input.close();
	}
}
	
