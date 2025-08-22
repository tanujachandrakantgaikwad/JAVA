import java.awt.*;
import java.awt.event.*;
class Addition extends Frame implements ActionListener 
{
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2;

    Addition()
    {
        setVisible(true);
        setSize(300, 400);
        setBackground(Color.pink);
        setLayout(new GridLayout(4, 2));
      setLocation(455,611);
       
        l1 = new Label("Enter No 1"); 
        l2 = new Label("Enter No 2"); 
        l3 = new Label("Result");
  
        t1 = new TextField(7);   
        t2 = new TextField(7);   
        t3 = new TextField(6);  
      
        b1 = new Button("Add"); 
        b2 = new Button("Exit");

        add(l1);  add(t1);
        add(l2);  add(t2);
        add(l3);  add(t3);
        add(b1);  add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a + b;
            t3.setText("" + c);
        }
        if(ae.getSource() == b2)
        {
            dispose(); 
        } 
    }

    public static void main(String args[])
    {
        new Addition();
    }
}
