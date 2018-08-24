import javax.swing.JFrame;

public class DesenhoSimplesTest {

	public static void main(String[] args) {
		
		//chama a classe que conte o desenho
		DesenhoSimples painel = new DesenhoSimples();
		
		JFrame aplicacao = new JFrame();
		
		//confgura o frame para ser fechado
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//configura o frame visivel
		aplicacao.setVisible(true);
		
		aplicacao.add(painel);
		aplicacao.setSize(250,250);

	}

}
