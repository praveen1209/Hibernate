package StringExamples;

public class ConstructorsExample {


	
	public static void main(String[] args) {
		int num1 = 2;

	      int num2 = 4;

	      System.out.println("\n***Before Swapping***");

	      System.out.println("Number 1 : "+num1);

	      System.out.println("Number 2 : "+num2);

	      //Swap logic

	      num1 = num1 + num2;

	      num2 = num1 - num2;

	      num1 = num1 - num2;
	      

	      System.out.println("\n***After Swapping***");

	      System.out.println("Number 1 : "+num1);

	      System.out.println("Number 2 : "+num2);
	}

}
