
public class Tower {
String name;
	
	public void drawSpace() {
		System.out.println(" ");
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
	
	public void draw() {
	
		drawPole();
	
	
		//Draw small pole
		Disk small = new Disk(4); 
		small.draw();


	//Draw medium pole
	Disk medium = new Disk(8);
		medium.draw();
		
		
	//Draw large pole
	Disk large = new Disk (12);
		large.draw();
	
	
	}
	
}
