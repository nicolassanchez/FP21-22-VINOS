package fp.vinos.test;
/**
 * @author José A. Troyano
 * 
 * @since 2019-03-26
 */

import fp.vinos.Vino;
import fp.vinos.Vinos;


public class TestVinos {
	private static Vino vino1 = new Vino("US","California",96,235.0,"Cabernet Sauvignon");
	private static Vino vino2 = new Vino("Spain","Northern Spain",96,110.0,"Tinta de Toro");
	private static Vino vino3 = new Vino("US","California",96,90.0,"Sauvignon Blanc");
	private static Vino vino4 = new Vino("US","Oregon",96,65.0,"Pinot Noir");
	private static Vino vino5 = new Vino("France","Provence",95,66.0,"Provence red blend");
	private static Vino vino6 = new Vino("Spain","Northern Spain",95,73.0,"Tinta de Toro");
	private static Vino vino7 = new Vino("Spain","Northern Spain",95,65.0,"Tinta de Toro");
	private static Vino vino8 = new Vino("Spain","Northern Spain",95,110.0,"Tinta de Toro");
	private static Vino vino9 = new Vino("US","Oregon",95,65.0,"Pinot Noir");
	private static Vino vino10 = new Vino("US","California",95,60.0,"Pinot Noir");

	private static Vinos vinos = new Vinos();
	
	
	public static void main(String[] args) {
		
		testConstructor();
		testCalcularNumeroVinosPais();
		testObtenerVinoMejorPuntuado();
		testCalcularVinosPorPais();
		testCalcularUvasPorRegion();
		testObtenerVinosRangoPuntos();
		testCalcularUvasPorPais();
		testCalcularCalidadPrecioPorRegionMayorDe();
	}


	private static void testConstructor() {
		System.out.println("\nTEST del Constructor");
		try {
			vinos = new Vinos();
			vinos.añadirVino(vino1);
			vinos.añadirVino(vino2);
			vinos.añadirVino(vino3);
			vinos.añadirVino(vino4);
			vinos.añadirVino(vino5);
			vinos.añadirVino(vino6);
			vinos.añadirVino(vino7);
			vinos.añadirVino(vino8);
			vinos.añadirVino(vino9);
			vinos.añadirVino(vino10);

			System.out.println("  VINOS: "+ vinos + "\n");
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	}
	
	private static void testCalcularNumeroVinosPais() {
		
		System.out.println("\nTEST de calcularNumeroVinosPais");
		
		try {
			System.out.println("  PAIS: " + "Spain");
			System.out.println("  VINOS: " + vinos.calcularNumeroVinosPais("Spain"));
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	}
	
	private static void testObtenerVinoMejorPuntuado() {
		
		System.out.println("\nTEST de obtenerVinoMejorPutuado");
		
		try {
			System.out.println("  VINO: " + vinos.obtenerVinoMejorPuntuado());
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	}
	
	private static void testCalcularVinosPorPais() {
		
		System.out.println("\nTEST de calcularVinosPorPais");
		
		try {
			System.out.println("  UVAS DE California: " + vinos.calcularVinosPorPais());
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	}
	
	
	
	private static void testCalcularUvasPorRegion() {
		System.out.println("\nTEST de calcularUvasRegion");
		try {
			System.out.println("  UVAS DE California: " + vinos.calcularUvasPorRegion("California"));
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	}
	
	private static void testObtenerVinosRangoPuntos() {
		System.out.println("\nTEST de obtenerVinosRangoPuntos");
		try {
			System.out.println("  MÍNIMO: 90, MÁXIMO: 95");
			System.out.println("  VINOS: " + vinos.obtenerVinosRangoPuntos(90, 95));
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
		
		System.out.println("\nTEST con fallo de obtenerVinosRangoPuntos");
		try {
			System.out.println("  MÍNIMO: 95, MÁXIMO: 90");
			System.out.println("  VINOS: " + vinos.obtenerVinosRangoPuntos(95, 90));
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	}
	
	private static void testCalcularUvasPorPais() {
		System.out.println("\nTEST de calcularUvasPorPais");
		try {
			System.out.println("  UVAS POR PAIS: " + vinos.calcularUvasPorPais());
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	}
	
	private static void testCalcularCalidadPrecioPorRegionMayorDe() {
		System.out.println("\nTEST de calcularCalidadPrecioPorRegionMayorDe");
		try {
			System.out.println("  TOTAL VINOS DE CALIDAD/PRECIO MAYOR DE 1.2: " + vinos.calcularCalidadPrecioPorRegionMayorDe(1.2));
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	}
}