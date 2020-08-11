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
				/*Esta instrucci�n no deberia cerrarse aqu�, porque el programa puede caer
				en lineas de c�digo anteriores, lo que provocaria que la conexi�n con la
				consola nunca cerrara, as� consumiendo recursos. Esto, entonces, se cierra en 
				la intrucci�n finally m�s adelante.*/
			
		} catch (InputMismatchException e) {
			System.out.println("Lo introducido no es un n�mero");
			e.getMessage();
			System.out.println("Tienes un error de tipo: " + e.getClass().getName());
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("El divisor no puede ser un 0");
			e.getMessage();
			System.out.println("Tienes un error de tipo: " + e.getClass().getName());
			e.printStackTrace();
			
		} finally {
			entrada.close();//Siempre se ejecutar� est� l�nea de c�digo. 
			/*Lo anterior garantiza que as� se caiga el programa, siempre se cierre
			 * la conexi�n y no se desperdicien recursos
			 */
		}
		
	}

}


