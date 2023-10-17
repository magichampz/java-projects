import java.awt.*;

public class Drawing extends Canvas {

    Circle circle = new Circle(50, new Point(100,100), Color.green );
    Rect rect = new Rect(70,30,new Point(40,40), Color.blue);
    Square square = new Square(70,30,new Point(150,150), Color.red);
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(0, 0, 100, 100);
        circle.draw(g);
        rect.draw(g);
        square.draw(g);
    }



}
