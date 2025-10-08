package game;
public class Outdoor
{
      String gname;
         int pno;
    public  Outdoor()
    {
             gname="Kho-Kho";
              pno=10;
    }
    public Outdoor(String gname,int pno)
   {
       this.gname=gname;
       this.pno=pno;
   }
  public void disp()
  {
    System.out.println("game Name="+gname);
     System.out.println("no of player="+pno);

  }
}