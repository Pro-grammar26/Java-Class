
public class Application {

	public static void main(String[] args) {
		Tower towerA;

		towerA = new Tower();
		towerA.name = "Tower-A";
		towerA.draw();
		towerA.drawBase();
		towerA.drawTitle();
		
		
		Tower towerB;
		towerB = new Tower();
		towerB.name = "Tower-B";
		towerB.drawSpace();
		towerB.draw();
		towerB.drawBase();
		towerB.drawTitle();
		
		Tower towerC;
		towerC = new Tower();
		towerC.name = "Tower-C";
		towerC.drawSpace();
		towerC.draw();
		towerC.drawBase();
		towerC.drawTitle();
	}

}
