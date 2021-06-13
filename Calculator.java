package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
			
		char operator;
	    Double n1, n2, result;
	    
	    Scanner input = new Scanner(System.in);
	    
	    // ask users to enter operator
	    System.out.println("Choose an operator: +, -, *, / ");
	    operator = input.next().charAt(0);

	    // ask users to enter numbers
	    System.out.println("Enter first number");
	    n1 = input.nextDouble();

	    System.out.println("Enter second number");
	    n2 = input.nextDouble();
	        
	    switch (operator) {

	      // addition 
	      case '+':
	        result = n1 + n2;
	        System.out.println(n1 + " + " + n2 + " = " + result);
	        break;

	      // subtraction 
	      case '-':
	        result = n1 - n2;
	        System.out.println(n1 + " - " + n2 + " = " + result);
	        break;

	      // multiplication 
	      case '*':
	        result = n1 * n2;
	        System.out.println(n1 + " * " + n2 + " = " + result);
	        break;

	      // division 
	      case '/':
	        result = n1 / n2;
	        System.out.println(n1 + " / " + n2 + " = " + result);
	        break;
	          
	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }


	    input.close();

	    
	}

}

