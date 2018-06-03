package view;

public class Main {
	
	public static void main(String[] args) {
		try {
			Controlador controlador = new Controlador();
			//controlador.serializacao();
			controlador.desserializacao();
			controlador.login();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
