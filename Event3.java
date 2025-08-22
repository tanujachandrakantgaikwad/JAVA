import java.awt.*;
import java.awt.event.*;
class Login extends Frame implements ActionListener
{
    Label l1,l2,l3;
     TextField t1,t2,t3;
     Button b1,b2,b3;
 
  Login()
   {
      setVisible(true);
     setBackground(Color.red);
     setSize(400,400);
     setLocation(500,700);
     setLayout(new FlowLayout());
 
     l1=new Label("User Name");
     l2=new Label("Password");
     l3=new Label("Message");

      t1=new TextField(10);
      t2=new TextField(10);
      t3=new TextField(10);

     b1=new Button("Submit");
     b2=new Button("Clear");
     b3=new Button("Exit");
 
    add(l1);  add(t1); 
    add(l2);  add(t2);
    add(l3);  add(t3);
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
         String name=t1.getText();
         String pass=t2.getText();
          if (name.equals("admin") && pass.equals("123"))
            {
                t3.setText("Valid User");
            } 
         else
          {
               t3.setText("Invalid User");
            }
  }
  if(ae.getSource()==b1)
  {
       t1.setText(" ");
       t2.setText(" ");
  }
 if(ae.getSource()==b3)
  {
   dispose();     
  }

 }
public static void main(String args[])
{
   new Login();
}
}