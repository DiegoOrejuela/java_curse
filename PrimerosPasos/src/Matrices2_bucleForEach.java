import javax.swing.JOptionPane;

public class Matrices2_bucleForEach {

	public static void main(String[] args) {
		
	//Actividad 1
	 	/*Objetivo: realizar declaración de matrices, y utilizar bucle for y 
	 	for each para su conocimiento y diferenciación*/

		//Matriz
			String []equipos = new String [5];
			
			equipos [0]= "Juventus";
			equipos [1]= "Barcelona";
			equipos [2]= "Liverpool";
			equipos [3]= "Sevilla";
			equipos [4]= "Napoli";
			
			//Método for
				for (int i=0; i<equipos.length; i++ ){
					System.out.println("Equipo " + (i+1) + " : " + equipos [i]);
				}
			
			//Método for each
				/*Se utiliza en este caso para recorrer los datos de la matriz
				de una manera más sencilla.*/
				for (String elementos : equipos) {
					System.out.println("Equipos : " + elementos);
				}
	// Actividad 2
		/* Almacenar datos en una matriz automaticamente. */
				
			String []equipos_latin = new String [3];
					
				for (int i = 0; i<3 ; i++) {
					equipos_latin [i]= JOptionPane.showInputDialog("Introduce "
							+ "tus equipos latinos favoritos [3] ");
					}
				
				for (String E_latin : equipos_latin) {
					System.out.println("Equipo : " + E_latin);
				}
				
	//Actividad 3
		/*Almacenar datos random en una matriz*/
			
			int [] numeros = new int [150];
			
				for (int i=0 ; i<numeros.length; i++) {
					numeros [i]= (int) Math.round(Math.random()*100);
				}
				
				for (int num : numeros){
					System.out.print(num + " ");
				}
					
	}

}
