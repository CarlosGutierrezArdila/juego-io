import cuestionario.Categoria;
import cuestionario.Pregunta;
import interprete.Convertidor;

public class test {

	public static void main(String[] args) {
		Convertidor convertidor = new Convertidor();
		Categoria categoria = convertidor.convertir("src/preguntas/junior.json");
		int pr = categoria.preguntas.size();
		for (int i = 0; i < pr; i++) {
			Pregunta p = categoria.preguntas.get(i);
			System.out.println(p.asunto+": " +p.texto);
		}
		Pregunta p;
		p = categoria.getPregunta();
		System.out.println(p.texto + ": "+p.repeticiones);
		p = categoria.getPregunta();
		System.out.println(p.texto + ": "+p.repeticiones);
		p = categoria.getPregunta();
		System.out.println(p.texto + ": "+p.repeticiones);
		p = categoria.getPregunta();
		System.out.println(p.texto + ": "+p.repeticiones);
		p = categoria.getPregunta();
		System.out.println(p.texto + ": "+p.repeticiones);
		p = categoria.getPregunta();
		System.out.println(p.texto + ": "+p.repeticiones);
		p = categoria.getPregunta();
		System.out.println(p.texto + ": "+p.repeticiones);
		p = categoria.getPregunta();
		System.out.println(p.texto + ": "+p.repeticiones);
		p = categoria.getPregunta();
		System.out.println(p.texto + ": "+p.repeticiones);
		p = categoria.getPregunta();
		System.out.println(p.texto + ": "+p.repeticiones);
	}

}
