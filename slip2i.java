import java.awt.*;
import java.awt.event.*;

class Demo extends Frame implements MouseListener
 {
    TextField t1;

    Demo() {
        t1 = new TextField();
        t1.setBounds(50, 50, 200, 30);
        add(t1);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        t1.addMouseListener(this);
}
    public void mouseClicked(MouseEvent e)
 {
        t1.setText("Clicked at: " + e.getX() + ", " + e.getY());
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String args[]) {
        new Demo();
    }
}
