import java.util.Scanner;

public class Enntrada_ejemplo1 {

	public static void main(String[] args) {
		
	//Con método Scanner
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Escriba su nombre, por favor");
		
		String nombre_de_usuario = entrada.nextLine();
		
		System.out.println("¿Cuál es su edad?");
		
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombre_de_usuario + ". Tu edad dentro "
		+ "de 4 años será de " + (edad+4) + " años");
	
	}

}
