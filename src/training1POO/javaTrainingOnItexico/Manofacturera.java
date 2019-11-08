package training1POO.javaTrainingOnItexico;
import java.util.Scanner;

public class Manofacturera {
	Scanner input = new Scanner(System.in);
	private String empresa;
	private String direccion;
	private String telefono;
	//Constructor de la clase
	public Manofacturera() {
		// TODO Auto-generated constructor stub	
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void /**String para que  me regrese un String**/ imprimirNombreDeLaEmpresa (){
		System.out.println("==========================================");
		System.out.println("Empresa 	= > " + empresa );
		System.out.println("Telefono 	= > " + telefono );
		System.out.println("Direccion 	= > " + direccion );
		System.out.println("==========================================");
		//return empresa + telefono + direccion;	
	}
	public void ingresarDatosDelaManofacturera(){
		System.out.println("Ingresa el Nombre de la Manofacturera");
		String nombre1 = input.next();
		this.setEmpresa(nombre1);
		System.out.println("Ingresa el Telefono");
		String telefono1 = input.next();
		this.setTelefono(telefono1);
		System.out.println("Ingresa la Direccion de la Manofacturera");
		String direccion1 = input.next();
		this.setDireccion(direccion1);
	}

}
