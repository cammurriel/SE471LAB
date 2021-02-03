package LineDrawing;
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;

public class LiningPanel extends javax.swing.JPanel {

    Random rand = new Random();

    public LiningPanel() {

    }

        public Color random_color(){
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            Color randomColor = new Color(r, g, b);
            return randomColor;
        }
        public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();
        
        double lines = 15.0;

        for(int i = 0; i < lines; i++)
        {

            int w2 = (int)((i/lines)*w);
            int h2 = (int)((i/lines)*h);
            g.setColor(random_color());
            g.drawLine(0,  h2, w2, h);

            g.setColor(random_color());
            g.drawLine(w,h2,w-w2,h);
            g.setColor(random_color());
            g.drawLine(w,h-h2,w-w2,0);
            g.setColor(random_color());
            g.drawLine(0,h-h2,w2,0);
        }
        
    }
    
}
