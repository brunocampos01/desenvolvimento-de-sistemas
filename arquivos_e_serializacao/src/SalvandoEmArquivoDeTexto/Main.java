package SalvandoEmArquivoDeTexto;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    	TextFile escreveNoAquivo = new TextFile();
    	
    	escreveNoAquivo.writeFile();
    	escreveNoAquivo.readFile();
    	
    }
}