package fp.vinos;
/**
 * @author José A. Troyano
 * 
 * @since 2019-03-26
 */

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fp.utiles.Checkers;

// EJERCICIO 3. Crear la clase Vinos con los siguientes atributos y métodos 
//
// Vinos: atributo con un conjunto de objetos Vino
// Vinos: constructor vacío de la clase Vinos
// Vinos: constructor de la clase Vinos a partir de un Stream de Vino 

// PENDIENTE:
// Vinos::añadirVino: método para añadir un Vino al conjunto de vinos
// Vinos::toString: mostrando todos los atributos
// Vinos::equals: usando el atributo vinos para determinar la igualdad
// Vinos::hashCode: usando la misma selección de atributos que el método equals 
// Vinos::calcularNumeroVinosPais: cuenta el número de vinos dado un país
// Vinos::obtenerVinoMejorPuntuado: busca el vino con la puntuación más alta
// Vinos::calcularVinosPorPais: diccionario con una lista de vinos por cada país
// Vinos::calcularUvasPorRegion: conjunto de uvas usadas en los vinos de una región dada
// Vinos::obtenerVinosRangoPuntos: calcula una colección de Vino solo con los vinos que estén 
//        valorados en un rango de puntos determinado por un valor mínimo y otro máximo. 
//        Ambos parámetros son enteros, y se debe comprobar que el valor mínimo es menor o 
//        igual que el valor máximo.
// Vinos::calcularUvasPorPais: calcula un diccionario cuyas claves son los paises y los valores 
//        el conjunto de uvas usadas en los vinos de cada país
// Vinos::calcularCalidadPrecioPorRegionMayorDe: calcula un diccionario cuyas claves son 
//        las regiones y los valores son el número de vinos cuya relación calidad/precio supera un 
//        umbral dado

public class Vinos {
	
	// Vinos: atributo con un conjunto de objetos Vino
	private Set<Vino> vinos;
	
	// Vinos: constructor vacío de la clase Vinos
	public Vinos() {
		
		// HashSet -> Colección de elementos únicos, pero desordenados
		this.vinos = new HashSet<Vino>();
	}
	
	// Vinos: constructor de la clase Vinos a partir de un Stream de Vino
	// Un stream es una representación abstracta de una secuencia de elementos
	public Vinos(Stream<Vino> vinos) {
		
		// Un Stream se puede transformar a distinto tipo de colecciones de datos como List y Set, en nuestro caso
		this.vinos = vinos.collect(Collectors.toSet());
	}	
}
