import java.util.*;
class Discount
{
 public static void main(String...args)
 {  
    Scanner sc= new Scanner(System.in);
    System.out.println("Price of Item 1:");
    double x=sc.nextDouble();
    System.out.println("Price of Item 2: ");
    double y=sc.nextDouble();
	System.out.println("Discount in percentage: ");
    double z=sc.nextDouble();
    double total=x+y;
	System.out.printf("Total amount:$%.2f\n",total);
	double p=(total/z);
	double pp=total-p;
	System.out.printf("Discounted amount:$%.2f\n",pp);
	System.out.printf("Saved amount:$%.2f\n",p);
 }
}