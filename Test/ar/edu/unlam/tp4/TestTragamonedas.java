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
		
		assertTrue( (primerPosicion >= 1 && primerPosicion <= 10) &&
				(segundaPosicion >= 1 && segundaPosicion <= 10) &&
				(terceraPosicion >= 1 && terceraPosicion <= 10));
	}
	
	@Test
	public void queElTamborFuncioneCorrectamente(){ 
		/* Creo un objeto con un numero al azar (en este caso 3),
		 * inicializo el tambor en esa posicion y verifico
		 * que se haya iniciado correctamente
		 */
		FixNumberGenerator numero = new FixNumberGenerator(3);
		Tambor nuevoTambor = new Tambor(numero);
		assertEquals(numero.generate(), nuevoTambor.getPosicion());
	}

}
