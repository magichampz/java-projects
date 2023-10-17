import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main (String args[]) {
//        System.out.println("test");   //Displays to the screen

        Frame frame=new Frame("My window");
        Drawing drawing = new Drawing();
        frame.add(drawing);

        drawing.setSize(300,300);
        drawing.setBackground(Color.white);
        frame.setLayout(null);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });


    }

}
