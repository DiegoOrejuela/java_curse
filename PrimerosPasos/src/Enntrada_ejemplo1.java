import java.util.Scanner;

public class Enntrada_ejemplo1 {

	public static void main(String[] args) {
		
	//Con m�todo Scanner
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Escriba su nombre, por favor");
		
		String nombre_de_usuario = entrada.nextLine();
		
		System.out.println("�Cu�l es su edad?");
		
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombre_de_usuario + ". Tu edad dentro "
		+ "de 4 a�os ser� de " + (edad+4) + " a�os");
	
	}

}
