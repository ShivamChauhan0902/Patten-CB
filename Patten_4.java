package whileloop;
import java.util.*;
public class Patten_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner patt=new Scanner(System.in);
		int n =patt.nextInt();
		int row =1;
		int nsp=n-1;
		int nst=1;
		while(row<=n) {
			int i =1;
			while(i<=nsp) {
				System.out.print("  ");
				i=i+1;
			}
			int j=1;
			while(j<=nst) {
				System.out.print("* ");
				j=j+1;
			}
			
			
			nsp=nsp-1;
			nst=nst+1;
			row =row+1;
			System.out.println();
		}

	}

}
