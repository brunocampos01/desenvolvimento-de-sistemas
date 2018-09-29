import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class DesenhoSimplesPreenchido extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//desenha o rosto
		g.setColor(Color.RED);
		g.fillOval(10, 10, 200, 200);
		
		//desenha os olhos
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);

	}

}
