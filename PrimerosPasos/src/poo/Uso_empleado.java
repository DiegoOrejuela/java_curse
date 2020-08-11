package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Uso_empleado {
	
	//objetivo
		/*Establecer las nominas de una serie de empleados"
		
		 Objeto: Empleado
		 Caracter�sticas: 
		 	*nombre
		 	*sueldo
		 	*fecha de alta
		 	*m�todo para subir sueldo*/	

	public static void main(String[] args) {
		//Forma manual
			//Paso 1. Instanciar los objetos
			
			empleado empleado1 = new empleado("Maria Perez", 600000,  2000,  5, 15);
			empleado empleado2 = new empleado("Paco Juarez", 650000,  2000,  10, 3);
			empleado empleado3 = new empleado("Pepita Melano", 700000,  2000,  12, 23);
			
			//Paso 2. Subir sueldo
			
			empleado1.subirSueldo(5);
			empleado2.subirSueldo(5);
			empleado3.subirSueldo(5);
			
			//Paso 3. Imprimir en pantalla
			
			System.out.println(empleado1.getId()+ ". Nombre: " + empleado1.getNombre() + ". Sueldo: " + empleado1.getSueldo()
			+ "| Fecha de entrada : " + empleado1.getAltaContrato());
			System.out.println(empleado2.getId()+ ". Nombre: " + empleado2.getNombre() + ". Sueldo: " + empleado2.getSueldo()
			+ "| Fecha de entrada : " + empleado2.getAltaContrato());
			System.out.println(empleado3.getId() + ". Nombre: " + empleado3.getNombre() + ". Sueldo: " + empleado3.getSueldo()
			+ "| Fecha de entrada : " + empleado3.getAltaContrato());
		
			System.out.println();
			
		//Forma mejorada
			
			//Paso 1. Crear una matriz
			
			empleado [] misEmpleados = new empleado [7];
			misEmpleados [0] = new empleado("Maria Perez", 600000,  2000,  5, 15);
			misEmpleados [1] = new empleado("Paco Juarez", 650000,  2000,  10, 3);
			misEmpleados [2]= new empleado("Pepita Melano", 700000,  2000,  12, 23);
			misEmpleados [3]= new empleado ("Juan");
			misEmpleados [4]= new empleado ("Pedro");
			Jefatura jefe_RH = new Jefatura ("Armor", 750000, 2000, 3, 23); //Polimorfismo y enlace di�mico
			jefe_RH.setIncentivo(100000);
			misEmpleados [5] = jefe_RH;
			misEmpleados [6] = new Jefatura ("Pepito Pino", 700000,  2000,  12, 23);//Conversi�n (casting) de objetos. Refundici�n
			Jefatura Jefe_compras = (Jefatura) misEmpleados [6];
			Jefe_compras.setIncentivo(80000);
			
			
				
			//Paso 2. Subir el sueldo creando un ciclo for.;
			
			for (int i = 0; i<7; i++) {
				misEmpleados[i].subirSueldo(5);
			}
			
			/*Ordenar el array por sueldo de forma ascendente, junto con el 
			m�todo comparableTo en la clase empleado*/
			
			Arrays.sort(misEmpleados);
			
			//Paso 3. Presnetarlo en consola con un ciclo for mejorado
			
			for (empleado e : misEmpleados) {
				System.out.println("Nombre: " + e.getNombre() + ". Sueldo: " + e.getSueldo()
			+ "| Fecha de entrada : " + e.getAltaContrato());
			}
			
			System.out.println();
			
		//Forma personal
			empleado [] misEmpleados2 = new empleado [2];
				
				for (empleado h : misEmpleados2) {
					
					
					h = new empleado (JOptionPane.showInputDialog("Introduce el nombre del "
							+ "empleado " ),Integer.parseInt(JOptionPane.showInputDialog("Introduce el "
							+ "sueldo")) , Integer.parseInt(JOptionPane.showInputDialog("Introduce el "
							+ "a�o de alta")),  Integer.parseInt(JOptionPane.showInputDialog("Introduce el "
							+ "el mes de alta")), Integer.parseInt(JOptionPane.showInputDialog("Introduce el "
							+ "dia de alta")));
					
					h.subirSueldo(5);
					
					System.out.println("Nombre: " + h.getNombre() + ". Sueldo: " + h.getSueldo()
					+ "| Fecha de entrada : " + h.getAltaContrato());
				}
				
				/*for (empleado j : h) {
					System.out.println("Nombre: " + j.getNombre() + ". Sueldo: " + j.getSueldo()
					+ "| Fecha de entrada : " + j.getAltaContrato());
				}*/
				
	
	}

}

class empleado implements Comparable {
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	private int Id;
	
	private static int IdSiguiente = 1;
	

	
	public empleado (String nom, double sue, int a�o, int mes, int dia){
		
		nombre = nom;
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar (a�o, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
		Id= IdSiguiente;
		
		IdSiguiente++;
		
		
	}
	
	//Sobrecarga de constructores
		/*Objetivo: Queremos que cuando solo se pase nombre, se agrege por defecto
		 en las dem�s variables datos por defecto*/
		 
	public empleado (String nom) {
		this (nom, 80000, 2000, 3, 21);
	}
	
	
		//Metodos getters
		
			public String getNombre () {
				return nombre;
			}
			
			public double getSueldo () {
				
				return sueldo;
			}
			
			public Date getAltaContrato () {
				return altaContrato;
			}
			
			public int getId () {
				return Id;
			}
			
			/*M�todo de la interfaz Comparable para ordenar la lista, junto con 
			el m�todo sort de la clase arrays.*/
				
				public int compareTo (Object miObjeto) {
					empleado otroEmpleado = (empleado) miObjeto;
					
					if (this.sueldo < otroEmpleado.sueldo) {
						return -1;
					}
					if (this.sueldo < otroEmpleado.sueldo) {
						return 1;
					}
					return 0;
				}
		//M�todos setters
			
			public void subirSueldo (double porcentaje) {
				double aumento = sueldo*porcentaje/100;
				
				sueldo+=aumento;
						
			}
			
}

class Jefatura extends empleado {
	
	private double incentivo;
	
	public Jefatura (String nom, double sue, int a�o, int mes, int dia) {
		super (nom, sue, a�o, mes, dia);
	}
	
		public void setIncentivo (double b) {
			incentivo = b;
		}
		public double getSueldo () {
			double sueldoJefe = super.getSueldo();
			return sueldoJefe + incentivo;
		}
		
		
	
}
