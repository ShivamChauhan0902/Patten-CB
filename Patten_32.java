package whileloop;

import java.util.Scanner;

public class Patten_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner patt = new Scanner(System.in);
		int n = patt.nextInt();
		int row = 1;
		int nst =1;
		while(row<=(n*2)-1){
			int i=1;
			int count=row;
			while(i<=nst) {
				if(i%2==0) {
				System.out.print("* ");
				}else {
			System.out.print(count+" ");
				}
				if(row<n) {
					count=count+1;
				}else {
					count=count-1;
				
			i=i+1;
			}
			
			}
		if(row<n) {
			nst=nst+2;
			
		}else {
			nst=nst-2;
			
		}
		
		
		
		row=row+1;
		System.out.println();
		}

	}

}
