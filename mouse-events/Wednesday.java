import javax.swing.JFrame; 

public class Wednesday {
  public static void main(String[] args) {
    JFrame a = new JFrame("Circles"); 
    // System.out.println( a ); 
    Screen s = new Screen(6); 
    a.add( s ); 
    a.setSize(600, 600); 
    a.setVisible(true); 
  }
}