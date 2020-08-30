package AddSpecial;

public class Math {

	int brainValue;

	
	 Math(int beginValue) {
         this.brainValue = beginValue;
     }
	
	
	
	 int addSpecial(int number) {	// instance method
         // get what was stored from my brain (1) and call my brainvalue
         // add number + brainvalue => newNumber (4)
         // update my brainvalue value with newNumber(5)
         // return newNewNumer (5)

         int prevStoredValue = this.brainValue;
         int sum = prevStoredValue + number;	// local vari
         this.brainValue = sum;
         return sum;
     }
	 
	 static int add(int x, int y) {
			
			int sum = x+y;
			
			return sum;
			
		}

}
