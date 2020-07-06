import java.io.*;
import java.util.*;
class QueueOperation
{
	int front,rear,capacity=5;
	int[] array;
	QueueOperation()
	{
		front=-1;
		rear=-1;
		array=new int[capacity];
		
	}
	public void enqueue(int data)
	{
		if(rear>=capacity-1)
		{
			System.out.println("Queue is full!");
		}
		else
		{
			array[++rear]=data;
			System.out.println("Element enqueued:"+array[rear]);
		}
	}
	public void dequeue()
	{
		int deq;
		if(front==rear)
		{
			System.out.println("Queue is empty!");
		}
		else
		{
			deq=array[++front];
			System.out.println("Element dequeued:"+array[front]);
		}
	}
	public void display()
	{
		if(rear!=-1)
		{
			System.out.println("Stack Elements are:");
			for(int i=front;i<=rear;i++)
			{
				System.out.println(array[i]);
			}
			
		}
		else
		{
			System.out.println("Queue is empty!");
		}
	}
	public static void main(String v[])
	{
		QueueOperation q=new QueueOperation();
		try
		{
		int  choice,x;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Choose the option for operation:");
			System.out.println("1.Enqueue \n 2.Dequeue \n 3.Display \n 4.Exit");
			choice=sc.nextInt();
			
			if(choice==1)
			{
				System.out.println("Enter the value to enqueue ");
				x=sc.nextInt();
				q.enqueue(x);
			}
			else if(choice==2)
			{

				q.dequeue();
			}
			else if(choice==3)
			{
				q.display();
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