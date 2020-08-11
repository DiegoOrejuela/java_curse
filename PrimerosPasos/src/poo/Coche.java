package poo;

//Si queremos importar paquetes, se coloca acá. 

public class Coche {
	
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	int motor;
	
	int peso;
	
	private String color;
	
	int peso_total; 
	
	boolean asientos_cuero;
	
	public Coche () {
		
		ruedas = 4;
		
		largo = 400;
		
		ancho = 200;
		
		motor = 1600;
		
		peso = 500;
		
		
		
	}
	// Uso del método getters
		public int ruedas () {
			return ruedas;
		}
		
		public String dime_datos_generales () {
			return "Mi coche tiene " + largo/100 + " metros de largo y " + ancho/100 + " metros de "
					+ "ancho. Su motor es de " + motor + " centimetros cúbicos, y, como todos los " +
					"autos, tiene " + ruedas + " ruedas.";
		}
		
	//Uso del método setters, para asignar un valor. 
		/*public void color () {
			color = "Azul";
		}*/
		
	//Método getters, conviertiendo en función a la variable
		public String color_muestra () {
			return color;
		}
		
	//Paso de parametros con método setters
		
		public void color (String color_coche) {
			color = color_coche;
		}
		
		public void configura_asientos (String asientos_cuero){
			
			if (asientos_cuero.equalsIgnoreCase("si")) {
					this.asientos_cuero = true;
			}else {
				this.asientos_cuero = false;
			}
		}
		
		public String analisis_asiento () {
			if(asientos_cuero == true) {
				return "Los asientos de cuero son de serie";
			}else return "Entonces los asientos son forchitas";
		}
		
		//Setter + getters
			public int peso_final () {
				
				peso_total = 10000;
				
				if (asientos_cuero == true) {
					
					peso_total+= 2000;
				}else {
					peso_total+= 1000;
				}
			
			return peso_total;
			}
		
		
	//Otro método de modularización: meter todo dentro de una clase. 
	public static void main(String[] args) {
		
		Coche renault = new Coche();
		
		System.out.println("El coche tiene " + renault.ruedas + " ruedas");
	
	
	}

}










