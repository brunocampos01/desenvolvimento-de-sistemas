import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DesenhoArco extends JPanel{

	private final static Color VIOLET = new Color (128,0,128);
	private final static Color INDIGO = new Color (75, 0 , 130);
	
	
	//construtor
	public DesenhoArco (){
		setBackground (Color.WHITE);	//fundo branco
	}
	
	//desenha o arco-iris
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		
		int radius = 20;
		
		//desenho  central
		int centerX = getWidth () / 2;
		int centerY = getHeight() / 2;
		
		for (int cont = colors.lenght; cont > 0; cont --){
			g.setColor(colors[ cont - 1]);
		}
		
		//preenche arco
		g.fillArc(centerX - cont*radius, centerY - cont*radius,
				cont*radius*2,cont*radius*2, 0 , 180);
	}
}
