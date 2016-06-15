package ar.edu.unlam.tp4;

public class RandomNumberGenerator implements NumberGenerator {

	@Override
	public Integer generate() {
		return (int)(Math.random() * (10 - 1) + 1 )  + 1;
	}

}
