package Cuestionario;

import java.util.ArrayList;

public class Pregunta {
	public String texto;
	public String asunto;
	public ArrayList<Opcion> opciones;
	
	public Pregunta() {
		this.texto = "";
		this.asunto = "";
		this.opciones = new ArrayList<Opcion>();
	}
	
}
