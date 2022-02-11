
public class ArmStrongNumber {
	public static void main(String[] args) {
		
		int number= 254, n, temp=0, total=0, digit=0 ;
		n= number;
		while(n>0) {
			n=n/10;
			digit++;
			
		}
		n= number;
		while(n!=0) {
			temp= n%10;
			total= (int) (total+(Math.pow(temp, digit)));
			//total= total+temp*temp*temp*temp;
			n= n/10;
		}
		if (total==number) {
			System.out.println("Armstrong number");
		}
			else {
				System.out.println(("Not armstrong number"));
			}
		}
			
	}


