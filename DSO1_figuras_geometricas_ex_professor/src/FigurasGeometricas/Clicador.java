package FigurasGeometricas;

import java.awt.event.*;

class Clicador implements MouseListener {
    private Clicavel editor;
    Clicador(Clicavel editor) {
      this.editor = editor;
    }
    
    public void mouseClicked(MouseEvent e) {
     int x,y;
     x = e.getX();
     y = e.getY();
     System.out.println(new Ponto(x,y));
     editor.clique(x,y);
   }
   public void mousePressed(MouseEvent e) {}
   public void mouseReleased(MouseEvent e) {}
   public void mouseEntered(MouseEvent e) {}
   public void mouseExited(MouseEvent e) {}

}
