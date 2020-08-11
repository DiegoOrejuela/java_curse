
public class Matrices_bidimensionales {

	public static void main(String[] args) {
		
	//Actividad 1
		/*Objetivo: Declarar manualmente una matriz anidada de dos
		  dimensiones*/
		
		//Método 1

			int [][] numeros = new int [2][4];
			
			numeros [0][0] = 15;
			numeros [0][1] = 18;
			numeros [0][2] = 35;
			numeros [0][3] = 19;
			
			numeros [1][0] = 84;
			numeros [1][1] = 135;
			numeros [1][2] = 16;
			numeros [1][3] = 10;
		
				System.out.println(numeros [1][2]);
		
		//Método 2
				
				int [][]numeros2 = {
						{5, 23, 56, 56},
						{45, 33, 67, 35},
						{34, 34, 34, 34}
				};
					System.out.println(numeros2 [2][3]);
					
		
	//Actividad 2
		/*Recorrer e imprimir los valores de la matriz, ha través de los 
		  bucles for y for each anidados.*/
	
		//Método 1. Bucles for
		for (int i = 0; i < 2 ; i++) {
			System.out.println();
			
			for (int j = 0; j < 4; j++) {
				System.out.print(numeros [i][j] + " ");
			}
		}
	
		System.out.println();
		
		//Método 2. Bucles for each
		
		for (int [] b : numeros2){
			System.out.println();
			
			for (int z : b) {
				
				System.out.print(z + " ");
			}
		}
		
		System.out.println();
		
	//Actividad 3
		/*Objetivo: calcular el aumento de interés en un monto de dinero 
		 durante 4 años*/
		
		/*Paso 1: definir variables y matriz*/
			double acomulado;
			double interes = 0.10;
			
			double [][]cuentas = new double [6][5];
			double [] inte = new double [6];
		
		/*Paso 2: Rellenar la matriz de forma que el programa nos haga las 
		 operaciones automáticamente */
		
			for (int k = 0; k<6 ; k++) {
				cuentas [k][0]= 10000;
				acomulado = 10000;
				inte [0]= interes;
				
				for(int m = 1; m<5; m++) {
					
				acomulado = acomulado + (acomulado*interes);
				
				cuentas [k][m]= acomulado;
				}
			
			interes = interes + 0.01;
			inte [k]= interes;
			}
			
			
			
			
		/*Paso 3: imprimir en consola*/
			
			for (int s=1; s<6; s++) {
				System.out.println(interes);
			};
		
			for (double [] d :cuentas) {
				System.out.println();
				for (double f : d ) {
					System.out.printf("%1.2f", f );
					System.out.print(" ");
				}
				
			}
				
	}
			
	

}
