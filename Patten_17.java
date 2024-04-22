package whileloop;

import java.util.Scanner;

public class Patten_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner patt = new Scanner(System.in);
		int n = patt.nextInt();
		int row = 1;
		int nst=n;
		int nsp=0;
		
		while(row<=n) {
			int i=1;
			while(i<=nst) {
				System.out.print("* ");
				i=i+1;
			}
			int j=1;
			while(j<=nsp) {
				System.out.print("  ");
				j=j+1;
			}
			int k=1;
			while(k<=nst) {
				System.out.print("* ");
				k=k+1;
			}
			
			if(row<n) {
				nst=nst-1;
				nsp=nsp+2;
			}else {
				nst=nst+1;
				nsp=nsp-2;
			}
			
			row=row+1;
			System.out.println();
		}

	}

}
