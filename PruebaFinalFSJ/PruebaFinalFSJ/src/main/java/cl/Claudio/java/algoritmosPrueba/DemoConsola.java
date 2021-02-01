package cl.Claudio.java.algoritmosPrueba;

public class DemoConsola {

	public static void main(String[] args) {

		ValidadorMargenSimple validador = new ValidadorMargenSimple();

		ValidadorMargenComplejo validadorComplejo = new ValidadorMargenComplejo();
		
		System.out.println("--------------------------");
		System.out.println("Demostración Algoritmo Verificación Margen");
		System.out.println("--------------------------");

		for (int i = 0; i < 5; i++) {

			Double precio = Math.random() * (2000 - 200 + 1) + 200;

			Double costo = Math.random() * (2000 - 200 + 1) + 200;


			System.out.println("");
			System.out.println(i + 1 + ". Precio " + precio + " y Costo" + costo);
			System.out.print("Algoritmo Simple: ");

			validador.validar(precio, costo);

			System.out.print("Algoritmo Complejo: ");

			validadorComplejo.validar(precio, costo);

		}

	}
}
