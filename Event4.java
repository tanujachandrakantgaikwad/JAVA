import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
   Button b1,b2;
   Panel p1,p2; 
   Label l1,l2;
   Demo()
   {
     setVisible(true);
     setSize(500,500);
   setLocation(400,500);
     setLayout(new FlowLayout());
     b1=new Button("GetInfo");
     b2=new Button("GetCGPA");
     
     p1=new Panel();
     p1.setVisible(false);
     p1.setBackground(Color.pink);
     l1=new Label("Name=Ram \n Address=Shrirampur \n Class=TY");     
     p1.add(l1);
  
     p2=new Panel();
     p2.setVisible(false); 
     p2.setBackground(Color.yellow);
     l2=new Label("MArks=566 PEr=66 CGPA=8.9");     
     p2.add(l2);

     add(p1); add(p2);

     add(b1);
     add(b2);
b1.addActionListener(this);
b2.addActionListener(this);   
}
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    {
     p1.setVisible(true);
     p2.setVisible(false);     
    }

    if(ae.getSource()==b2)
    {
     p2.setVisible(true);
     p1.setVisible(false);
    }
  }
   public static void main(String args[])
   {
     new Demo();
}
}
