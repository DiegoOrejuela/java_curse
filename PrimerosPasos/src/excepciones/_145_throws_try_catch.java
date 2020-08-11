package excepciones;
import java.io.IOError;
import java.io.IOException;
import java.util.*;
public class _145_throws_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("¿Qué deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner entrada=new Scanner (System.in);
		
		int decision=entrada.nextInt();
		
		if (decision==1){
			
		try {
			pedirDatos();
		} catch (Exception e) {
			System.out.println(" Excepción: " + e.getMessage());
			System.out.println("¿Qué demonios has introducido?");
			
			
		}	
			
			
		}else{
			
			System.out.println("Adios");
			
			System.exit(0);
		}
		
		entrada.close();
		
	}
	
		static void pedirDatos() throws IOException {			
		//Utilizamos la declaración throws y la clase IOExeption para obligar al método a
			//implemnetar el try-catch. 
			
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		
		System.out.println("Introduce edad, por favor");
		
		int edad=entrada.nextInt();	
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad+1) + " años");
		
		entrada.close();
		
		System.out.println("Hemos terminado");
		
	}
		
		
}