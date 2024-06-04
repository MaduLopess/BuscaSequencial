package modelo;

public class Modelo {

	public int buscar(int[] vetor, int elemento) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == elemento) {
				return i;
			}
		}
		return -1;
	}
}
