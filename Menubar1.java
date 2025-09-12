import java.awt.*;
class Demo extends Frame
{
   MenuBar mb;
   Menu file,edit,col,close;
   MenuItem open,ne,save,saveas,cut,copy,paste,red,pink;
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
    
         file.add(open);
         file.add(ne);
         file.add(save);
         file.add(saveas);

         edit.add(cut);
         edit.add(copy);
         edit.add(paste);

       col.add(red);
       col.add(pink);

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