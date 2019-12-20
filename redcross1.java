import java.util.*;
class RedCross1	
{
   public static void main(String[] args) 
    { 
	
       Scanner var=new Scanner(System.in);
	   int n=var.nextInt();
	   int a[]=new int[n];
	   int i=0,sum=0;
	   while(i<n)
	   {
	   a[i]=var.nextInt();
	   sum=sum+a[i];
	   i++;
	   }
	   System.out.println(sum);
}
}