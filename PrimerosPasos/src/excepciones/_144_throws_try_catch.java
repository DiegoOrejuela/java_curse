package excepciones;
import java.util.*;
public class _144_throws_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("¿Qué deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner entrada=new Scanner (System.in);
		
		int decision=entrada.nextInt();
		
		if (decision==1){
			
			pedirDatos();
			
		}else{
			
			System.out.println("Adios");
			
			System.exit(0);
		}
		
		entrada.close();
		
	}
	
		static void pedirDatos()  {			
		
			/*Esta forma de hacer los catch no es muy recomendada, porque es mal visto
			que un método lance y capture una excepción a la misma vez. Lo que se debe hacer
			es que desde el exterior se evalue si manda una excepción o no.*/
			
			
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		try {
			System.out.println("Introduce edad, por favor");
			int edad=entrada.nextInt();	
			System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad+1) + " años");
			
		} catch (Exception e) {
			
			System.out.println("Qué demonios has introducido?");
		}
	
		
		entrada.close();
		
		System.out.println("Hemos terminado");
		
	}
		
		
}