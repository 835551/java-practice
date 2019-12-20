import java.util.*;
class DayName	
{
   public static void main(String[] args) 
    { 
	String[] days ={"Sat","Sun","Mon","Tue","Wed","Thu","Fri"};
       Scanner var=new Scanner(System.in);
	   System.out.println("Enter the day number");
       int i=var.nextInt();
	   System.out.println(days[i]);
   }
}
