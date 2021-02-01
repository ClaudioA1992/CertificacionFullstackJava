package cl.Claudio.java.algoritmosPrueba;


public class ValidadorMargenComplejo implements ValidadorMargen {

	@Override
	public void validar(Double precio, Double costo) {
		
		
		if (((precio - costo) / costo * 100 > 100) && precio >= 1000){

			System.out.println("ADVERTENCIA POSIBLE ERROR EN COSTO");
			
			//assertThat(precio).

		}
		
		else if (precio < 1000 && ((precio - costo) / costo * 100 > 50)) {

			System.out.println("ADVERTENCIA POSIBLE ERROR EN COSTO");

		}

		else if ((precio - costo) / costo * 100 >= 10) {

			System.out.println("MARGEN OK");
		}

		else if ((precio - costo) / costo * 100 < 10) {

			System.out.println("ALERTA MARGEN BAJO MINIMO");

		}

		else if ((precio - costo) / costo * 100 < 0) {

			System.out.println("ERROR MARGEN NEGATIVO");

		}
		
	}

}
