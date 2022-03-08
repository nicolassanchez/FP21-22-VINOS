package fp.vinos.test;
/**
 * @author José A. Troyano
 * 
 * @since 2019-02-26
 */

import fp.vinos.Vino;

public class TestVino {
		
	public static void main(String[] args) {	
		testConstructor();
	}

	private static void testConstructor() {
		
		System.out.println("\nTEST del Constructor");
		
		try {
			
			Vino vino = new Vino("Spain", "Northern Spain", 96, 90.0, "Tinta de Toro");
			System.out.println("\t VINO: "+ vino);		
			
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
		
		System.out.println("TEST con fallo del Constructor \n");
		
		try {
			
			// Puntos > 100
			Vino vino = new Vino("Spain", "Northern Spain", 101, 110.0, "Tinta de Toro");
			System.out.println("   VINO: "+ vino);			
		
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
		
		try {
			
            // Precio negativo
			Vino vino = new Vino("Spain","Northern Spain",96,-110.0,"Tinta de Toro");
			System.out.println("   VINO: "+ vino);			
		
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	
		System.out.println("\n \n << FIN TEST >>");
	}
}
