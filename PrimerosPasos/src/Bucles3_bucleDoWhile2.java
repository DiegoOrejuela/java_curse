import javax.swing.*;
public class Bucles3_bucleDoWhile2 {

	public static void main(String[] args) {
	
	/*Objetivo
		Hacer un programa que me de mi peso ideal basandome en mi altura
	 */
		
		String genero = "";
		
		do {
			
			genero = JOptionPane.showInputDialog("Cuál es tú género (H/M)");
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M"));
		
		int pesoIdeal = 0;
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu"
				+ " altura en cm"));
		
		if (genero.equalsIgnoreCase("H")) {
			
			pesoIdeal = altura-110;  
		}
		
		else if (genero.equalsIgnoreCase("M")) {
			pesoIdeal = altura-120;
		}
		
		System.out.println("Tu peso ideal es de " + pesoIdeal + "kg.");
	}

}
