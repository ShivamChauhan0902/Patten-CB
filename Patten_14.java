package whileloop;

import java.util.Scanner;

public class Patten_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner patt = new Scanner(System.in);
		int n = patt.nextInt();
		int row = 1;
		int nst =1;
		int nsp=n-1;
		while(row<=(n*2)-1){
			int j=1;
			while(j<=nsp) {
				System.out.print(" ");
				j=j+1;
			}
			int i=1;
			while(i<=nst) {
			System.out.print("*");
			i=i+1;
			}
		if(row<n) {
			nst=nst+1;
			nsp=nsp-1;
		}else {
			nst=nst-1;
			nsp=nsp+1;
		}
		
		
		
		row=row+1;
		System.out.println();
		}

	}

}
