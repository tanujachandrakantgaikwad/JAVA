import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
   Button b1;
   Label l1;
   Demo()
   {
     setVisible(true);
     setSize(500,500);
     setLocation(400,500);
     setLayout(new FlowLayout());

      l1=new Label("HI TANUJA"); 
       b1=new Button("ChangeColor");
         add(l1);
         add(b1);
    b1.addActionListener(this);
}
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    {
        l1.setBackground(Color.pink);
    }
  }
   public static void main(String args[])
   {
     new Demo();
}
}
