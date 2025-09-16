import java.applet.*;
import java.awt.*;
public class App extends Applet
{
  Label l1,l2,l3;
  TextField t1,t2,t3;
  Button b1,b2;
  public void init()
  {
     l1=new Label("Enter no1:");
     l2=new Label("Enter no2:");     
     l3=new Label("Result:");
     t1=new TextField(10);
     t2=new TextField(10);
     t3=new TextField(10);
     b1=new Button("Add");
     b2=new Button("Exit");
     add(l1); add(t1);
     add(l2); add(t2);
     add(l3); add(t3);
     add(b1);add(b2);
  }
}

/*
 <applet code="App " width="500" height="500"></applet>
*/