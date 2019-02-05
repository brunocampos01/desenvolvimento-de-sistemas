package FigurasGeometricas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Reprodutor extends JPanel {
  private Reproduzivel[] fig = new Reproduzivel[500];
  private int k = 0;//prox slot livre

  void addFig(Reproduzivel fig) {
     this.fig[k++] = fig;
  }

  public void paintComponent(Graphics g) {
     super.paintComponent(g);
     for(int i = 0; i < k; i++) {
         fig[i].reproduzir(g);//aqui eh onde aquele que sabe desenhar vai desenha o quadradinho
     }
  }

}//