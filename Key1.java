import  java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements KeyListener
{
   TextField t1;
  Demo()
  {
     setVisible(true);
     setSize(600,700);
     setLayout(new FlowLayout());
     setLocation(600,700);
     setBackground(Color.pink);
    t1=new TextField(20);
   add(t1);
   t1.addKeyListener(this);     
}
public void keyReleased(KeyEvent ke)
{
  t1.setText("key Released");
}
public void keyTyped(KeyEvent ke)
{
    t1.setText("key Typed");
}
public void keyPressed(KeyEvent ke)
{
   t1.setText("key Pressed");
}
   public static void main(String args[])
  {
     new Demo();
  }
}