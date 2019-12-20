import java.util.*;
class RedCross4	
{
   public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int sum=0;
		for(int i=0;i<n;i++)
		{
		  a[i]=sc.nextInt();
		}
	      for(int x:a)
	    {
		    sum=sum+x;
	    }
	   System.out.println(sum);
}
}   