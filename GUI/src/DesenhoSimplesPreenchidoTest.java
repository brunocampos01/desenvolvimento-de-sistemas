import javax.swing.JFrame;

public class DesenhoSimplesPreenchidoTest {
	public static void main(String[] args) {
		DesenhoSimplesPreenchido painelDeDesenho = new DesenhoSimplesPreenchido();
		JFrame frame = new JFrame();
		
		//visible
		frame.setVisible(true);
		
		//CLOSE
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//size
		frame.setSize(230, 250);
		
		//add o painel no frame
		frame.add(painelDeDesenho);	
	}
}
