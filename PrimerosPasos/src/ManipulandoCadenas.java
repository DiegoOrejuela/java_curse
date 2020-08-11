
public class ManipulandoCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "DiegoRodríguez";
		
		System.out.println("Mi nombre es " + nombre); 
		
		System.out.println ("Mi nombre tiene " + nombre.length()); //Número de carcateres
		
		System.out.println ("La primera letra de " + nombre + " es " + nombre.charAt(0)); //Extraer carcateres por posición
		
		int ultimaLetra = nombre.length();
		
		System.out.println ("La última letra de mi nombre es la " + nombre.charAt(ultimaLetra - 1));
		
	}

}
