package visao;
import javax.swing.JOptionPane;
import modelo.Modelo;
import negocio.Negocio;

public class Visao {
	
	public int solicitarElemento() {
		return Integer.parseInt(JOptionPane.showInputDialog("\nInsira o número a ser buscado: \n"));
	}

	public void mostrarResultado(int resultado) {
		if (resultado != -1) {
			System.out.println("Elemento encontrado no índice: " + resultado);
		} else {
			System.out.println("Elemento não encontrado.");
		}
	}
	public static void main(String[] args) {

		int[] array = { 54, 26, 93, 17, 77, 31, 44, 55, 20, 65 };

		Modelo model = new Modelo();
		Visao view = new Visao();
		Negocio controller = new Negocio(model, view);

		controller.iniciarBusca(array);
	}
}
