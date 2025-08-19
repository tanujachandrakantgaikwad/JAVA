import java.awt.*;
class Demo extends Frame
{
    Label l1;
    Checkbox t1,t2,t3,t4,t5;
   Button b1;
    Demo()
 {
    setVisible(true);
   setSize(299,783);
    setBackground(Color.pink);
   setTitle("Number Addition");
    setLocation(600,690);
   setLayout(new GridLayout());
   l1=new Label("SELECT SUBJECT:");  
     
    t1=new Checkbox("PHP");
    t2=new Checkbox("JAVA");
    t3=new Checkbox("Cyber Security");
    t4=new Checkbox("DBMS");
    t5=new Checkbox("RDBMS");
       b1=new Button("OK");
    
  add(l1); add(t1);
  add(t2); add(t3);
  add(t4); add(t5);
  add(b1);  
  }
   public static void main(String args[])
 {
   Demo ob=new Demo();
  }
}