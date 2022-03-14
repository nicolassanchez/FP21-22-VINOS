package fp.vinos;
/**
 * @author José A. Troyano
 * 
 * @since 2019-03-21
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import fp.utiles.Checkers;
  
public class FactoriaVinos {
	
	// NO TIENE MÉTODO CONSTRUCTOR
	
	public static Vinos leerVinos(String rutaFicheroVinos) {
		
		Vinos res = null;
		
		try {
			Stream<Vino> sv = Files.lines(Paths.get(rutaFicheroVinos))
				                   .skip(1)
				                   .map(FactoriaVinos::parsearVino);
			res = new Vinos(sv);
		} catch (IOException e) {
		
			System.out.println("No se ha encontrado el fichero " + rutaFicheroVinos);
			e.printStackTrace();
		}
		return res;
	}
	
	private static Vino parsearVino(String lineaCSV) {	
		String[] campos = lineaCSV.split(",");
		Checkers.check("La línea debe contener 5 campos", campos.length == 5);	
		
		String pais = campos[0].trim();
		String region = campos[1].trim();
		Integer puntos = Integer.parseInt(campos[2].trim());
		Double precio = Double.parseDouble(campos[3].trim());
		String uva = campos[4].trim();
		
		return new Vino(pais, region, puntos, precio, uva);
	}
}

