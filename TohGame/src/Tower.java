
public class Tower {
String name;
	
	public void drawLine() {
		System.out.println("will be drawing tower:");
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
		
	}
	
	void drawTitle() {
		
	}
}
