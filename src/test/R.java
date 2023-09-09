package test;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class R {

	public static void main(String[] args) {
		//Set<Integer> myData=new LinkedHashSet<Integer> (); //Random give the number
		Set<Integer> myData=new TreeSet<Integer> ();
		
		System.out.println("*****************Here showing 20 random number****************");
		System.out.println("if you want to see N^th position of small number give me bellow ");
		System.out.println("===============================================================");
		System.out.println();
		
		while(myData.size()<20) {
			myData.add(getRandomnumber());
		}
		

		Object[] x = myData.toArray();
		System.out.println("Total Random number: "+myData.size());
		System.out.println("Here random number: "+myData);
		System.out.print("which small N^th you want: ");
		
		Scanner ui=new Scanner(System.in);
		int n = ui.nextInt();
		System.out.print("Smallest number: "+ x[n-1]);
	}

		public static int getRandomnumber() {
			Random random=new Random();	
				int randomnumber=random.nextInt(50)+10 ;
				return randomnumber;
			}
	   
	}

