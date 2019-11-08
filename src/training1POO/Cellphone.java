package training1POO;

public class Cellphone {
	//Constructor of the class
	public Cellphone() {
		// TODO Auto-generated constructor stub
		
	}
	//Variables
	String marca, modelo, systemaOperativo;
	//String modelo;
	//String systemaOperativo;
	int gigas, memoria;
	//int memoria;
	// Methods
	
	
	void ingresaMarca(String newValue){
		marca=newValue;
	}
	
	void ingresaModelo(String newValue){
		modelo=newValue;
	}
	
	void ingresaSystemaOperativo (String newValue){
		systemaOperativo = newValue;
	}
	
	void ingresaGigas (int newValue){
		gigas = newValue;
	}
	void ingresaMemoria(int newValue){
		memoria = newValue;
	}
	
	void imprimirModelo (){
		System.out.println("Your cell is:" + marca);
		System.out.println("Your marca is:" + modelo);
		System.out.print("Your model is " + systemaOperativo);
		System.out.println("Gigas:" + gigas);
		System.out.println("Your Memory is:" + memoria);
	}
	void llamar(){
		
	}
	void colgar (){
		
	}
	//Creating a subclass
	class SmartCell extends Cellphone{
		//Entering new variables
		String camara;
		//Entering new methods
		void enterCamara(String newValue){
			camara = newValue;
			
		}
		void imprimirModelo2 (){
			
			System.out.println("Your cell is:" + marca);
			System.out.println("Your marca is:" + modelo);
			System.out.print("Your model is " + systemaOperativo);
			System.out.println("Gigas:" + gigas);
			System.out.println("Your Memory is:" + memoria);
			System.out.println("Your cell is:" + camara);
			
		}
	}
}
