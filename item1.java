import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ItemListener
{
   Label l1,l2;
  TextField t1;
  Checkbox c1,c2;
  CheckboxGroup cg;
   Demo()
   {
     setVisible(true);
     setSize(500,500);
     setLayout(new FlowLayout());
     setLocation(500,700);
     setBackground(Color.pink);
     l1=new Label("Select Gender");
     cg=new CheckboxGroup();
     c1=new Checkbox("Male",cg,true);
     c2=new Checkbox("Female",cg,false);
     l2=new Label("Display");
     t1=new TextField(10);
     add(l1); add(c1);
     add(c2);  add(l2);
     add(t1); 
     c1.addItemListener(this);
     c2.addItemListener(this);
     }
   public void itemStateChanged(ItemEvent ie)
    {
      if(c1.getState()==true)
        t1.setText("Male");
     if(c2.getState()==true)
        t1.setText("FeMale");
   }
  public static void main(String args[])
  {
     new Demo();
  }
}