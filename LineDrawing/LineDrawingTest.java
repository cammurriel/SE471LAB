package LineDrawing;
import javax.swing.*;
import java.awt.*;


public class LineDrawingTest {


    public static void main(String[] args) {


        LiningPanel panel = new LiningPanel();
        RunnableThread run = new RunnableThread(panel);
        buttonMaker button = new buttonMaker(run);
        button.getMainButton();

        JFrame application = new JFrame();
        JPanel buttonPanel = new JPanel();
        JPanel drawPanel = new JPanel();




        Thread thread = new Thread(run);


        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.add(button.getMainButton());
        application.getContentPane().add(buttonPanel, "North");   //puts button panel to top of JFrame

        drawPanel.setLayout(new BorderLayout());
        drawPanel.add(panel);

        application.getContentPane().add(drawPanel);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.setSize(300, 300);
        application.setTitle("Lining Art");
        application.setVisible(true);



      thread.start();

    }

}

