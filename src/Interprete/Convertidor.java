package interprete;

import org.json.JSONArray;
import org.json.JSONObject;

import cuestionario.Categoria;
import cuestionario.Opcion;
import cuestionario.Pregunta;

public class Convertidor {
	
	public Categoria convertir(String path) {
		Lector la = new Lector();
		JSONObject json = new JSONObject(la.leer(path));
		JSONArray array = json.getJSONArray("preguntas");
		Categoria categoria = new Categoria();
		for(int iter = 0; iter < array.length(); iter ++) {
			Pregunta pregunta = new Pregunta();
			pregunta.asunto = array.getJSONObject(iter).getString("asunto");
			pregunta.texto = array.getJSONObject(iter).getString("texto");
			pregunta.repeticiones = array.getJSONObject(iter).getInt("repeticiones");
			JSONArray arrayOp = array.getJSONObject(iter).getJSONArray("opciones");
			for(int jr=0; jr < arrayOp.length(); jr++) {
				Opcion opcion = new Opcion();
				opcion.texto = arrayOp.getJSONObject(jr).getString("texto");
				opcion.reputacion = arrayOp.getJSONObject(jr).getInt("reputacion");
				opcion.cargo = arrayOp.getJSONObject(jr).getInt("cargo");
				pregunta.opciones.add(opcion);
			}
			categoria.preguntas.add(pregunta);
		}
		return categoria;
	}
}
