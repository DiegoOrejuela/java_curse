import javax.swing.JOptionPane;

public class Bucles4_bucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*
	 Ejercicio 1
	 	Objetivo: Sintaxis b�sica
	 
	
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Diego");
		}
	*/
	
		
	/*
	 Ejercicio 2
	 	Objetivo: Evaluar si el correo electr�nico es correcto. 
	  	Se evlaua: arroba ( no m�s de 1) y punto. 
	 
	
		int arroba = 0;
		
		boolean punto = false;
		
		String mail = JOptionPane.showInputDialog("Introduce tu mail");
		
		for (int i = 0; i < mail.length (); i++) {
			
			if (mail.charAt(i)== '@') {
				
				arroba++;
			}
			
			if (mail.charAt(i)=='.')
				
				punto=true;
		}
			if (arroba== 1 && punto==true) {
				System.out.println("Es correcto");
				
				}
				else {
				
				System.out.println("No es correcto");
			}
		*/
		
		
		/*
	Ejercicio 3
		Objetivo: clacular el valor factorial de un n�mero
		 */
		
	int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el "
			+ "n�mero que quieres factorizar"));
	
	Long resultado = 1L;
	
	for (int i= numero; i>0;i-- ) {
	
	 resultado = resultado*i;
		}
	System.out.println ("El factorial de " + numero + " es " + resultado);
	}
	
}


