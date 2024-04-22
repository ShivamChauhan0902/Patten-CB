package whileloop;

import java.util.Scanner;

public class Patten_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner patt = new Scanner(System.in);
		int n = patt.nextInt();
		int row = 1;
		int num=1;
		int nsp=n-1;
		
		while(row<=n) {
			int i=1;
			while(i<=nsp) {
				System.out.print(" \t");
				i=i+1;
			}
			int j=1;
			int count=1;
			while(j<=num) {
				System.out.print(count+"\t");
				count=count+1;
				j=j+1;
			}
			
			num=num+2;
			nsp=nsp-1;
			
			row=row+1;
			System.out.println();
		}

	}

}
