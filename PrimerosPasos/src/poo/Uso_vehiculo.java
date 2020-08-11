package poo;

import javax.swing.JOptionPane;

public class Uso_vehiculo {

	public static void main(String[] args) {
		
		Coche renault = new Coche();
		
		
		
	//Forma tradicional de llamar un método constructor
		/*renault.ruedas = 3;
		System.out.println("El coche tiene " + renault.ruedas + " ruedas");*/
		
	//LLamar a un método constructor con métoto getters/Setters
		System.out.println("El coche tiene "+ renault.ruedas()+ " ruedas");
		
		/*renault.color();*/
		
		renault.color("amarillo");
		
		System.out.println("El color del coche es " + renault.color_muestra());
		
		System.out.println(renault.dime_datos_generales());
		
		renault.configura_asientos(JOptionPane.showInputDialog("¿tiene asientos de cuero?"));
		
		System.out.println(renault.analisis_asiento());
		
		System.out.println("El peso del carro es " + renault.peso_final()+ " kg");
		
		System.out.println();
		
		//Herencia
			
			Furgoneta furgoneta1 = new Furgoneta (7, 550);
			
			furgoneta1.color("rojo.");
			
			System.out.println(furgoneta1.dime_datos_generales() + "\n" 
			+ furgoneta1.dimeDatosFurgoneta());
	}
	

}
