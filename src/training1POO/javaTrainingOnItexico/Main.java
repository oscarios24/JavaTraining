package training1POO.javaTrainingOnItexico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.println("Cual es tu nombre ? ");
		String nombreDelCliente = input.next();
		String opcion;
		CajeroATM atm1 = new CajeroATM();
		
		SucursalAdministrativa sucursal1 = new SucursalAdministrativa ();
		Banco banco1 = new Banco();
		
		//atm1.autenticarUsuario(nombreDelCliente);
		/** En este if vamos a autenticar primero que el usuario sea valido para poder ejecutar
		 * las accciones del cajero, entrara al if siempre y cuando sea un usuario valido 
		 * de lo contrario imprimira usuario no existente**/
		if ( atm1.autenticarUsuario(nombreDelCliente)){
			/**Con el siguiente for vamos a permitir que usuario sea capas de seguir elijiendo
			 * las opciones del cajero va a tener un limite de 30 pero ese valor puede ser n **/
			for (int i=0; i< 30; i++){			
				opcion = atm1.imprimirMenu();			
				if (opcion.contains("1")|| opcion.contains("2")|| opcion.contains("3") || opcion.contains("4")|| opcion.contains("5")
						|| opcion.contains("6") || opcion.contains("7")|| opcion.contains("8")|| opcion.contains("9")){
					if(opcion.contains("1")){
						atm1.consultarSaldo();
						//opcion = atm1.imprimirMenu();
					}
					if(opcion.contains("2")){
						System.out.println("Cuanto Dinero quieres sacar? ");
						Double dineroDeseado = input.nextDouble();
						atm1.sacarDinero(dineroDeseado);
						//opcion = atm1.imprimirMenu();
					}
					if(opcion.contains("3")){
						System.out.println("Locacion del cajero ATM" + atm1.getlocation().mostrarLocation());;
				
					}
					if(opcion.contains("4")){
						//System.out.println("La empresa es: " + atm1.getmanofacturera().imprimirNombreDeLaEmpresa());
						atm1.getmanofacturera().imprimirNombreDeLaEmpresa();
					}
					if(opcion.contains("5")){
						//System.out.println("La empresa es: " + atm1.getmanofacturera().imprimirNombreDeLaEmpresa());
						//atm1.setmanofacturera();
						System.out.println("Mandar llamar la funcion para configurar Banco");
						
							
							
							
						
					}
					if(opcion.contains("6")){
						//System.out.println("La empresa es: " + atm1.getmanofacturera().imprimirNombreDeLaEmpresa());
						//atm1.setmanofacturera();
						System.out.println("Mandar llamar la funcion Bancos");
						banco1.imprimirBancos();
					}
					if(opcion.contains("7")){
						//System.out.println("La empresa es: " + atm1.getmanofacturera().imprimirNombreDeLaEmpresa());
						//atm1.setmanofacturera();
						System.out.println("Menu y subMenu de Clientes");
						System.out.println("Que Deseas hacer?");
						System.out.println("1 Dar de Alta Clientes");
						System.out.println("2 Consultar Clientes");
						System.out.println("3 Regresar al Menu principal");
						String opcionClientes = input.next();
						//sucursal1.darDeAltaClientes(opcionClientes);
						sucursal1.dardeAltaClientesConPolimorfismo(opcionClientes);
						
					}
					if(opcion.contains("8")){
						//System.out.println("La empresa es: " + atm1.getmanofacturera().imprimirNombreDeLaEmpresa());
						//atm1.setmanofacturera();
						System.out.println("Menu y subMenu de Empleados");
						System.out.println("Que Deseas hacer?");
						System.out.println("1 Dar de Alta Cajero");
						System.out.println("2 Mostrar Cajeros");
						System.out.println("3 Dar de Alta Intendente");
						System.out.println("4 Mostrar Intendentes");
						System.out.println("5 Dar de Alta Gerente");
						System.out.println("6 Mostrar Gerentes");
						System.out.println("7 Regresar al Menu principal");
						String opcionEmpleados = input.next();
						if (opcionEmpleados.contains("1")||opcionEmpleados.contains("2")
								||opcionEmpleados.contains("3")||opcionEmpleados.contains("4")
								||opcionEmpleados.contains("5")||opcionEmpleados.contains("6")
								||opcionEmpleados.contains("7")){
							if (opcionEmpleados.contains("1")){
								//Dar de Alta Cajeros
								sucursal1.darDeAltaCajeros(opcionEmpleados);
							}
							if (opcionEmpleados.contains("2")){
								//Mandar a imprimir Cajeros
								sucursal1.darDeAltaCajeros(opcionEmpleados);
							}
							if (opcionEmpleados.contains("3")){
								//Dar de alta Intendentes
								sucursal1.darDeAltaIntendentes(opcionEmpleados);
							}
							if (opcionEmpleados.contains("4")){
								//Mostrar intendentes 
								sucursal1.darDeAltaIntendentes(opcionEmpleados);
							}
							if (opcionEmpleados.contains("5")){
								//Dar de alta Gerentes
								sucursal1.darDeAltaGerentes(opcionEmpleados);
							}
							if (opcionEmpleados.contains("6")){
								//Mostrar Gerentes
								sucursal1.darDeAltaGerentes(opcionEmpleados);
							}
							
						}else {
							System.out.println("Opcion incorrecta " + opcionEmpleados);
						}
						
						
					}
					
					if(opcion.contains("9")){
						System.out.println("Gracias por haber utilizado los servicios de nuestro Cajero ATM");
					break;	
					}
				}else {
					System.out.println("La opcion ingresada por usted => " + opcion + " <= fue INCORRECTA > " );
				}
				
				
				
			}
		}
			
		
		
		
		

	}

}
