package training1POO;

import training1POO.Cellphone.SmartCell;

public class CellDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create objects
		//Object 1
		Cellphone cell1 = new Cellphone();
		//Object 2
		Cellphone cell2 = new Cellphone();
		/**Implementing a subclass first the cell3 creating an object of the
		 * main classs Cellphone then create a new object of the subclas "smartcell" that is located in the 
		 * same superclass **/
		Cellphone cell3 = new Cellphone();
		SmartCell smartCell = cell3.new SmartCell();
		/*Implementing a subclass created in a new class*/
		IntelligentCell cell4 = new IntelligentCell();
		
		
		
		/**Invoke methods on the object 1**/
		cell1.ingresaMarca("Nokia");
		cell1.ingresaModelo("chido");
		cell1.ingresaMemoria(4);
		cell1.ingresaSystemaOperativo("Android");
		cell1.ingresaGigas(5);
		cell1.imprimirModelo();
		System.out.println();
		/**Invoke methods on the object 2**/
		
		cell2.ingresaMarca("Samsum");
		cell2.ingresaModelo("chido");
		cell2.ingresaMemoria(8);
		cell2.ingresaSystemaOperativo("Android");
		cell2.ingresaGigas(30);
		cell2.imprimirModelo();
		
		System.out.println();
		/**Invoke methods on the object 3 this method is using a subclass that is 
		 * located on the superclass. **/
		smartCell.ingresaMarca("Samsum");
		smartCell.ingresaModelo("chido");
		smartCell.ingresaMemoria(8);
		smartCell.ingresaSystemaOperativo("Android");
		smartCell.ingresaGigas(30);
		smartCell.enterCamara("chida");
		smartCell.imprimirModelo2();
		
	/**Invoke methods on the object 4 using a subclass**/
		System.out.println();
		cell4.ingresaMarca("htc");
		cell4.ingresaModelo("chidisimo");
		cell4.ingresaMemoria(8);
		cell4.ingresaSystemaOperativo("Android");
		cell4.ingresaGigas(30);
		cell4.caracteristicas("AMD CORE DUO", "Negro");
		cell4.imprimirModelo3();
		
		
		}
}
