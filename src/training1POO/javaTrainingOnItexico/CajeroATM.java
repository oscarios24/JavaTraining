package training1POO.javaTrainingOnItexico;

import java.util.ArrayList;
import java.util.Scanner;

public class CajeroATM {

	//Se va a mandar toda la informacion de la clase persona dentro de una lista 
	//Donde el objeto 1 esta almacenado en la posicion 1 con todos sus valores
	private  ArrayList<Person> listas = new ArrayList<Person>();
	private  ArrayList<Clientes> listasClientes = new ArrayList<Clientes>();
	
	//private  ArrayList<Location> lugar = new ArrayList<Location>();
	Scanner input = new Scanner(System.in);
	//esto es una referencia
	private Location location;
	//Hacemos una referencia de la clase manofacturera que seria como una variable.
	private Manofacturera manofacturera;
	private Banco bancos1;
	/**Todo los objetos se van a crear siempre dentro del constructor
	 * el objeto ya contendra los valores propios que lo identificaran como unicos**/
	public CajeroATM (){
		
		
		
		this.location = new Location();
		location.setLatitud(12);
		location.setLongitud(25);
		location.setSegundos(25);
		location.setMinutos(89);
		
		this.manofacturera = new Manofacturera();
		manofacturera.setEmpresa("	La Cajeros ATM Rino");
		manofacturera.setDireccion("	La Calma 2351 GDL MX");
		manofacturera.setTelefono("	376 76 5 26 82");
		
		Person p1 = new Person();
		p1.setNombre("oscar");
		p1.setEdad(42);
		p1.setNumeroTarjeta(12346);
		p1.setSaldo(1200);
		p1.setSexo("Masculino");
		listas.add(p1);
		Person p2 = new Person();
		p2.setNombre("gaby");
		p2.setEdad(27);
		p2.setNumeroTarjeta(1234);
		p2.setSaldo(5000);
		p2.setSexo("Femenino");
		listas.add(p2);	
	}
	public void darDeAltaClientes(String opcionClientes){
		Clientes clientes1 = new Clientes();
		if (opcionClientes.contains("1") ){
			System.out.println("Cuantos Clientes quieder dar de alta? ");
			int numeroDeClientes = input.nextInt();
				for (int i=0; i< numeroDeClientes ; i++ ){
					System.out.println("Ingresa el nombre ID del cliente: ");
					int idDelCliente = input.nextInt();
					clientes1.setIdDelCliente(idDelCliente);
					System.out.println("Ingresa el nombre del Cliente : ");
					String nombre = input.next();
					clientes1.setNombre(nombre);
					System.out.println("Ingresa la edad del Cliente : ");
					int edadDelEmpleado = input.nextInt();
					clientes1.setEdad(edadDelEmpleado);
					listasClientes.add(clientes1);
					
				}
		}
		if (opcionClientes.contains("2")){
			//
			if (listasClientes.size() != 0){
				//Clientes c = listasClientes.get(i);
				for (int i=0; i < listasClientes.size() ; i++ ){
					Clientes c = listasClientes.get(i);
					System.out.println("ID del clliente>" + c.getIdDelCliente() );
					System.out.println("Nombre del cliente>" + c.getNombre() );
					System.out.println("Edad del cliente>" + c.getIdDelCliente() );
				}	
			}
			System.out.println("No hay clientes por mostrar ");
		}
		
	}
	
	public void configurarBancos (){
		location.mostrarLocation();
		manofacturera.imprimirNombreDeLaEmpresa();
		Banco banorte = new Banco();
		//banorte.
		
	}
	 
	
	
	public Location getlocation() {
		return location;
	}
	public void setlocation(Location location) {
		this.location = location;
			
	}
	//Crear el set and get para la variable manofacturera esto ayuda para que sea visible en el clase main.
	public Manofacturera getmanofacturera(){
		return manofacturera;
	}
	public void setmanofacturera(){
		this.manofacturera = manofacturera;
	}
	public Banco getBancos1() {
		return bancos1;
	}
	public void setBancos1(Banco bancos1) {
		this.bancos1 = bancos1;
	}
	
	public void consultarSaldo(){
		//boolean tarjetaEncontrada = false;
		for(int i=0; i < listas.size(); i++ ){
            Person p = listas.get(i);
           // if (p.getNumeroTarjeta() == nombre){
            	System.out.println("Tu saldo Disponible es de => " + p.getSaldo() );
            	System.out.println();
            	//tarjetaEncontrada = true;
            	break;
            //}
        }
		//if (!tarjetaEncontrada){
			// 	System.out.println("Tarjeta no encontrado" + tarjeta);
            
		//}
	
	}
	public void sacarDinero(double monto){		
		for (int i=0; i < listas.size(); i++ ){
			Person p = listas.get(i);
			double saldoActual = p.getSaldo();
			if (p.getSaldo()> monto){
				double restarDinero = saldoActual - monto;
				System.out.println(p.getNombre() +  " Su saldo actual es de: " + restarDinero);
				System.out.println();
				break;
			}else {
				System.out.println("Lo siento <" + p.getNombre()+ "> ya no tienes saldo para retirar esa cantidad => " + monto);
				System.out.println();
				System.out.println("Su saldo actual es de : " + saldoActual);
				System.out.println();
			}
		} 
	}
	
	public boolean autenticarUsuario(String usuario){
		boolean usuarioEncontrado = false;
		for(int i=0; i < listas.size(); i++ ){
            Person p = listas.get(i);
            
            if (p.getNombre().contains(usuario)){
            	System.out.println("Bienvenido >> " + usuario );
            	usuarioEncontrado = true;
            	break;
            }
        }
		if (!usuarioEncontrado){
			 	System.out.println("Usuario no fue encontrado  >> " + usuario);
        	}
		return usuarioEncontrado;
	}
	
	public String imprimirMenu(){
		System.out.println("Que Deseas hacer?");
		System.out.println("1 Consultar saldo");
		System.out.println("2 Sacar Dinero");
		System.out.println("3 Imprimir Location");
		System.out.println("4 Imprimir Manofacturera del Cajero");
		System.out.println("5 Configurar Banco");
		System.out.println("6 Cajeros ATM");
		System.out.println("7 Menu de Clientes");
		System.out.println("8 Menu de Empleados");
		System.out.println("9 Salir");
String opcion = input.next();
		return opcion;
	}
	
	


}
