import javax.swing.JComponent; 
import java.awt.Graphics;
import java.awt.Color; 
import java.util.ArrayList;

public class Screen extends JComponent {
  ArrayList<Circle> circles; // declaration  
  public Screen(int number) {
    this.circles = new ArrayList<Circle>(); // allocation 
    for (int i = 0; i < number; i++) {
      Circle c = new Circle((int)(Math.random() * 500) + 50,
                            (int)(Math.random() * 500) + 50, 
                            (int)(Math.random() * 100) + 20, 
                             new Color((int)(Math.random()*256), 
                                       (int)(Math.random()*256),
                                       (int)(Math.random()*256))); 
      this.circles.add( c ); // initialization of the array list one by one 
        
    }
  }  
  public void paintComponent(Graphics g) {
    for (Circle c : this.circles) 
      c.draw(g);
  }
}