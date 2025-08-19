import java.awt.*;
class Demo extends Frame
{
    Label l1,l2;
    TextField t1,t2;
   Button b1,b2;
    Demo()
 {
    setVisible(true);
   setSize(299,783);
    setBackground(Color.pink);
   setTitle("Number Addition");
    setLocation(600,690);
   setLayout(new FlowLayout());
   l1=new Label("User Name:");  
   l2=new Label("Password:");
   
    t1=new TextField(7);
    t2=new TextField(7);
    b1=new Button("Login");
    b2=new Button("Clear");
    
  add(l1); add(t1);
  add(l2); add(t2);
  add(b1); add(b2); 
  }
   public static void main(String args[])
 {
   Demo ob=new Demo();
  }
}