
public class ManipulandoCadenasII {

	public static void main(String[] args) {
		
		//Extraer cadenas

		String frase = "Hoy es un estupendo día para programar en Java";
				
		String fraseResumen = frase.substring(0, 28);
		
		System.out.println (fraseResumen + " ir a la playa... y " +
		frase.substring(29, 46));
	}

}

