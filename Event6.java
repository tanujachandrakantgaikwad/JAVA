import java.awt.*;
import java.awt.event.*;
class Demo extends Frame
{
    Label l1;
     Demo()
       {
           setVisible(true);
           setSize(400,500);
           setLayout(new FlowLayout());
           setLocation(500,500);
           setBackground(Color.red);
           l1=new Label("HELLO WORLD");
            l1.setForeground(Color.blue);
           add(l1);
           Font f1=new Font("time new roman",Font.BOLD,42);
          l1.setFont(f1);        
}
 public static void main(String args[])
  {
    Demo ob=new Demo();
  }
}