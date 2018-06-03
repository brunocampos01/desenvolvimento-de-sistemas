package FigurasGeometricas;

class EditorRetangulo implements Clicavel {

	  private Reprodutor quadro;
	  EditorRetangulo(Reprodutor quadro) {
	    this.quadro = quadro;
	  }
	  
	  public void clique(int x, int y) {
	    System.out.println("Retangulo");
	     quadro.addFig(
	      new Retangulo(new Ponto(x,y), new Ponto(x+50))
	    );
	    quadro.repaint();
	    
	  }

	}