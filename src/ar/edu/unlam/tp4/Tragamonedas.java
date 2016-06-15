package ar.edu.unlam.tp4;

public class Tragamonedas {
	
	Tambor primerTambor;
	Tambor segundoTambor;
	Tambor tercerTambor;
	
	FixNumberGenerator generador = new FixNumberGenerator(1);
	
	public Tragamonedas(){
		primerTambor = new Tambor(generador);
		segundoTambor = new Tambor(generador);
		tercerTambor = new Tambor(generador);	
	}
	
	public void activar(){
		primerTambor.girar();
		segundoTambor.girar();
		tercerTambor.girar();
	}
	
	public Boolean entregaPremio(){
		
		Integer primerPosicion = primerTambor.getPosicion();
		Integer segundaPosicion = segundoTambor.getPosicion();
		Integer terceraPosicion = tercerTambor.getPosicion();
		
		if(primerPosicion == segundaPosicion && segundaPosicion == terceraPosicion){
			return true;
		}
		else{
			return false;
		}
	}
}
