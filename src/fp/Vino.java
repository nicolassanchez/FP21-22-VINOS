package fp.vinos;
/**
 * @author José A. Troyano
 * 
 * @since 2019-03-06
 */

import fp.utiles.Checkers;

public class Vino {
	
	// EJERCICIO 1. Crear la clase Vino con los siguientes atributos 
	//
	// - pais: atributo String con el país del vino
	// - region: atributo String con la región del vino
	// - puntos: atributo entero (int) con la puntuación obtenida en la valoración, los puntos deben estar entre cero y cien
	// - precio: atributo Double con el precio del vino, el precio debe ser mayor que cero
	// - uva: atributo String con el tipo de uva del vino
	//
	// NOTA: Las validaciones de los campos la hacemos en el constructor
		
	private String pais;
	private String region;
	private Integer puntos;
	private Double precio;
	private String uva;
	
	// EJERCICIO 2. Crear los siguientes métodos de la clase Vino comprobando las 
	//              restricciones de los atributos en los casos en los que sea necesario 
	// - Vino: constructor de la clase a partir de los atributos en el orden que se indica en el ejercicio 1
	// - Métodos getters: para todos los atributos de la clase 
	// - Vino::getCalidadPrecio: propiedad derivada que se calcula dividiendo los puntos por el precio
	// - Vino::toString: mostrando todos los atributos
	// - Vino::equals: usando todos los atributos para determinar la igualdad
	// - Vino::hashCode: usando la misma selección de atributos que el método equals 
	
	public Vino(String pais, String region, Integer puntos, Double precio, String uva) {
		
		// La puntuación obtenida en la valoración (puntos) deben estar entre cero y cien
		// El precio del vino debe ser mayor que cero
		
		// UTILIDADES DESARROLLADAS POR EL DEPARTAMENTO
		Checkers.check("Los puntos deben estar entre cero y cien", puntos >= 0 && 
				puntos <= 100);
		Checkers.check("El precio debe ser mayor que cero", precio > 0);
		
		this.pais = pais;
		this.region = region;
		this.puntos = puntos;
		this.precio = precio;
		this.uva = uva;
	}
	
	// Métodos getters: para todos los atributos de la clase
	public String getPais() { return pais; }
	public String getRegion() { return region; }
	public Integer getPuntos() { return puntos; }
	public Double getPrecio() { return precio; }
	public String getUva() { 
		return uva; 
		}
	 
	// Vino::getCalidadPrecio: propiedad derivada que se calcula 
	// dividiendo los puntos por el precio
	
	public Double getCalidadPrecio() { 
		return puntos/precio; 
	}
	
	// Métodos de la clase Object
	// Vino::toString: mostrando todos los atributos
	@Override
	public String toString() {
		return "Vino [pais=" + pais + ", region=" + region + ", puntos=" + puntos + ", precio=" +
	                  precio + ", uva=" + uva + "] \n";
	}

	// Métodos de la clase Object
	// Vino::equals: usando todos los atributos para determinar la igualdad
	
	@Override
	public boolean equals(Object obj) {
		
		// Si es el mismo objeto con los mismos datos
		if (this == obj) { return true; }		
		
		// Si el objeto es nulo
		if (obj == null) { return false; }		
		
		// Si el objeto recibido no es la misma clase
		if (getClass() != obj.getClass()) { return false; }
		
		// Guardo el valor recibido en un objeto del mismo tipo
		Vino other = (Vino) obj;
		
		// Validación según ordenación
		// pais + region + puntos + precio + uva  
		
		if (pais == null) {
		
			if (other.pais != null)
				return false;
		
		} else if (!pais.equals(other.pais))
		
			return false;
		
		if (precio == null) {
			
			if (other.precio != null)
			
				return false;
		
		} else if (!precio.equals(other.precio))
		
			return false;

		if (puntos == null) {
		
			if (other.puntos != null)
			
				return false;
		
		} else if (!puntos.equals(other.puntos))
		
			return false;
		
		if (region == null) {
		
			if (other.region != null)
			
				return false;
		
		} else if (!region.equals(other.region))
		
			return false;
		
		if (uva == null) {
		
			if (other.uva != null)
			
				return false;
		
		} else if (!uva.equals(other.uva))
		
			return false;
		
		return true;
	}
	
	// Métodos de la clase Object
	// Vino::hashCode: usando la misma selección de atributos que el método equals
	// pais + region + puntos + precio + uva
	
	@Override
	public int hashCode() {
		
		final int prime = 31;  // Es un número primo
		int result = 1; 

		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
		result = prime * result + ((puntos == null) ? 0 : puntos.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((uva == null) ? 0 : uva.hashCode());
		
		return result;
	}
}