package training1POO.javaTrainingOnItexico;
import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
	private  ArrayList<CajeroATM> cajeros = new ArrayList<CajeroATM>();
	private Location location;
	Scanner input = new Scanner(System.in);
	public Banco() {
		// TODO Auto-generated constructor stub
		CajeroATM cajero1 = new CajeroATM();//aqui se manda llamar el constructor de ATM
		//cajero1.setlocation(location);;
		//cajero1.setmanofacturera();
		cajeros.add(cajero1);

		
	}
	
	public void imprimirBancos(){
		for (int i=0; i < cajeros.size() ; i++ ){
			CajeroATM c = cajeros.get(i);
			//System.out.println("Informacion de Bancos>" + c.getlocation(i) );
			System.out.println("Nombre del cliente>" + c.getlocation() );
			System.out.println("Edad del cliente>" + c.getmanofacturera() );
		}
	}
	
	
	
}
