import java.awt.*;
class Demo extends Frame
{
    Label l1,l2,l3,l4,l5;
    TextField t1,t2,t3,t4,t5;
   Button b1,b2,b3;
    Demo()
 {
    setVisible(true);
   setSize(299,783);
    setBackground(Color.pink);
   setTitle("Number Addition");
    setLocation(600,690);
   setLayout(new FlowLayout());
   l1=new Label("Principle Amount:");  
   l2=new Label("Intrest Rate (%):");
   l3=new Label("Time(yrs)");
   l4=new Label("Total Amount");
   l5=new Label("Intrest Amount");

    t1=new TextField(15);
    t2=new TextField(3);
    t3=new TextField(5);
     t4=new TextField(10);
     t5=new TextField(12);
    b1=new Button("Calcualte");
    b2=new Button("Clear");
    b3=new Button("Close");

  add(l1); add(t1);
  add(l2); add(t2);
  add(l3); add(t3);
  add(l4); add(t4);
  add(l5); add(t5);
  add(b1); add(b2); add(b3);

  }
   public static void main(String args[])
 {
   Demo ob=new Demo();
  }
}