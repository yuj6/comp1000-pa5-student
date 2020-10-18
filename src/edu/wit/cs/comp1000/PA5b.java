/*********************************************************************
*	Lab 7 - PA5b
*	YOUR NAME HERE
*
*	COMP1000-XX  (XX is your session number)
*	MM/DD/YYYY  (UPDATE THE DATE) 
**********************************************************************
*	Problem Description (UPDATE THE DESCRIPTION)
*
*	Write a program that reads two numbers from the user and
*	prints out the sum of those two numbers. 
************************************************************************
*	Analysis (UPDATE INPUTS and OUTPUTS)
*
*	Inputs:  Two integers, read from the user.
*	Outputs: The sum of the inputs.
***********************************************************************/

package edu.wit.cs.comp1000;

import java.util.Random;

public class PA5b {

	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////////////////////
		// DO NOT CHANGE IN FINAL SUBMISSION
		//////////////////////////////////////////////////////////////////////////////
		
		Long seed;
		if (args.length != 1) {
			seed = null; // you can temporarily change this to assist in debugging
			             // the value must end in L, such as 1070L
		} else {
			seed = Long.valueOf(args[0]);
		}
		
		// Gets a random number between 1 and 100
		// Use the target variable as the correct answer for guessing
		Random random;
		if (seed == null) {
			random = new Random();
		} else {
			random = new Random(seed);
		}
		int target = (Math.abs(random.nextInt()) % 100) + 1;
		
		//////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////
		
		// It might be useful to see the correct answer
		// TODO: delete this line before attempting unit tests or submitting work
		System.out.println(target);
		
		// TODO: write your code here		
	}

}
