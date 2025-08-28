import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
   Button b1,b2,b3;
   TextField t1,t2,t3; 
   Label l1,l2,l3;
   Demo()
   {
     setVisible(true);
     setSize(500,500);
     setLayout(new FlowLayout());
    setLocation(500,500);
     l1=new Label("UserName:");
     l2=new Label("Password:");
     l3=new Label("Message:");
     t1=new TextField(10);
     t2=new TextField(10);
     t3=new TextField(10);
     b1=new Button("Submit");
     b2=new Button("clear");
     b3=new Button("Exit");
     add(l1); add(t1);
     add(l2); add(t2);
     add(l3); add(t3);
     add(b1); add(b2); add(b3);
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
     if(name.equals("Tanuja")&&pass.equals("tanu"))
       {
         t3.setText("Valid");
       }
      else
        {
         t3.setText("InValid");
       }
    }
    if(ae.getSource()==b2)
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
     new Demo();
   }
}