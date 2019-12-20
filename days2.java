import java.util.*;
class DayName	
{
   public static void main(String[] args) 
    { 
	String[] days ={"Sat","Sun","Mon","Tue","Wed","Thu","Fri"};
       Scanner var=new Scanner(System.in);
	   System.out.println("Enter the day number");
       int x=Integer.parseInt(var.nextLine());
	   String[] day=new String[7] ;
	   day[0]="Sun";
	   day[1]="Mon";
	   day[2]="Tue";
	   day[3]="Wed";
	   day[4]="Thu";
	   day[5]="Fri";
       day[6]="Sat";
	   System.out.println("Day of the week is"+day[x]);
}
}
