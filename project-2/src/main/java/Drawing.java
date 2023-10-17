import java.awt.*;

public class Drawing extends Canvas {

    Circle circle = new Circle(50, new Point(100,100), Color.red );
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(0, 0, 100, 100);
        circle.draw(g);
    }



}
