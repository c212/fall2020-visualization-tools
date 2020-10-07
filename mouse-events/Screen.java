import javax.swing.JComponent; 
import java.awt.Graphics;
import java.awt.Color; 

public class Screen extends JComponent {
  
  Circle c = new Circle(100, 100, 80, Color.BLUE); 
  
  public void paintComponent(Graphics g) {
    this.c.draw(g); 
  }
}