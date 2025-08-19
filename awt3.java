import java.awt.*;
class Demo extends Frame
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
   Button b1,b2;
    Demo()
 {
    setVisible(true);
   setSize(299,783);
    setBackground(Color.pink);
   setTitle("Number Addition");
    setLocation(600,690);
   setLayout(new FlowLayout());
   l1=new Label("First Number:");  
   l2=new Label("Second Number:");
   l3=new Label("result:");
    t1=new TextField(10);
    t2=new TextField(10);
    t3=new TextField(10);
    b1=new Button("Add");
     b2=new Button("Clear");

  add(l1); add(t1);
  add(l2); add(t2);
  add(l3); add(t3);
  add(b1); add(b2);

  }
   public static void main(String args[])
 {
   Demo ob=new Demo();
  }
}