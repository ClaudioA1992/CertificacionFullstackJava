package cl.Claudio.java;

import org.junit.jupiter.api.Test;

import cl.Claudio.java.algoritmosPrueba.ValidadorMargenComplejo;

public class PruebaAlgoritmoComplejo {

	@Test
	public void pruebaAlgoritmoComplejo() {
		
		Double precio = Math.random() * (2000 - 200 + 1) + 200;

		Double costo = Math.random() * (2000 - 200 + 1) + 200;
		
		
		if (((precio - costo) / costo * 100 > 100) && precio >= 1000){

			System.out.println("ADVERTENCIA POSIBLE ERROR EN COSTO");

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
