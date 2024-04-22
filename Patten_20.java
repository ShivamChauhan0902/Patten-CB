package whileloop;

import java.util.Scanner;

public class Patten_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner patt = new Scanner(System.in);
		int n = patt.nextInt();
		int row = 1;
		int nst=1;
		int nsp=n-1;
		while(row<=n) {
			int i=1;
			while(i<=nsp) {
				System.out.print("  ");
				i=i+1;
			}
			int j=1;
			while(j<=nst) {
				if(j==1 || j==nst) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
				j=j+1;
			}
			
			if(row < (n+1)/2) {
			nst=nst+2;
			nsp=nsp-1;
			}else {
				nst=nst-2;
				nsp=nsp+1;
			}
			
			row=row+1;
			System.out.println();
		}

	}

}
