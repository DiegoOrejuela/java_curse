
import java.util.*;
public class If {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Introduce tu edad, por favor");
		
		int edad = entrada.nextInt();
		
	//Condicional if
		if (edad >= 18) {
			
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad");
		}
		
		//otros usos
		
		if (edad <= 18) {
			
			System.out.println("Eres un adolecente");
		}

		else if (edad < 40) {
			System.out.println("Eres joven");
		}
		
		else {
			System.out.println("cuidate");
		}
			
	}
}
