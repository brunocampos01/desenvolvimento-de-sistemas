import javax.swing.JOptionPane;


public class ExibeCaixaDialago {
	public static void main (String args []){
				
		//crio e armazeno a variavel name
		String name = JOptionPane.showInputDialog("Nome ?");
		
		//cria a menssagem
		String menssagem = String.format(" Welcome, %s dark force side !", name);
		
		//exibe a menssagem
		JOptionPane.showMessageDialog(null, menssagem);
	}

}
 
