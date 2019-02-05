package FigurasGeometricas;

import java.awt.*;

class Retangulo implements Reproduzivel {
  private Ponto a,b;
  Retangulo(Ponto a, Ponto b) {
     this.a = a;
     this.b = b;
  }
  
  void deslocarX(int val){
    a.deslocarX(val);
    b.deslocarX(val);
  }
  
  void deslocarY(int val){
    a.deslocarY(val);
    b.deslocarY(val);
  }
  
  int largura() {
    return Math.abs(a.diferencaX(b));
    //
    //nao eh legal, cf. aula
    //return Math.abs(a.distanciaX(new Ponto(0,0))-b.distanciaX(new Ponto(0,0)));    
  }
  
  int altura() {
    return Math.abs(a.diferencaY(b));
  }
  
  int x0() {
    return a.x0(b);
  }
  
  int y0() {
    return a.y0(b);
  }

  public void reproduzir(Graphics g) {
     g.drawRect(x0(),y0(),largura(),altura());
  }

  public String toString() {
    return "Retangulo("+ this.a +","+ this.b +")"; 
  }
}