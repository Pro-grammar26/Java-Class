 
public class Disk {

	private int size;
	
	Disk(int size){
		this.size = size;
		
	}
	
	public void draw() {
		for(int i=0; i<size; i++) {
			System.out.println("-");
		}
		
		System.out.println(" ");
	}
	
}
