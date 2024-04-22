package whileloop;

import java.util.Scanner;

public class Patten_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner patt = new Scanner(System.in);
		int n = patt.nextInt();
		int row =1;
		int nst=n;
		while(row<=n) {
			
		//observation of first row
			int i=1;
			if(row==1 || row==n) {
				while(i<=n) {
					System.out.print("* ");
					i=i+1;
				}
			}else {
			while(i<=n) {
				if(i==1 || i==n) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
				i=i+1;
			}}
			
			row =row + 1;
			System.out.println();
		}

	}

}
