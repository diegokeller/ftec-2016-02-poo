package aula07;

public class MainJogo {

	public static void main(String[] args) {
		SubZero s = new SubZero("SubZero", 100, 0);
		s.atacar();
		s.congelar();
		s.fatality();

		Rayden r = new Rayden("Rayden", 100, 0);
		r.atacar();
		r.fatality();

		// Classes abstratas não podem ser instanciadas
		// Personagem p = new Personagem("", 100, 0);
		// p.andar();
	}

}
