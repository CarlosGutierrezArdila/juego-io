package cuestionario;

import java.util.ArrayList;

public class Pregunta {
	public String texto;
	public String asunto;
	public ArrayList<Opcion> opciones;
	public int repeticiones;
	
	public Pregunta() {
		this.texto = "";
		this.asunto = "";
		this.opciones = new ArrayList<Opcion>();
		this.repeticiones = 0;
	}
	
}
