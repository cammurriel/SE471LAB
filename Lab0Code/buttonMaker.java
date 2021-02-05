package Lab0Code;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class buttonMaker implements ActionListener {
    private JButton MainButton;

    boolean draw = false;
    String Resume = "Resume";
    String Stop = "Stop";
    public RunnableThread thread;



    public buttonMaker(RunnableThread t){
        thread = t;
        getMainButton().addActionListener(this::actionPerformed);
    }


    public JButton getMainButton(){
        return MainButton;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (!draw) {
            draw = true;
            MainButton.setText(Resume);
            thread.setStopped(true);

        }
         else {
            draw = false;
            MainButton.setText(Stop);
            thread.setStopped(false);
        }

}
}

/*

try {
                MainButton.addActionListener(actionEvent -> {
                    try {
                        MainButton.wait(300);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                });
            } catch (Exception a) {
            }
 */

//button to start the drawing of the lines in the thread

//have a variable that initializes the start portion

//button to stop the thread