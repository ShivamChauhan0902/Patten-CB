package whileloop;

import java.util.Scanner;

public class Patten_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner patt = new Scanner(System.in);
		int n = patt.nextInt();
		int row =1;
		//observation of first row
		int nst = n;
		
		while(row<=n) {
			//work for star
			int i=1;
			while(i<=n) {
				System.out.print("*");
				i=i+1;
			}
			
			
			
			row =row + 1;
			System.out.println();
		}

	}

}
