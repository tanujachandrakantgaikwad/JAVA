import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
   Button b1;
   Panel p1;
   Label l1;
   Demo()
   {
     setVisible(true);
     setSize(500,500);
   setLocation(400,500);
     setLayout(new FlowLayout());
     b1=new Button("PrjectInfo");
         
     p1=new Panel();
     p1.setVisible(false);
     p1.setBackground(Color.pink);
     l1=new Label("PID=101 \n PName=CollegeProject \n Duration=2 ");     
     p1.add(l1);
     add(p1); 
     add(b1);
    b1.addActionListener(this);
}
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    {
     p1.setVisible(true);   
    }
  }
   public static void main(String args[])
   {
     new Demo();
}
}
