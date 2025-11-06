import java.applet.*;
import java.awt.*;

/*
<applet code="GraphicsDemo" width="400" height="400"></applet>
*/

public class GraphicsDemo extends Applet {
    public void paint(Graphics g) {

        g.setColor(Color.red);
        g.drawLine(20, 30, 200, 30);      // draw line

        g.setColor(Color.blue);
        g.drawRect(40, 50, 100, 60);      // draw rectangle

        g.setColor(Color.green);
        g.drawOval(160, 50, 80, 60);      // draw oval

        g.setColor(Color.black);
        g.drawString("Graphics Demo", 80, 150); // draw text
    }
}
