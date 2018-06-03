package FigurasGeometricas;

import static java.lang.Math.*;

class Ponto {
  private int x,y;
  Ponto() {
    //this.x = 0;
    //this.y = 0;
    this(0,0); //via sobrecarga
  }
  Ponto(int x, int y) {
    this.x = x;
    this.y = y;
  }
  Ponto(int z) {
    //this.x = z;
    //this.y = z;
    this(z,z); //via sobrecarga
  }
  void deslocarX(int val) {
       this.x = this.x + val;
  }
  void deslocarY(int val) {
      this.y = this.y + val;
  }
  //diferencaX: a.diferencaX(Ponto b) = (a-b).x
  //cf. vetores (matematica do ensino medio)
  int diferencaX(Ponto p) {
     return this.x - p.x;
  }
  //idem para o eixo Y
  int diferencaY(Ponto p) {
     return this.y - p.y;
  }
  //distancia no eixo X deste ponto ao ponto p
  int normaX(Ponto p) {
     return Math.abs(this.diferencaX(p)); //via sobrecarga
  }
  //idem para o eixo Y 
  int normaY(Ponto p) {
     return Math.abs(this.diferencaX(p)); //via sobrecarga
  }
  //distancia no eixo X deste ponto ao ponto de origem
  //ie modulo de a: |a| (matematica do ensino medio)
  int normaX() {
     return this.normaX(new Ponto(0,0)); //via sobrecarga
  }
  //idem para o eixo Y 
  int normaY() {
     return this.normaY(new Ponto(0,0)); //via sobrecarga
  }
  //distancia deste ponto ao ponto p
  //|a-b| = a.norma(b)
  double norma(Ponto p) {
    double
      dx = this.x - p.x, //deltaX = x1 - x2
      dy = this.y - p.y; //deltaY = y1 - y2
    return sqrt(pow(dx,2) + pow(dy,2));
  }


  int x0(Ponto p) {
    if(p.x < this.x) return p.x;
     return this.x;
    //alternativa
    //return Math.min(this.x,p.x);
  }
  int y0(Ponto p) {
    if(p.y < this.y) return p.y;
     return this.y;
  }

  public String toString() {
    return "("+ this.x +","+ this.y +")";
  }
}

