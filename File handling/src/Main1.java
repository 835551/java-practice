import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		   
             FileOutputStream pv =new FileOutputStream("player.csv");    
             Scanner sc=new Scanner(System.in);  
             System.out.println("Enter the player name");
             String pn=sc.nextLine();
             System.out.println("Enter the team name ");
             String tn=sc.nextLine();
             System.out.println("Enter no of matchs played");
              int mc= sc.nextInt();
              byte a[]=pn.getBytes();
              byte b[]=tn.getBytes();
              
              pv.write(a);
              pv.write(b);
              pv.write(String.valueOf(mc).getBytes());
              pv.flush();
              pv.close();    
                 
            }

	}


