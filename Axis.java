package week3.day1;

public abstract class Axis implements RBI {
	
	
	public abstract void axisrules();
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Axis ax = new Axis() {
			
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

			@Override
			public void axisrules() {
				// TODO Auto-generated method stub
				System.out.println("Axis bank ----> Axisrules");

				
			}
		};
		ax.money();
		ax.distribute();
		ax.RulestoFollow();
		ax.axisrules();
		
	}

}
