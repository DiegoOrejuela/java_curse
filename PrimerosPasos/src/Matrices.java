
public class Matrices {

	public static void main(String[] args) {
		
		/*
	Actividad 1
		Objetivo: declara una matriz
		
			M�todo 1. 
		 */
				int []mi_matriz = new int  [5];
				
					mi_matriz [0] = 5;
					mi_matriz [1]= 40;
					mi_matriz [2]= 20;
					mi_matriz [3]= 10;
					mi_matriz [4]= 5;
					mi_matriz [1] = 0;
						System.out.println("El �ndice 1 tiene el valor " + 
						mi_matriz [1]);
						
						
		//M�todo 2. 
						
				int [] mi_matriz2 = {20, 84, 28, 39, 19, 39};
				
					for (int i = 0; i < mi_matriz2.length; i++) {
						
						System.out.println("La posici�n del valor "
						+ mi_matriz2 [i] + " es " + i);
					}
	}

}
