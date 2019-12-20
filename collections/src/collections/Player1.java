package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Player1 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
    System.out.println("Enter the no players");
    int n=sc.nextInt();
   ArrayList<String> list=new ArrayList<String>();
   for(String x:list) {
   System.out.println("Enter the player name");
   String pn=sc.nextLine();
   System.out.println("Enter the team name");
   String tn=sc.nextLine();
   System.out.println("Enter no of matchs played"); 
	}
   PlayerBO v=new 	PlayerBO();
   v.displayAllPlayerDetails(); 
	}
}
