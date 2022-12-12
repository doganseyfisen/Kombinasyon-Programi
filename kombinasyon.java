import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int n, r;
		int totN = 1;
		int totR = 1;
		int totNR = 1;
		int comb;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		n = input.nextInt();
		System.out.print("Enter r: ");
		r = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			totN *= i;
		}
		System.out.println(n + "'s factorial: " + totN);
		
		for(int i = 1; i <= r; i++) {
			totR *= i;
		}
		System.out.println(r + "'s factorial: " + totR);

		for(int i = 1; i <= (n-r); i++) {
			totNR *= i;
		}
		System.out.println((n-r) + "'s factorial: " + totNR);
		
		comb = (totN) / (totR * (totNR));
		
		System.out.println("C(n,r): " + comb);
	}	
}		
