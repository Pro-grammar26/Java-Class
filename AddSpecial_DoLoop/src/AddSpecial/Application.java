package AddSpecial;


public class Application {

	public static void main(String[] args) {

		Math mathA = new Math(1);
		Math mathB = new Math(2);
		Math mathC = new Math(3);

		int value = mathA.addSpecial(4);
		System.out.println("From mathA :" + value); // supposed to come as 5 (1+4)

		value = mathB.addSpecial(4);
		System.out.println("From mathB :" + value); // supposed to come as 6(2+4)

		value = mathC.addSpecial(4);
		System.out.println("From mathB :" + value); // supposed to come as 7(3+4)

		value = mathC.addSpecial(7);
		System.out.println("From mathC :" + value); // supposed to come as 14 (7+7)

		value = mathC.addSpecial(8);
		System.out.println("From mathC :" + value); // supposed to come as 22(14+8)

		 int val = Math.add(2, 3);
		 System.out.println(val);
			
		
	}

}
