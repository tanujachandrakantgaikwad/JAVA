import java.awt.*;
import java.awt.event.*;
class Demo extends Frame  implements ActionListener
{
  Label l1,l2;
  TextField t1;
  Button b1,b2;
  TextArea ta;
  Demo()
  {
     setVisible(true);
     setSize(500,500);
     setLayout(new FlowLayout());
     l1=new Label("Enter Sentences:");
     l2=new Label("Result:");
     t1=new TextField(40);
     ta=new TextArea();
     b1=new Button("OK");
     b2=new Button("Exit");
     add(l1); add(t1);
     add(l2); add(ta);
     add(b1);add(b2);
   b1.addActionListener(this);
   b2.addActionListener(this);
  }
public void actionPerformed(ActionEvent ae)
 {
   if(ae.getSource()==b1)
   {
     String s1=t1.getText();
     String s2[]=s1.split(" ");
     for(int i=0;i<s2.length;i++)
     {
        ta.append(s2[i]+"\n");
     }
   }
   if(ae.getSource()==b2)
   {
     dispose();
   }
 }
  public static void main(String args[])
  {
    new Demo();
}
}