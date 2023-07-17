package set_bit;

import java.util.Scanner;

/*
 * You are given two integers A and B.
Set the A-th bit and B-th bit in 0, and return output in decimal Number System.
 */

public class Set_Bit {

	private static void set_bit(int a, int b) {
		
		int ans=0;
		ans=ans|1<<a;		// | is similar to addition and left shift makes the number to 2^n
		ans=ans|1<<b;		// Then, we add those 2, similar to find the Math.power and addition those
		System.out.println(ans);
		
		
	}
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		set_bit(a,b);
	}

	

}
/*
  Input
	A = 3
	B = 5

  Output
	40
	
  Input
	A = 4
	B = 4

  Output
	16
*/
