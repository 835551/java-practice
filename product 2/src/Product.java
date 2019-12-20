import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the id number ");
	long dd=Long.parseLong(sc.nextLine());
    System.out.println("Enter the product name");
    String pName=sc.nextLine();
    System.out.println("Enter the suplier name");
    String sName=sc.nextLine();
    Product2 p= new Product2(dd,pName,sName);
	p.display();

	}

}
