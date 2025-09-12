import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
   MenuBar mb;
   Menu file,edit,col,close;
   MenuItem open,ne,save,saveas,cut,copy,paste,red,pink,exit;
  Demo()
    {
       setVisible(true);
       setSize(500,500);
       setLayout(new FlowLayout());

       mb=new MenuBar();

      file=new Menu("File");
      edit=new Menu("Edit");
      col=new Menu("Color");
      close=new Menu("Close");
 
        open=new MenuItem("Open");
        ne=new MenuItem("New");
        save=new MenuItem("Save");
        saveas=new MenuItem("SaveAs");
        cut=new MenuItem("Cut");
        copy=new MenuItem("Copy");
        paste=new MenuItem("Paste");
        red=new MenuItem("Red");
       pink=new MenuItem("Pink");
       exit=new MenuItem("Exit");

         file.add(open);
         file.add(ne);
         file.add(save);
         file.add(saveas);

         edit.add(cut);
         edit.add(copy);
         edit.add(paste);

       col.add(red);
       col.add(pink);

     close.add(exit);
       mb.add(file);
        mb.add(edit);
        mb.add(col);
        mb.add(close);

      setMenuBar(mb);

     red.addActionListener(this);
     pink.addActionListener(this);
     exit.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
 {
         if(ae.getSource()==red)
      {
          setBackground(Color.red);
      }
          if(ae.getSource()==pink)
      {
          setBackground(Color.pink);
      }
         if(ae.getSource()==exit)
      {
          dispose();
      }

  }

  public static void main(String agrs[])
  {
     new Demo();
  }
}
