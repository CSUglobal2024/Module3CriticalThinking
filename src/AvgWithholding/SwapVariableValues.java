package AvgWithholding;

public class SwapVariableValues {

	public static void main(String[] args) {
		int A = 10;
		int B = 20;		
		
		//Swap values without a third variable using bitwise XOR
		A = (int) (A ^ B);
		B = (int) (A ^ B);
		A = (int) (A ^ B);		
		
		System.out.println("After swapping: A = " + A + ", B = " + B);
		
		A = 27;
		B = 44;		
		
		//Swap values without a third variable using bitwise XOR
		A = (int) (A ^ B);
		B = (int) (A ^ B);
		A = (int) (A ^ B);		
		
		System.out.println("After swapping: A = " + A + ", B = " + B);
	}

}



