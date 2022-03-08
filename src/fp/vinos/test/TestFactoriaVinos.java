package fp.vinos.test;
/**
 * @author José A. Troyano
 * 
 * @since 2019-03-10
 */

import fp.vinos.FactoriaVinos;
import fp.vinos.Vinos;

public class TestFactoriaVinos {
	
	public static void main(String[] args) {
	
		testCreacionVinos();
	
	}

	private static void testCreacionVinos() {
		
		System.out.println("\nTEST de la creacion de vinos");
		
		try {
		
			Vinos vinos = FactoriaVinos.leerVinos("data/wine_reviews.csv");
			System.out.println("\t VINOS: "+ vinos + "\n");
			
	
		} catch(Exception e) {
	
			System.out.println("Excepción capturada:\n   " + e);	
		
		}
	}
}
