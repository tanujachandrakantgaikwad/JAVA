import java.awt.*;
class Demo extends Frame
{
   MenuBar mb;
   Menu file,edit,col,close;
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
 
        mb.add(file);
        mb.add(edit);
        mb.add(col);
        mb.add(close);

      setMenuBar(mb);
     }
  public static void main(String agrs[])
  {
     new Demo();
  }
}