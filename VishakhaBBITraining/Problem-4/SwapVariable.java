import java.io.*;
import java.util.*;
class SwapVariable
{
	public static void main(String v[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers for swap:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		num1=num1*num2;
		num2=num1/num2;
		num1=num1/num2;
		System.out.println("Swapped Values are:"+"Num1="+num1+",Num2="+num2);
	}
}