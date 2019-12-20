import java.util.*;
class ProfitAndLoss
{
 public static void main(String...args)
 {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of dozens of toys purchased ");
    int x=sc.nextInt();
    System.out.println("Enter the price per dozen ");
    int y=sc.nextInt();
    System.out.println("Enter the selling price of 1 toy");
    int z=sc.nextInt();
    double cp=y/12;
	double p=(z-cp);
	double pp=(p/cp)*100;
	System.out.println("Sam's profit percentage is"+pp+" percent ");
 }
}