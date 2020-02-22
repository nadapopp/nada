package operation;
import java.util.Scanner;

public class TASK1 {

	public TASK1() {
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	Scanner pop=new Scanner(System.in);
	double num1,num2,result;
	System.out.println("enter your first input:");
	num1=pop.nextDouble();
	System.out.println("enter your secound input:");
	num2=pop.nextDouble();
	result=num1+num2;
	System.out.println("the sum of your inputs="+result);
	result=num1-num2;
	System.out.println("the subtraction of your inputs="+result);
	result=num1*num2;
	System.out.println("the multipl8ication of your inputs="+result);
	result=num1/num2;
	System.out.println("the division of your inputs="+result);
	result=num1%num2;
	System.out.println("the rest of your inputs="+result);
			

	}

	}


