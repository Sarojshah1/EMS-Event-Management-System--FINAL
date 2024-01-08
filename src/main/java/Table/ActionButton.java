
package Table;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class ActionButton extends JButton {
    
    private boolean mousepress;
    private Color buttonColor = new Color(153, 255, 204);
    
    public ActionButton(){
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(10,20,10,20));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                mousepress = true;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                mousepress = false;
                repaint();
            }
        });
    }
    protected void paintComponent(Graphics graphics){
        Graphics2D g2 = (Graphics2D) graphics.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int width = getWidth();
        int height = getHeight();
        int size = Math.min(width, height);
        int x = (width - size) / 2;
        int y = (height - size) / 2;
        if (mousepress) {
            g2.setColor(new Color(158, 158, 158));
        } else {
            g2.setColor(new Color(199, 199, 199));
        }
        g2.setColor(buttonColor);
        g2.fillRect(x, y, size, size);
        g2.dispose();
        super.paintComponent(graphics);
    }
    public void setButtonColor(Color color) {
        buttonColor = color;
        repaint(); // Repaint the button to reflect the new color
    }
    
}
