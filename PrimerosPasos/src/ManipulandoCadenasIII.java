
public class ManipulandoCadenasIII {

	public static void main(String[] args) {
		
		//Comparación perfecta de caracteres
		String nombre1, nombre2;
		
		nombre1 = "Diego";
		
		nombre2 = "Diego";
		
		System.out.println(nombre1.equals(nombre2));
		
		
		//comparación ignorando mayus-minus de caracteres
	
		nombre1 = "DAVID";
		
		nombre2 = "david";
		
		System.out.println(nombre1.equalsIgnoreCase(nombre2));
				
	}

}
