package test;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class A {

	public static void main(String[] args) {
	
		Set<Integer>myData=new TreeSet<Integer>();
		
		System.out.println("How many number you want to print give me here: ");
		
		Scanner ui = new Scanner(System.in);
		
		int n = ui.nextInt();
	
		int[] ua = new int[n];
		System.out.println("Enter your those number: ");
		
		for(int i=0;i<n ;i++) {
			ua[i]=ui.nextInt();
			
			myData.add(ua[i]);
		}
		System.out.println("print data: "+ myData);
	}
}
