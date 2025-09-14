import java.awt.*;
import java.applet.*;
public class ApDemo3  extends Applet
{
    public void paint(Graphics g)
   {
         g.setColor(Color.pink);
         g.fillRect(500,600,400,600);    
         g.drawLine(500,600,700,200);
         g.setColor(Color.orange);
         g.fillOval(600,370,200,200);
         g.drawLine(900,600,700,200);
         g.drawLine(700,200,700,40);
         g.drawLine(700,40,850,40);
         g.drawLine(850,40,800,70);
         g.drawLine(850,100,800,70);
         g.drawLine(700,100,850,100);
   }
}
/*
   <applet code="ApDemo3" width="200" height="200"></applet>
*/