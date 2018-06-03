package FigurasGeometricas;

class Texto implements Reproduzivel {
	  private int x,y;
	  private String txt;
	  Texto(String txt, int x, int y) {
	    this.x = x;
	    this.y = y;
	    this.txt = txt;
	  }


	  public void reproduzir(java.awt.Graphics g) {
	    g.drawString(txt,x,y);
	  }


	  public String toString() {
	    return txt; 
	  }
	}//