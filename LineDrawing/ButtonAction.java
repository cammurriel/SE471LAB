package LineDrawing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction implements ActionListener {

    JButton button = new JButton("hello");
    //button.setBounds(100,0,100,50);

    @Override
    public void actionPerformed(ActionEvent e) {
         RunnableThread run = new RunnableThread();
         run.run();

    }
}
