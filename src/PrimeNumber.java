import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int temp;
		boolean isPrime= true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter a number");
		
		int num= scan.nextInt();
		
	for (int i=2;i<=num/2; i++) {
		temp= num%i;
		if(temp==0) {
			
			isPrime=false;
			break;
			
		}
			
		}
	if (isPrime) {
		System.out.println( num +"  is Prime number");
		
	}else
	{ 
		System.out.println(num+ "  is not Prime number");
	}
		
	}
}
