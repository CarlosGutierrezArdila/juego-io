package cuestionario;

import java.util.ArrayList;
import java.util.Random;

public class Categoria {
	public ArrayList<Pregunta> preguntas;
	private Random random;
	
	public Categoria() {
		this.preguntas = new ArrayList<Pregunta>();
		this.random = new Random();
	}
	
	public Pregunta getPregunta(){
		int menosRepeticiones = 1000;
		ArrayList<Pregunta> nuevaPreguntas = new ArrayList<Pregunta>();
		int totalPreguntas = this.preguntas.size();
		for (int i = 0; i < totalPreguntas; i++) {
			Pregunta p = this.preguntas.get(i);
			if (p.repeticiones < menosRepeticiones) {
				menosRepeticiones = p.repeticiones;
				nuevaPreguntas.clear();
				nuevaPreguntas.add(p);
			} else if (p.repeticiones == menosRepeticiones) {
				nuevaPreguntas.add(p);
			}
		}
		int eleccion = this.random.nextInt(nuevaPreguntas.size());
		Pregunta p = nuevaPreguntas.get(eleccion);
		p.repeticiones += 1;
		return p;
	}
}
