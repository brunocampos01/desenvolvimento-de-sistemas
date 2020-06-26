import javax.swing.JPanel;
import java.awt.Graphics;

public class RetanguloEOvais extends JPanel{
	
	private int choice;

	//construtor
	public RetanguloEOvais (int escolha){
		this.choice = escolha;
	}

	//método obrigatório para exibir o painel
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		
		int height = getHeight();
		int width = getWidth();
		
		for(int i = 0; i < 15; i++){
			switch (choice){
			case 1:
				g.drawRect(10 + i*10, 10 + i*10, 50 + i *10, 50 + i *10);
				break;
			
			case 2 :
				g.drawOval(10 + i*10,  10+ i*10, 50 + i *10, 50 + i *10);
				break;
				
			case 3 :
	            		g.drawOval(width/2-10*i, height/2-10*i, 20*i, 20*i);
				break;
				
			case 4:
			    	g.drawLine(width/2+10*i, height/2-10*i, width/2+10*i, height/2+10*(i+1));
		            	g.drawLine(width/2+10*i, height/2+10*(i+1), width/2-10*(i+1), height/2+10*(i+1));
		            	g.drawLine(width/2-10*(i+1), height/2+10*(i+1), width/2-10*(i+1), height/2-10*(i+1));
		            	g.drawLine(width/2-10*(i+1), height/2-10*(i+1), width/2+10*(i+1), height/2-10*(i+1));
			
			default:
				break;
					
			}
		}
		
	}
}
