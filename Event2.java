import java.awt.*;
import java.awt.event.*;
class Circle extends Frame implements ActionListener
{
    Label l1,l2;
     TextField t1,t2;
     Button b1,b2;
 
   Circle()
   {
      setVisible(true);
     setBackground(Color.red);
     setSize(400,400);
     setLocation(500,700);
     setLayout(new FlowLayout());
 
     l1=new Label("Enter A Redius");
     l2=new Label("Area");

     t1=new TextField(10);
     t2=new TextField(10);

     b1=new Button("Circle");
     b2=new Button("Exit");
 
    add(l1);  add(t1); 
    add(l2);  add(t2);
    add(b1);  add(b2);
       
 b1.addActionListener(this);  
 b2.addActionListener(this);  

}
public void actionPerformed(ActionEvent ae)
 {
   if(ae.getSource()==b1)
  {
     double r=Integer.parseInt(t1.getText());
    double s=3.14f*r*r;
    t2.setText(""+s);
  }
 if(ae.getSource()==b2)
  {
   dispose();     
  }

 }
public static void main(String args[])
{
   new Circle();
}
}