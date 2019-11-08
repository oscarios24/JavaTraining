package training1POO.javaTrainingOnItexico;

import java.util.ArrayList;
import java.util.Scanner;

public class SucursalAdministrativa {
	private  ArrayList<Clientes> listasClientes = new ArrayList<Clientes>();
	private  ArrayList<Cajeros> listasCajeros= new ArrayList<Cajeros>();
	private  ArrayList<Intendentes> listasIntendentes= new ArrayList<Intendentes>();
	private  ArrayList<Gerentes> listasGerentes= new ArrayList<Gerentes>();
	//Aqui vamos a aplicar el polimorfismos para no utilizar tantos array list como se ve antes
	//La siguiente Array list se va a comportar como queramos es decir como empleado
	//Gerentes, etc
	private ArrayList<Person> listasGenericaDePersonas = new ArrayList<Person>();
	Person gerentePolimorfismo = new Gerentes();
	//Person clientesPolimorfismo = new Clientes();
	Person cajerosPolimorfismo = new Cajeros();
	Person intendentesPolimorfismo = new Intendentes();
	
	Scanner input = new Scanner(System.in);
	//Este sera mi constructor. 
	public SucursalAdministrativa() {
		// TODO Auto-generated constructor stub
	}//fin del constructor
	
	public void dardeAltaClientesConPolimorfismo(String opcionClientes){
		if (opcionClientes.contains("1") ){
			//Mandamos llamar el metodo para agregar infromacion de clientes
			Clientes c = new Clientes();
			c.pedirdatos();	//Agregamos toda la informacion que se capturo en el Array list listasClientes
			System.out.println("Ingresa el perfil del Cliente");
			String perfilCliente = input.next();
			c.setPerfilCliente(perfilCliente);
			//Lo convertimos a persona todo lo que estamos haciendo
			Person p = (Person)c;
			listasGenericaDePersonas.add(p);
			//Con este avanzamos a la siguiente posicion
			
			
					
		}
		if (opcionClientes.contains("2")){
			//
			if (listasGenericaDePersonas.size() != 0){
				//Clientes c = listasClientes.get(i);
				for (int i=0; i < listasGenericaDePersonas.size() ; i++ ){
					Person c = listasGenericaDePersonas.get(i);
					System.out.println("ID del clliente>" + c.getId() );
					System.out.println("Nombre del cliente>" + c.getNombre() );
					System.out.println("Edad del cliente>" + c.getEdad() );
					System.out.println("+++++++++++++++++");
					System.out.println();
				}	
			}else {
				System.out.println("No hay clientes por mostrar ");
			}
			
		}
		
	}
	
	
	public void darDeAltaClientes(String opcionClientes){
		Clientes clientes1 = new Clientes();
		if (opcionClientes.contains("1") ){
					//Mandamos llamar el metodo para agregar infromacion de clientes
					clientes1.pedirdatos();					//Agregamos toda la informacion que se capturo en el Array list listasClientes
					listasClientes.add(clientes1);
					//Con este avanzamos a la siguiente posicion
					clientes1 = new Clientes();		
		}
		if (opcionClientes.contains("2")){
			//
			if (listasClientes.size() != 0){
				//Clientes c = listasClientes.get(i);
				for (int i=0; i < listasClientes.size() ; i++ ){
					Clientes c = listasClientes.get(i);
					System.out.println("ID del clliente>" + c.getId() );
					System.out.println("Nombre del cliente>" + c.getNombre() );
					System.out.println("Edad del cliente>" + c.getEdad() );
					System.out.println("+++++++++++++++++");
					System.out.println();
				}	
			}else {
				System.out.println("No hay clientes por mostrar ");
			}
			
		}
		
	}
	
	public void darDeAltaCajeros(String opcionEmpleados){
		Cajeros cajeros1 = new Cajeros();
		if (opcionEmpleados.contains("1") ){
					cajeros1.pedirdatos();
					//
					Person p = (Person)cajeros1;
					//listasCajeros.add(cajeros1);
					listasGenericaDePersonas.add(cajeros1);
					//cajeros1 = new Cajeros();	
		}
		if (opcionEmpleados.contains("2")){
			//
			
			if (listasGenericaDePersonas.size() != 0){
				//Clientes c = listasClientes.get(i);
				for (int i=0; i < listasGenericaDePersonas.size() ; i++ ){
					Person infoLista = listasGenericaDePersonas.get(i);
					//Con el siguiente if me aseguro que imprimire los datos que sean del cajero
					//Ya que mi lista contendra datos de muchas claces.
					if (infoLista instanceof Cajeros){
						//Cajeros c = listasCajeros.get(i);
						System.out.println("ID del Cajero>" + infoLista.getId() );
						System.out.println("Nombre del Cajero>" + infoLista.getNombre() );
						System.out.println("Edad del Cajero>" + infoLista.getId() );
						System.out.println("+++++++++++++++++");
						System.out.println();
						
					}
					
				}	
			}else {
				System.out.println("No hay Cajeros por mostrar ");
			}
			
		}
		
	}
	
	public void darDeAltaIntendentes(String opcionEmpleados){
		Intendentes intendentes1 = new Intendentes();
		if (opcionEmpleados.contains("3") ){
			intendentes1.pedirdatos();
			//listasGenericaDePersonas.add(intendentes1);
			Person p = (Person)intendentes1;
			listasGenericaDePersonas.add(p);
			//intendentes1 = new Intendentes();		
		}
		if (opcionEmpleados.contains("4")){
			//
			if (listasGenericaDePersonas.size() != 0){
				//Clientes c = listasClientes.get(i);
				for (int i=0; i < listasGenericaDePersonas.size() ; i++ ){
					Person infoLista = listasGenericaDePersonas.get(i);
					//Intendentes c = listasIntendentes.get(i);
					if (infoLista instanceof Intendentes){
						//Cajeros c = listasCajeros.get(i);
						System.out.println("ID del Cajero>" + infoLista.getId() );
						System.out.println("Nombre del Cajero>" + infoLista.getNombre() );
						System.out.println("Edad del Cajero>" + infoLista.getId() );
						System.out.println("+++++++++++++++++");
						System.out.println();
						
					}
				}	
			}else {
				System.out.println("No hay Intendentes por mostrar ");
			}
			
		}
		
	}
	
	public void darDeAltaGerentes(String opcionEmpleados){
		Gerentes gerentes1 = new Gerentes();
		if (opcionEmpleados.contains("5") ){	
			gerentes1.pedirdatos();
			listasGerentes.add(gerentes1);
			//Con este avanzamos a la siguiente posicion
			gerentes1 = new Gerentes();		
		}
		if (opcionEmpleados.contains("6")){
			//
			if (listasGerentes.size() != 0){
				//Clientes c = listasClientes.get(i);
				for (int i=0; i < listasGerentes.size() ; i++ ){
					Gerentes c = listasGerentes.get(i);
					System.out.println("ID del Gerente>" + c.getId() );
					System.out.println("Nombre del Gerente>" + c.getNombre() );
					System.out.println("Edad del Gerente>" + c.getEdad() );
					System.out.println("+++++++++++++++++");
					System.out.println();
				}	
			}else {
				System.out.println("No hay Gerentes por mostrar ");
			}
			
		}
		
	}


}//fin de la clase
