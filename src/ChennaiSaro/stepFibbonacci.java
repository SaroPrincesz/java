package ChennaiSaro;

public class stepFibbonacci {

	public static void main(String[] args) {
//UserInput
		int userInput = 5;
	System.out.println("input: " + userInput);
		
		int initialFibbonacci = 0;
		int secondFibbonacci = 1;
		int fibbonacci =0;
		
		for(int i=0; i<userInput; i++) {
			fibbonacci = initialFibbonacci + secondFibbonacci;
			initialFibbonacci = secondFibbonacci;
			secondFibbonacci = fibbonacci;
		}
		
		System.out.println("output: " + fibbonacci);
		
		

	}

}
