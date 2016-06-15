package ar.edu.unlam.tp4;

public class FixNumberGenerator implements NumberGenerator {
	
	private Integer posicion;
	
	public FixNumberGenerator(Integer number){
		if(number > 0 && number <= 10){
			posicion = number;
		}
	}
	
	@Override
	public Integer generate() {
		return posicion;
	}

}
