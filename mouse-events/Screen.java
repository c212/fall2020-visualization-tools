import javax.swing.JComponent; 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color; 
import java.awt.Stroke;
import java.awt.BasicStroke;

public class Screen extends JComponent {
  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D)g;
    float thickness = 10;
    g2.setStroke(new BasicStroke(thickness));
    g2.setColor(Color.BLACK);
    g2.drawOval(50, 100, 80, 80);
  }
}