
public class ManipulandoCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "DiegoRodr�guez";
		
		System.out.println("Mi nombre es " + nombre); 
		
		System.out.println ("Mi nombre tiene " + nombre.length()); //N�mero de carcateres
		
		System.out.println ("La primera letra de " + nombre + " es " + nombre.charAt(0)); //Extraer carcateres por posici�n
		
		int ultimaLetra = nombre.length();
		
		System.out.println ("La �ltima letra de mi nombre es la " + nombre.charAt(ultimaLetra - 1));
		
	}

}
