import java.io.*;
import java.util.*;
class StackOperation1
{
	int top;
	int max=100;
	int stack[]=new int[max];
	StackOperation1()
	{
		top=-1;
	}
	public void pushData(int x)
	{
		if(top>=max-1)
		{
			System.out.println("Stack overflow!");
		}
		else
		{
			top++;
			stack[top]=x;
			System.out.println("Element pushed:"+stack[top]);
		}
	}
	public void popData()
	{
		int popped;
		if(top==-1)
		{
			System.out.println("Stack Is UnderFlow!");
		}
		else
		{
			popped=stack[top--];
			System.out.println("Popped Element is:"+popped);
			
		}
	}
	public void display()
	{
		if(top!=-1)
		{
			System.out.println("Stack Elements are:");
			for(int i=top;i>=0;--i)
			{
				System.out.println(stack[i]);
			}
			
		}
	}
	public static void main(String v[])

	{
		StackOperation1 so=new StackOperation1();
		try
		{
			int  choice,x;
			Scanner sc=new Scanner(System.in);
			while(true)
			{
			System.out.println("Choose the option for operation:");
			System.out.println("1.Push \n 2.Pop \n 3.Display \n 4.Exit");
			choice=sc.nextInt();
			
			if(choice==1)
			{
				System.out.println("Enter the value to push ");
				x=sc.nextInt();
				so.pushData(x);
			}
			else if(choice==2)
			{

				so.popData();
			}
			else if(choice==3)
			{
				so.display();
			}
			else
			{
				break;
			}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Occured"+e.getMessage());
		}
	}
}