
public class Tower {
String name;
	
	public void drawSpace() {
		System.out.println(" ");
	}
	
	public void draw() {
		drawPole();
	}
	
	public void drawPole() {
		for (int i=0; i<4; i++) {
			System.out.println("      "
					+ "  |");
		}
	}
	
	public void drawBase() {
		System.out.println("-----------------");
	}
	
	void drawTitle() {
		System.out.println("     "+ name);
	}     
}
