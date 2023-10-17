import java.awt.*;

public class Circle {

    private int radius;
    private Point coords;
    private Color colour;

    public Circle(int radius, Point coords, Color colour){
        this.radius = radius;
        this.coords = coords;
        this.colour = colour;
    }

    public void draw(Graphics g){
        g.setColor(colour);
        g.fillOval(coords.x, coords.y, radius, radius);
    }
}
