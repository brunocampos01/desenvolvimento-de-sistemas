package FigurasGeometricas;

import javax.swing.*;
import java.awt.*;


class Main {

  public static void main(String[] fdfd) {
    JFrame f = new JFrame();
    Reprodutor quadro;
    quadro = new Reprodutor();
    f.setContentPane(quadro);

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(400,600);
    f.setVisible(true);
 
    quadro.addFig(
       new Retangulo(
           new Ponto(30,40),
           new Ponto(130,140)
       )
    );
    quadro.addFig(new Texto("ola!",200,100));

    //EditorCirculo editor;
    Clicavel editor;
    editor = new EditorCirculo(quadro);
    //quadro.addMouseListener(new Clicador(editor));

    editor = new EditorRetangulo(quadro);
    quadro.addMouseListener(new Clicador(editor));


    quadro.repaint();

  } 
  static void exemplo01() {
   Ponto p;
    p = new Ponto(3,4);
    System.out.println("p = " + p);
    voltinha(p);
    System.out.println("p = " + p);
    pulinho(p);
    System.out.println("p = " + p);
   
    Retangulo r;
    r = new Retangulo(p, new Ponto(4));
    System.out.println("r  = "+ r);
    r.deslocarX(-3);
    System.out.println("r  = "+ r);

    Circulo s;
    s = new Circulo(2,3,4);
    System.out.println("s  = "+ s);
    s.deslocarX(2);
    System.out.println("s  = "+ s);
  
    Ponto q;
    q = s;
    q.deslocarY(-2);//ok
    //q.ampliar(2);//nok


  }

  static void voltinha(Ponto a) {
    if (a == null) return;
    a.deslocarX(3);
    a.deslocarY(4);
    a.deslocarX(-3);
    a.deslocarY(-4);
  }
  static void pulinho(Ponto a) {
    if (a == null) return;
    a.deslocarY(3);
    a.deslocarX(3);
   }

}