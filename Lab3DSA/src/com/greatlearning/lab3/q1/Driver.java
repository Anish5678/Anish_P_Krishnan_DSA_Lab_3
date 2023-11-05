package com.greatlearning.lab3.q1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		BalancingBracket BalancingBracket = new BalancingBracket();
		Scanner sObj = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inp = sObj.nextLine();
		sObj.close();
		
		if(inp == null || inp.isEmpty()) {
			System.out.println("The entered String is empty");
			
		}
		else if(BalancingBracket.isBalancedBracket(inp)){
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		

	}

}
