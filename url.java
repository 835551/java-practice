import java.util.*;
class Url	
{
   public static void main(String[] args) 
    { 
       Scanner var=new Scanner(System.in);
	   System.out.println("Enter the string");
       String str=var.nextLine();
	   System.out.println("Enter the starting string");
       String str1=var.nextLine();   
	  if(str.startsWith(str1))
	  {
	   System.out.println( str+" start with https ");
	  }
	  else
	  {
	   System.out.println(var+" does not start with https ");  
	  }
   }
}
