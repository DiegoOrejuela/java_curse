
import java.util.*;
public class Bucles_2_bucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio = (int) (Math.random()*100);
		
		Scanner entrada = new Scanner (System.in);
		
		int numero=0;
		
		int intentos = 0;
		
		while (aleatorio != numero) {
			
			intentos++;
			
			System.out.println("Introduce un n�mero, por favor");
			
			numero = entrada.nextInt();
			
			if (aleatorio < numero) {
				
				System.out.println("M�s bajo");
			}
			else if (aleatorio > numero) {
				
				System.out.println("M�s alto");
			}
			
		}
		
		entrada.close();
		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos.");
		
	}

}