import java.awt.*;
import java.applet.*;
public class ApDemo2  extends Applet
{
    public void paint(Graphics g)
   {
       g.drawString("HI I AM TANUJA",100,100);
       g.setColor(Color.pink);
       g.fillRect(60,200,100,200);
       g.drawRect(200,100,250,100);
       g.drawOval(250,250,50,50);
      }
}
/*
   <applet code="ApDemo2" width="200" height="200"></applet>
*/