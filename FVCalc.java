// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currValue = Integer.parseInt(args[0]);
		double interestRate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		int futureValue = (int) (currValue * Math.pow(1 + interestRate / 100.0, years));
		System.out.println("After " + years + " years, $" + currValue + " saved at " + interestRate + "% will yield $" + futureValue);
		//After 25 years, $25000 saved at 6.0% will yield $107296
	}
}