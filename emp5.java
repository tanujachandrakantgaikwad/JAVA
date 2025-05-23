import java.util.*; 
class Emp
{
   int eno;
  String ename;
  float sal;
  void accept()
{
     Scanner sc=new Scanner(System.in);
     System.out.printf("enter emp no");
      eno=sc.nextInt();   
    System.out.printf("enter emp name");
      ename=sc.next();  
   System.out.printf("enter emp sal");
      sal=sc.nextFloat();   
}
static void sort(Emp ob[],int n)
{
     for(int i=0;i<n;i++)
       {
           for(int j=0;j<i;j++)
             {
                   if(ob[i].eno>ob[j].eno)
                        {
                           Emp t=ob[i];
                           ob[i]=ob[j];
                           ob[j]=t;
                       }
               }
      }
      for(int i=0;i<n;i++)
     System.out.println(ob[i].eno+"\t"+ob[i].ename+"\t"+ob[i].sal);
}
public static void main(String args[])
{
    Emp ob[]=new Emp[10];
   Scanner sc=new Scanner(System.in);
   System.out.printf("enter limit");
    int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
       ob[i]=new Emp();
       ob[i].accept();
   }
  sort(ob,n);
}
}
