package ar.edu.unlam.tp4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTragamonedas {
	
	@Test
	public void queSeGenereNumeroRandomEntre1y10(){
		RandomNumberGenerator random = new RandomNumberGenerator();
		Integer esperado = random.generate();
		assertTrue(esperado > 0 && esperado <= 10);
	}

	@Test
	public void queLosTamboresSeInicienEn1() {
		Tragamonedas tragamonedas = new Tragamonedas();
		Integer primerPosicion = tragamonedas.primerTambor.getPosicion();
		Integer segundaPosicion = tragamonedas.segundoTambor.getPosicion();
		Integer terceraPosicion = tragamonedas.tercerTambor.getPosicion();
		assertTrue(primerPosicion == 1 && segundaPosicion == 1 && terceraPosicion == 1);
	}
	
	@Test
	public void queFuncioneCorrectamente(){
		Tragamonedas traga = new Tragamonedas();
		traga.activar();
		Integer primerPosicion = traga.primerTambor.getPosicion();
		Integer segundaPosicion = traga.segundoTambor.getPosicion();
		Integer terceraPosicion = traga.tercerTambor.getPosicion();
		
		if(traga.entregaPremio()){
			System.err.println("Felicitaciones, haz ganado!");
		}
		else{
			System.err.println("Lo sentimos, haz perdido.");
		}
		System.out.println("Los numeros fueron: \n");
		System.out.println("Primer tambor: " + primerPosicion);
		System.out.println("\nSegundo  tambor: " + segundaPosicion);
		System.out.println("\nTercer tambor: " + terceraPosicion);
	}

}
