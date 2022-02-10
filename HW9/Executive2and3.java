//Zaid Abu Jumaiza - CS113-004

public class Executive2and3 extends Employee2and3{

	private double bonus;

	public Executive2and3(String N, String A, String P, String soc, double r) {
		
		super(N, A, P, soc, r);
		bonus = 0;
	}


	public void awardBonus(double execBonus) throws BonusTooLowException {

		if (execBonus < 1000) {
			throw new BonusTooLowException("Entered bonus should be greater than 1000.");
		}
		bonus = execBonus;
	}

	public double getBonus() {
		return bonus;
	}

	public double pay() {
		
		double payment = super.pay() + bonus;
		bonus = 0;
		return payment;

	}

}
