package FigurasGeometricas;

class Circulo extends Ponto implements Reproduzivel {
  private int raio;
  
  Circulo(int x, int y, int raio) {
    super(x,y);
    this.raio = raio;
  }

  void ampliar(int val) {
    raio += val;
  }

  public void reproduzir(java.awt.Graphics g) {
    Ponto p = new Ponto(raio,raio);
    g.drawOval(this.diferencaX(p),this.diferencaY(p),2*raio,2*raio);
  }

  public String toString() {
    //return raio +"@"+ +("+ this.x +","+ this.y +")"; 
    return raio +"@"+ super.toString(); 
  }
}