import  java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements FocusListener
{
   TextField t1,t2,t3;
  Demo()
  {
     setVisible(true);
     setSize(600,700);
     setLayout(new FlowLayout());
     setLocation(600,700);
     setBackground(Color.pink);
     t1=new TextField(10);
     t2=new TextField(10);
     t3=new TextField(10);
     add(t1); add(t2); add(t3);
     t1.addFocusListener(this);
     t2.addFocusListener(this);
     t3.addFocusListener(this);
  }
  public void focusLost(FocusEvent fe)
  {
     if(fe.getSource()==t1)
        t1.setBackground(Color.orange);
    if(fe.getSource()==t2)
        t2.setBackground(Color.orange);
    if(fe.getSource()==t3)
        t3.setBackground(Color.orange);
  }
 public void focusGained(FocusEvent fe)
  {
    if(fe.getSource()==t1)
        t1.setBackground(Color.red);
    if(fe.getSource()==t2)
        t2.setBackground(Color.red);
    if(fe.getSource()==t3)
        t3.setBackground(Color.red);
  }
  public static void main(String args[])
  {
     new Demo();
  }
}