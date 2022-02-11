import java.util.Scanner;

public class PolindromProgram {
	public static void main(String[] args) {
		int r, sum=0, temp;
		Scanner scan= new Scanner(System.in);
		System.out.println(("Please Enter a number"));
		int n= scan.nextInt();
	
		temp= n;
		while(n>0) {
			r= n%10;
			sum= (sum*10)+r;
			n=n/10;
			
		}
		if(temp==sum) {
			System.out.println(temp+ " is Polindrom number");
		}else
		{
			System.out.println(temp+ " is not a Polindrom number");
		}
		
		
	}

}
