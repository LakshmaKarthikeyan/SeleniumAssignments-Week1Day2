package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
		
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		int input=153;
		int original=input;
		int calculated=0;
		
		
		// Use loop to calculate: use while loop to set condition until the number greater than 0
		while(input>0) 
		{
			
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			int remainder=input % 10;
			
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
			input=input/10;
			
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
            calculated=calculated+(remainder*remainder*remainder);
			
			
		}
		   // Check whether calculated and original are same
		
		    if(calculated==original)
		    {
		    	System.out.println(original+ " is an Armstrong number");
		    }else {
		    	System.out.println(original+ " is not an Armstrong number");
		    }
		    
		    
		

	}

}
