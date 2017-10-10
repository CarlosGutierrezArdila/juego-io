import Cuestionario.Categoria;
import Interprete.Convertidor;

public class test {

	public static void main(String[] args) {
		Convertidor convertidor = new Convertidor();
		Categoria categoria = convertidor.convertir("src/preguntas/junior.json");
	}

}
