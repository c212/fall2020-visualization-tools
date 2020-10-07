import javax.swing.JFrame; 

public class Wednesday {
  public static void main(String[] args) {
    JFrame a = new JFrame("Circles"); 
    // System.out.println( a ); 
    a.add( new Screen(6) ); 
    a.setSize(600, 600); 
    a.setVisible(true); 
  }
}