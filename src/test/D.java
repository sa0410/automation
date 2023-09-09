package test;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class D {

	public static void main(String[] args) {
		
		System.out.println("give me somthing then i will give you your duplicate letter :)");
		
		Scanner ui=new Scanner (System.in);
		String a=ui.nextLine();
		
		char[] x = a.toCharArray();
		
		Set<Character>myData=new LinkedHashSet<Character>();
		
		Set<Character>myResult=new LinkedHashSet<Character>();
		
		for( char item : x ) {
			if(!myData.add(item)) {
				myResult.add(item);
			}	
			
		}
		
		System.out.println("Duplicate letter: "+myResult);

	}

}
