package Ejercicio1;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARACIÓN DE VARIABLES INT=ENTERO STRING=TEXTOS FLOAT=DECIMAL SIMPLE
		int edad=45;
		int year=2022;
		String name= "Alvaro";
		float height=1.65F;
		
		
		
		
		//Para imprimir algo en una sola línea escribimos println
		
		/*Para imprimir algo con printf necesitamos definir el tipo de 
		 variable con % e indicando .x decimales 
		 o %d para numeros entero y %s para string */
		
		
		System.out.println("Hola Mundillo");
		System.out.printf("Ayer fue mi %d cumpleaños y este año %d es muy especial. Fdo: %s\n", edad+1, year, name);
		System.out.printf("Mi altura es %.2f",height);
		
		
		
		
	}


}
