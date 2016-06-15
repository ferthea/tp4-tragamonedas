package ar.edu.unlam.tp4;

public class Tambor {
	
	private Integer posicion;
	
	public Tambor(NumberGenerator generator){
		posicion = generator.generate();
	}
	
	public Integer getPosicion(){
		return posicion;
	}
	
	public void girar(){
		RandomNumberGenerator numero = new RandomNumberGenerator();
		posicion = numero.generate();
	}
}
