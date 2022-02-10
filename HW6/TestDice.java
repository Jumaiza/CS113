//Zaid Abu Jumaiza - CS113004

public class TestDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Die[] Dies = new Die[50];
		
		int count = 0;
		
		for (int i = 0;i<50;i++) {
			Dies[i] = new Die();
			if(Dies[i].getFaceValue()%2==0) {
				count++;
			}
		}
		
		System.out.println("Number of Die objects with an even face value: "+count);
	}

}
