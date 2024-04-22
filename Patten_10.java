package whileloop;

import java.util.Scanner;

public class Patten_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner patt = new Scanner(System.in);
		int n = patt.nextInt();
		int row = 1;
		int nst = (n*2)-1;
		int nsp = 0;
		while(row<=n){
			int i=1;
			while(i<=nsp) {
				System.out.print(" ");
				i=i+1;
			}
			int j=1;
			while(j<=nst) {
				System.out.print("*");
				j=j+1;
			}
		
		
		nsp=nsp+1;
		nst=nst-2;
		
		row=row+1;
		System.out.println();
		}

	}

}
