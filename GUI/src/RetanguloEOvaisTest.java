import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RetanguloEOvaisTest {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog(null, "1 = retangulo\n" + "2 = oval\n" 
		+ "3 = circulos concntricos\n" + "4 = espiral quadrada");
		int choise = Integer.parseInt(input);
		
		//objeto que contem o desenho (painel)
		RetanguloEOvais painel = new RetanguloEOvais(choise);
		
		//objeto frame que recebe o painel
		JFrame frame = new JFrame();
		
		//visible
		frame.setVisible(true);
		
		//CLOSE_ON_DESCRITPION
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Size
		frame.setSize(400,400);
		
		//O objeto frame recebe o objeto painel
		frame.add(painel);
	}
}
