package cl.Claudio.java.algoritmosPrueba;

public class ValidadorMargenSimple implements ValidadorMargen {

	@Override
	public void validar(Double precio, Double costo) {
	

			if ((precio - costo) / costo * 100 >= 10) {

				System.out.print("MARGEN OK");
			}

			else {

				System.out.print("ALERTA MARGEN BAJO MINIMO");

			}

			System.out.println();

		
	}

}
