package training1POO;

public class IntelligentCell extends Cellphone {
	
	String procesador;
	String color;
	void caracteristicas(String newValue1, String newValue2){
		procesador = newValue1;
		color = newValue2;
	}
	void imprimirModelo3 (){
		
		System.out.println("Your cell is:" + marca);
		System.out.println("Your marca is:" + modelo);
		System.out.print("Your model is " + systemaOperativo);
		System.out.println("Gigas:" + gigas);
		System.out.println("Your Memory is:" + memoria);
		System.out.println("Your procesador is:" + procesador);
		System.out.println("Your Color is:" + color);
		
	}

}
