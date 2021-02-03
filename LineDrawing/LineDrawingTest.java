package LineDrawing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.BorderLayout.*;

public class LineDrawingTest {



    public static void main(String[] args) {
        JButton button = new JButton("hello");
        button.addActionListener(new ButtonAction());
        button.setBounds(100,0,100,50);

        //LinePanelButton b = new LinePanelButton();
        JFrame application = new JFrame();
        LiningPanel panel = new LiningPanel();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setTitle("Lining Art");
        application.setVisible(true);
        panel.add(button);
    }

}


/*
//RunnableThread run = new RunnableThread();
        // Thread thread = new Thread(run);
        //thread.start();
 */