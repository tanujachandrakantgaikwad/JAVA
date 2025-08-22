import java.awt.*;
import java.awt.event.*;
class Square extends Frame implements ActionListener
{
    Label l1,l2;
     TextField t1,t2;
     Button b1,b2,b3;
 
   Square()\

   {
      setVisible(true);
     setBackground(Color.red);
     setSize(400,400);
     setLocation(500,700);
     setLayout(new FlowLayout());
 
     l1=new Label("Enter A NUmber");
     l2=new Label("Result");

     t1=new TextField(10);
     t2=new TextField(10);

     b1=new Button("Square");
     b2=new Button("Cube");
     b3=new Button("Exit");

    add(l1);  add(t1); 
    add(l2);  add(t2);
    add(b1);  add(b2);
    add(b3);   
 b1.addActionListener(this);  
 b2.addActionListener(this);  
 b3.addActionListener(this);  

}
public void actionPerformed(ActionEvent ae)
 {
   if(ae.getSource()==b1)
  {
     int n=Integer.parseInt(t1.getText());
    int s=n*n;
    t2.setText(""+s);
  }
  if(ae.getSource()==b2)
  {
     int n=Integer.parseInt(t1.getText());
    int s1=n*n*n;
    t2.setText(""+s1);
  }
if(ae.getSource()==b3)
  {
   dispose();     
  }

 }
public static void main(String args[])
{
   new Square();
}
}