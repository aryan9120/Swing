import java.applet.Applet;
import java.awt.Graphics;

public class first extends Applet {
    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        String msg = "";

        // Corrected the syntax for getting parameter values
        x = Integer.parseInt(getParameter("Position"));
        y = Integer.parseInt(getParameter("yPosition"));
        msg = getParameter("msg");

        // Corrected the method name to drawString (uppercase 'S')
        g.drawString(msg, x, y);
    }
}
