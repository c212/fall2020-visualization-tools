import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color; 
import java.awt.Stroke;
import java.awt.BasicStroke;

public class Circle {
  int radius, x, y; 
  Color c;
  public Circle(int x, int y, int radius, Color c) {
    this.x = x; 
    this.y = y; 
    this.radius = radius; 
    this.c = c; 
  }
  public void draw(Graphics g) {
    Graphics2D g2 = (Graphics2D)g;
    float thickness = 10;
    g2.setStroke(new BasicStroke(thickness));
    g2.setColor(c);
    g2.drawOval(this.x, this.y, this.radius, this.radius); 
  }
}