
public class TryCatch {

	public static void main(String[] args) {
		

		try{
			int[] vetor = new int[4];
			System.out.println("antes da exception");
			
			vetor[5] = 10;
			System.out.println("esse texto nao sera impresso");
			
		}catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("erro de acesso ao array (posicao invalida)");
		}
		System.out.println("linha executada depois da exception (o programa nao parou !)");
	}

}
