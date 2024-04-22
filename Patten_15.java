package whileloop;

import java.util.Scanner;

public class Patten_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner patt = new Scanner(System.in);
		int n = patt.nextInt();
		int row = 1;
		int nsp=0;
		int nst=n;
		while(row<=(n*2)-1){
			int i=1;
			while(i<=nsp) {
				System.out.print("  ");
				i=i+1;
			}
			int j=1;
			while(j<=nst) {
				System.out.print("* ");
				j=j+1;
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
