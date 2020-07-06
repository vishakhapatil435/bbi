import java.io.*;
import java.util.*;
public class Thread1 extends Thread
{
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread1...... ");
		}
	}
public static void main(String Args[])
{
 
	Thread1 t=new Thread1();
	t.start();
 
	for(int i=5;i>=1;i--)
	{
		System.out.println("coding");
	}
}
}