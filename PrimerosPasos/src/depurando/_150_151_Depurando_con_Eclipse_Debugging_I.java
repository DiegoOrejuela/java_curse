package depurando;

import javax.swing.JOptionPane;

public class _150_151_Depurando_con_Eclipse_Debugging_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//Objetivo
		/*Depurar el programa*/

		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad"
				+ "de elementos que deseas para tu array"));
		
		int [] array_elem = new int [elementos];
		
		
		for (int i = 0; i < array_elem.length; i++) {
			/*1. Agregamos una pausa al código donde veamos que es suceptible el error. Esto 
			 * se hace dando doble clik izquierdo al lado izquierdo de la línea de código en cuestión 
			 */
			array_elem [i] = (int)Math.random()*100;
			
			//2. Damos click en el Debug, al lado del play
		}
		
		for (int elem : array_elem) {
			
			System.out.println(elem);
		}
		
		
	}

}
