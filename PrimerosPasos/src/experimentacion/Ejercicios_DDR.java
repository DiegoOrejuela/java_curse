package experimentacion;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Ejercicios_DDR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	/*6) Lee un n�mero por teclado e indica si es divisible entre 2 (resto = 0).
	Si no lo es, tambi�n debemos indicarlo.*/
		
		Scanner num = new Scanner (System.in);
	
		System.out.println("Introduce un n�mero");
		
		int numero = num.nextInt();
		
		if (numero%2==0){
			System.out.println("Es divisible entre 2");
		}else {
			System.out.println("No es divisible entre dos");
		}
		
		System.out.println();
		
		
		
		
/*5) Haz una aplicaci�n que calcule el �rea de un c�rculo(pi*R2). El radio 
		 se pedir� por teclado (recuerda pasar de String a double con Double.parseDouble).
		  Usa la constante PI y el m�todo pow de Math.
		 */
		
		System.out.println("Actividad 5.");
		
		Scanner pedidaBase = new Scanner (System.in);
		
		System.out.println("Introduce el radio del c�rculo para calcular su"
				+ " �rea");
		double base = pedidaBase.nextDouble();
		
		double AreaCirculo = Math.pow(base, 2)*Math.PI;
		
		System.out.print("El �rea del c�rculo es ");
		System.out.printf("%1.2f", AreaCirculo);
		System.out.println();
		
		System.out.println();
		
		/*3) Declara un String que contenga tu nombre, despu�s muestra un mensaje 
		de bienvenida por consola. Por ejemplo: si introduzco �Fernando�, me 
		aparezca �Bienvenido Fernando�.*/
	
		System.out.println("Actividad 3 y 4.");
		
		Scanner nombre = new Scanner (System.in);
		
		System.out.println("�Cu�l es tu nombre?");
		
		String getNombre = nombre.nextLine();
		
		System.out.println("Hola "+ getNombre + ". �Bienvenido!");
		
		System.out.println();
		
		
		
		
		
		
		
		/*2) Declara 2 variables num�ricas (con el valor que desees), he indica 
		cual es mayor de los dos. Si son iguales indicarlo tambi�n. Ves cambiando 
		los valores para comprobar que funciona.*/
		
		System.out.println("Ejercicio 2.");
		
		int num3= Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer "
				+ "n�mero"));
		
		Scanner entradaNum2 = new Scanner (System.in);
		System.out.println("Introduce el segundo n�mero");
		int num4= entradaNum2.nextInt();
		
		if (num3 < num4) {
			System.out.println(num3 + " es menor que " + num4);
		}
		
		if (num3>num4 ) {
			System.out.println(num3 + " es mayor que " + num4);
		}
		
		if (num3 == num4) {
			System.out.println(num3 + " es igual a " + num4);
		}
		
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*1) Declara dos variables num�ricas (con el valor que desees), 
		 * muestra por consola la suma, resta, multiplicaci�n, divisi�n y m�dulo 
		 * (resto de la divisi�n).
		 */
		
		System.out.println("Ejercicio 1.");
		
		int num1 = 8;
		int num2= 5;
		
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2) + "\n" 
		+ num1 + "-" + num2 + "=" + (num1-num2) + "\n" + num1 + "x" + num2
		+ "=" + num1*num2 + "\n" + num1 + "/" + num2 + "=" + (double)num1/num2);
		
		
	}

	
	
	
}
