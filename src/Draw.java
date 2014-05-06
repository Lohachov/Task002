import javax.swing.*;
import java.awt.*;
public class Draw {
   public static void main(String[] args) {
      MyFrame frame = new MyFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
class MyFrame extends JFrame {
   public MyFrame() {
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      PaintPanel panel=new PaintPanel();
      add(panel);
   }
   public static final int FRAME_WIDTH = 500;
   public static final int FRAME_HEIGHT = 400;
} 
class PaintPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent (g);
        g.drawString("Draw Rect:", 10, 20);
        g.drawRect(10, 40, 300, 100);
        g.drawString("Draw Oval:", 10, 160);
        g.drawOval(10, 180, 150, 150); 
    }
}