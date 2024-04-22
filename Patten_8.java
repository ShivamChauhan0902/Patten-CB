package whileloop;

import java.util.Scanner;

public class Patten_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner patt = new Scanner(System.in);
		int n = patt.nextInt();
		int row = 1;
		int nst=1;
		int nsp=n-2;
		int fnsp=0;
		
		while(row<=n) {
			int l=1;
			while(l<=fnsp) {
				System.out.print(" ");
				l=l+1;
			}
			int i=1;
			while(i<=nst) {
				System.out.print("*");
				i=i+1;
			}
			int j=1;
			while(j<=nsp) {
				System.out.print(" ");
				j=j+1;
			}
			int k=1;
			while(k<=nst) {
				System.out.print("*");
				k=k+1;
			}
			
			if(row<(n+1)/2) {
				fnsp=fnsp+1;
				nsp=nsp+1;
			}else {
				fnsp=fnsp-1;
				nsp=nsp-1;
			}
			
			row=row+1;
			System.out.println();
		}

	}

}
