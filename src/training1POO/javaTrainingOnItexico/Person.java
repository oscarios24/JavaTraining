package training1POO.javaTrainingOnItexico;

import java.util.Scanner;

public class Person {
	private int edad;
	private String nombre;
	private String sexo;
	private int numeroTarjeta;
	private double saldo;
	private int id;
	Scanner input = new Scanner(System.in);
	public Person (){
		//Constructor
		
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void pedirdatos (){
		System.out.println("Ingresa el ID: ");
		int idDelCliente = input.nextInt();
		this.setId(idDelCliente);
		System.out.println("Ingresa el nombre: ");
		String nombre = input.next();
		this.setNombre(nombre);
		System.out.println("Ingresa la edad: ");
		int edadDelEmpleado = input.nextInt();
		this.setEdad(edadDelEmpleado);
		//String id = Integer.toString(idDelCliente);
	}
	
	
}// fin de la clase
