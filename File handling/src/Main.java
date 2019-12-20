import java.util.Scanner;
import java.io.FileInputStream;
public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Enter the file name");
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			FileInputStream fc=new FileInputStream("C:\\vasu\\File handling\\"+s);
			int i=0;
			while((i=fc.read())!=-1){
				System.out.print((char)i);
				}
			fc.close();
			}catch(Exception e) {System.out.println(e);}

	}
}

