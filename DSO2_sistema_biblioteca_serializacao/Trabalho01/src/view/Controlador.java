package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class Controlador {
	
	Biblioteca biblioteca;
    
	//serializacao e desserializacao
	Gerente gerente = new Gerente("gerivaldo");
	Funcionario funcionario = new Funcionario("bereta");

	 public void serializacao(){
			try{
				FileOutputStream arqGerente = new FileOutputStream("./media/gerente.ser");
				FileOutputStream arqFuncionario = new FileOutputStream("./media/funcionario.ser");
				ObjectOutputStream out; 
				
				out = new ObjectOutputStream(arqGerente);
				out.writeObject(gerente);
				
				out = new ObjectOutputStream(arqFuncionario);
				out.writeObject(funcionario);
				
				out.close();
				
				System.out.println("Done");

			}catch (FileNotFoundException e){
				e.printStackTrace();
			}catch (IOException e){
				e.printStackTrace();
			}
	 }
	 
	 public void desserializacao(){
		 try{
			//Responsável por carregar o arquivo serializacao.ser
			FileInputStream redFile;
			ObjectInputStream os;
			
			redFile = new FileInputStream("./media/gerente.ser");
			os = new ObjectInputStream(redFile);
			gerente = (Gerente) os.readObject();
			System.out.println("gerente: " + gerente.getLogin());
			
			redFile = new FileInputStream("./media/funcionario.ser");
			os = new ObjectInputStream(redFile);
			funcionario = (Funcionario) os.readObject();
			System.out.println("Funcionário: " + funcionario.getLogin());
			
		   	os.close();
		   	redFile.close();
		   	
		 }catch(Exception ex){
			ex.printStackTrace(); 
		 }
	 }

	 public void login (){
	     String user = JOptionPane.showInputDialog("Digite o usuário: ");
	     String pass = JOptionPane.showInputDialog("Digite a senha: ");
	     if (user.equals(gerente.getLogin()) && pass.equals("123")){
	    	 biblioteca = new Biblioteca("gerenteView");
	    	 biblioteca.open();
	     } else if (user.equals(funcionario.getLogin()) && pass.equals("123")) {
	    	 biblioteca = new Biblioteca("funcionarioView");
	    	 biblioteca.open();
	     } else {
	    	 JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!!!");
	     }
	}
}
