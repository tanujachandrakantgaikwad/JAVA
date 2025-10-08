package game;
public class Indoor
{
      String gname;
         int pno;
    public Indoor()
    {
       gname="ludo";
       pno=2;
    }
    public Indoor(String gname,int pno)
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