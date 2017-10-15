package matriz;

import java.util.Random;

public class Matriz {
	private int cargos;
	private Random random;
	public float matriz[][];
	
	public Matriz() {
		this.cargos = 4;
		this.random = new Random();
		this.matriz = new float[this.cargos][this.cargos];
		this.iniciar();
	}
	
	private void iniciar() {
		for (int i = 0; i < this.cargos; i++) {
			this.matriz[i] = this.fila();
		}
	}
	
	private float[] fila(){
		float[] filaProbabilidad = new float[this.cargos];
		int[] filaValores = new int[this.cargos];
		int total = 0;
		for(int i = 0; i< this.cargos; i++) {
			filaValores[i] = this.random.nextInt(100);
			total += filaValores[i];
		}
		for(int i = 0; i< this.cargos; i++) {
			filaProbabilidad[i] = filaValores[i] / total;
		}
		return filaProbabilidad;
	}
	
}
