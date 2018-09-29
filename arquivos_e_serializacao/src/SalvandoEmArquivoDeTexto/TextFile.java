package SalvandoEmArquivoDeTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile {
	// open/create the file
	File arquivo = new File("arquivoDeTexto.txt");

	public void writeFile() {
		try {
			//fluxo de conexao para escrita
			FileWriter escreveNoArquivo = new FileWriter (arquivo);
			//BufferedWriter garante que somente sera escrito quando o buffer estiver cheio
			//encadeado ao FileWrter
			BufferedWriter bufferDeEscrita = new BufferedWriter(escreveNoArquivo);
			
			escreveNoArquivo.write("primeira linha\n");
			escreveNoArquivo.write("segunda linha");
			System.out.println("gravado !");
			
			escreveNoArquivo.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readFile() {
		try {
			//fluxo de conexao para leitura
			FileReader leOArquivo = new FileReader(arquivo);
			//BufferedReader melhora a eficiencia
			//encadeado ao FileReader
			BufferedReader bufferDeLeitura = new BufferedReader(leOArquivo);
			//armazena cada linha
			String line = null;
			try {
				while ((line = bufferDeLeitura.readLine()) != null) {
					System.out.println(line);
				}
				leOArquivo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}
}
