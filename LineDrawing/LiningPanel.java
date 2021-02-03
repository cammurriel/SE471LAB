package LineDrawing;
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;

public class LiningPanel extends javax.swing.JPanel {

    Random rand = new Random();
    double lines = 15.0;
    int count = 1;

    public LiningPanel() {

    }

        public Color random_color(){
            //Color randomColor = rand.nextInt(256*256*256);
            /*float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            Color randomColor = new Color(r, g, b);
             */
            Color randomColor = new Color(rand.nextInt(256*256*256)); //rgb format
            return randomColor;
        }

   public void counter(){

        if (count > lines){
            count = 1;
        }

       count++;
    }




        public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();

        for(int i = 0; i < count; i++) {
            int w2 = (int) ((i / lines) * w);
            int h2 = (int) ((i / lines) * h);

            g.setColor(random_color());
            g.drawLine(w - w2, 0, 0, h2);
            g.setColor(random_color());
            g.drawLine(0, h2, w2, h);
            g.setColor(random_color());
            g.drawLine(w2, h, w, h - h2);
            g.setColor(random_color());
            g.drawLine(w, h - h2, w - w2, 0);

        }


        
    }
    
}
