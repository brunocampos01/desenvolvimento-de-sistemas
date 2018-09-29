package serializacao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializadorEDesserializador {
	
	Personagem personagemUm, personagemDois;
	
	public void serializar () {	
		try {
			//cria e abre um arquivo
			FileOutputStream fileStream = new FileOutputStream("personagens.ser");
			
			//cria um fluxo de gravacao de objetos
			ObjectOutputStream gravador = new ObjectOutputStream(fileStream);

			//serializa os objetos
			gravador.writeObject(personagemUm);
			gravador.writeObject(personagemDois);
			
			gravador.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void desserializador() throws ClassNotFoundException{
		try {
			//abre o arquivo
			//caso nao exista "personagens.ser" eh capturado uma excecao
			FileInputStream fileStream = new FileInputStream("personagens.ser");
			
			//cria um fluxo de leitura de objetos
			ObjectInputStream leitor = new ObjectInputStream(fileStream);
			
			//desserializa os objetos
			Object one = leitor.readObject();
			Object two = leitor.readObject();
			
			Personagem personagemUm = (Personagem) one;
			Personagem personagemDois = (Personagem) two;
	
			leitor.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
