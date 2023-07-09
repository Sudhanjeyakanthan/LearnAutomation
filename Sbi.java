package week3.day1;

public class Sbi implements RBI {

	@Override
	public void money() {
		// TODO Auto-generated method stub
		System.out.println("Implemented from RBI");
	}

	@Override
	public void distribute() {
		// TODO Auto-generated method stub
		System.out.println("Implemented from RBI");
	}

	@Override
	public void RulestoFollow() {
		// TODO Auto-generated method stub

		System.out.println("Implemented from RBI");
	}

	public void GoldLoad() {
		System.out.println("SBI Goldload");

	}

	public static void main(String[] args) {

	Sbi sbi = new Sbi();
	sbi.money();
	sbi.distribute();
	sbi.RulestoFollow();
	sbi.GoldLoad();
	
	}
}
