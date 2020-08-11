package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class _148_149_Captura_de_varias_excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//No es recomendable atrapar errores de excepciones que deriven de RunTimeException
		
		Scanner entrada = new Scanner (System.in);
		
		try {
			System.out.println("Introduce el dividendo");
			int dividendo = entrada.nextInt();
			
			System.out.println("Introduce el divisor");
			int divisor = entrada.nextInt();
			
			System.out.println("El resultado es : " + dividendo/divisor );
			
			//entrada.close();
				/*Esta instrucción no deberia cerrarse aquí, porque el programa puede caer
				en lineas de código anteriores, lo que provocaria que la conexión con la
				consola nunca cerrara, así consumiendo recursos. Esto, entonces, se cierra en 
				la intrucción finally más adelante.*/
			
		} catch (InputMismatchException e) {
			System.out.println("Lo introducido no es un número");
			e.getMessage();
			System.out.println("Tienes un error de tipo: " + e.getClass().getName());
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("El divisor no puede ser un 0");
			e.getMessage();
			System.out.println("Tienes un error de tipo: " + e.getClass().getName());
			e.printStackTrace();
			
		} finally {
			entrada.close();//Siempre se ejecutará está línea de código. 
			/*Lo anterior garantiza que así se caiga el programa, siempre se cierre
			 * la conexión y no se desperdicien recursos
			 */
		}
		
	}

}


