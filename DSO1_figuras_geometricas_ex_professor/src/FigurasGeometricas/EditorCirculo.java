package FigurasGeometricas;

class EditorCirculo implements Clicavel {
	  private Reprodutor quadro;
	  EditorCirculo(Reprodutor quadro) {
	    this.quadro = quadro;
	  }
	  
	  public void clique(int x, int y) {
	    quadro.addFig(
	      new Circulo(x,y,50)
	    );
	    quadro.repaint();
	  }
	}