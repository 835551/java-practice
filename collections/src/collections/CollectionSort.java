package collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class CollectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer>list=new ArrayList<Integer>(n);
          for(int i=0;i<n;i++)
          {
        	list.add(sc.nextInt());
          }
        Collections.sort(list);
         for(int x:list)
           {
    	  System.out.println(x);
           }

	   }
}
