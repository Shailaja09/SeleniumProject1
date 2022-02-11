
public class RandomValue {
	public static void main(String[] args) {
		System.out.println("Random Number"+ Math.random());
		// random number between Min and Max value
		int min=200;
		int max= 400;
		System.out.println("Random value between"+ min + " and"+ max+ "Value");
		double randValue= Math.random()*(max-min+1)+min;
		System.out.println(randValue);
	}

}
