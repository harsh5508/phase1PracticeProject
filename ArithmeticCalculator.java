package phase1programs;

import java.util.Scanner; 

public class ArithmeticCalculator {

	   public static void main(String[] args) {
		        
        Scanner sc = new Scanner(System.in);
        double r = 0;
		        		                
        System.out.println("Enter the First Number : ");
        double f = sc.nextDouble();
		        
        System.out.println("Enter the Second Number : ");
        double s = sc.nextDouble();
		        
        System.out.println("Enter the Operator (+,-,*,/) : ");
        char opr = sc.next().charAt(0);
		        
		        
          switch(opr){
          case '+':
            r = f + s;
          break;
		        
		  case '-':
            r = f - s;
          break;
		        
          case '*':
        	r = f * s;
          break;
		       
          case '/':
            r = f / s;
          break;

          }
		        
       System.out.println("The Result is : "+ f + " " + opr + " " + s + " = " + r);
		  }
  }

	


