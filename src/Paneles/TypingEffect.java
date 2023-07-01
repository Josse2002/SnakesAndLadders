package Paneles;

import javax.swing.Timer;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TypingEffect {

    private Timer typingTimer;
    private JLabel label;
    private String text;
    private int index;

    public TypingEffect(JLabel label, String text, int delay) {
        this.label = label;
        this.text = text;
        this.index = 0;

        typingTimer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < text.length()) {
                    label.setText(text.substring(0, index + 1));
                    index++;
                } else {
                    typingTimer.stop();
                }
            }
        });
    }

    public void start() {
        typingTimer.start();
    }

    public void stop() {
        typingTimer.stop();
    }
}
