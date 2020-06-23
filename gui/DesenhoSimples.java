import java.awt.Graphics;
import javax.swing.JPanel;

public class DesenhoSimples extends JPanel{
	//método que desenha o painel
	public void paintComponent( Graphics g)	{
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		//faz o desenho
		g.drawLine(0, 0, width, height);
		g.drawLine(0, height, width, 0);
		g.drawLine(width/2, 0,width/2, height);
	}
}
