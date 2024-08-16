package UserInterface.CustomizedComponents;

import java.awt.*;
import javax.swing.*;

public class TCRoundButton extends JButton {

    public TCRoundButton(String label) {
        super(label);
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (getModel().isArmed()) {
            g2.setColor(Color.lightGray);
        } else {
            g2.setColor(getBackground());
        }
        g2.fillOval(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawOval(0, 0, getWidth() - 1, getHeight() - 1);
    }

    @Override
    public boolean contains(int x, int y) {
        int radius = getWidth() / 2;
        return (Math.pow(x - radius, 2) + Math.pow(y - radius, 2)) <= Math.pow(radius, 2);
    }
}

