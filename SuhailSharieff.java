import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * SuhailSharieff
 */
public class SuhailSharieff {

	public static void TOH(int n,int source,int destination,int auxillary){
		
		if(n==1){
			System.out.println("Move "+source+" to "+destination);return;
		}
			TOH(n-1, source, auxillary, destination);
			System.out.println("Move "+source+" to "+destination);
			TOH(n-1, auxillary, destination, source);
		
	}

	public static void main(String[] args) {
		//this is valid only if there r atleast 3 pegs
		for (int i = 1; i <= 3; i++) {
            System.out.print(" ".repeat(3 - i));
            System.out.println("*".repeat(2 * i - 1));
        }
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of discs:");
		int n=sc.nextInt();
		System.out.println("Enter the source peg number:");
		int source=sc.nextInt();
		System.out.println("Enter destination peg number:");
		int destination=sc.nextInt();
		System.out.println("Enter any one auxillary peg number:");
		int auxillary=sc.nextInt();
		TOH(n, source, destination, auxillary);

	}
}