package training1POO.javaTrainingOnItexico;

import java.util.Scanner;


public class Location {
	Scanner input = new Scanner(System.in);
	private int latitud; 
	private int longitud;
	private int minutos;
	private int segundos; 
	public Location() {
		// TODO Auto-generated constructor stub
		
	}
	public int getLatitud() {
		return latitud;
	}
	public void setLatitud(int latitud) {
		this.latitud = latitud;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	public String mostrarLocation (){
		getLatitud();
		getLongitud();
		getSegundos();
		getMinutos();
		String latitud = Integer.toString(getLatitud());
		String longitud = Integer.toString(getLongitud());
		String segundos = Integer.toString(getSegundos());
		String minutos = Integer.toString(getMinutos());
		return latitud + longitud + segundos + minutos;
	}
	
	public void agregarDatosAlaLocation (){
		System.out.println("Ingresa la Latitud");
		int latitud1 = input.nextInt();
		this.setLatitud(latitud1);
		System.out.println("Ingresa la Logitud");
		int longitud1 = input.nextInt();
		this.setLongitud(longitud1);
		System.out.println("Ingresa los Segundos");
		int segundos1 = input.nextInt();
		this.setSegundos(segundos1);
		System.out.println("Ingresa las Minutos");
		int minutos1 = input.nextInt();
		this.setMinutos(minutos1);
		
	}
	
	
}

