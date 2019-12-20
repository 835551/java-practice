import java.util.*;
class RedCross	
{
   public static void main(String[] args) 
    { 
       Scanner var=new Scanner(System.in);
	   int n=var.nextInt();
	   int a[]=new int[n];
	   int i;
	   for( i=0;i<n;i++)
	   {
	   a[i]=var.nextInt();
	   }
	   int sum=0;
	   for(  i=0;i<n;i++)
	   {
	   sum=sum+a[i];
	   }
	   System.out.println(sum);
}
}