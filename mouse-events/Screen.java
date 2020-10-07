import javax.swing.JComponent; 
import java.awt.Graphics;
import java.awt.Color; 
import java.util.ArrayList;
import java.awt.event.MouseMotionListener; 
import java.awt.event.MouseEvent; 

public class Screen extends JComponent implements MouseMotionListener {
  public void mouseMoved(MouseEvent e) { } 
  public void mouseDragged(MouseEvent e) { 
    System.out.println( "(" + e.getX() + ", " + e.getY() + ")" );
  } 
  ArrayList<Circle> circles; // declaration  
  public Screen(int number) {
    this.addMouseMotionListener( this ); 
    this.circles = new ArrayList<Circle>(); // allocation 
    for (int i = 0; i < number; i++) {
      Circle c = new Circle((int)(Math.random() * 500) + 50,
                            (int)(Math.random() * 500) + 50, 
                            (int)(Math.random() *  80) + 40, 
                             new Color((int)(Math.random()*128 + 128), 
                                       (int)(Math.random()*128 + 128),
                                       (int)(Math.random()*128 + 128))); 
      this.circles.add( c ); // initialization of the array list one by one 
        
    }
  }  
  public void paintComponent(Graphics g) {
    for (Circle c : this.circles) 
      c.draw(g);
  }
}