import java.util.*;
class PattrenPrint
{
	public static void main(String v[])
	{
		int alphabets=97;
		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=6-i;j++)
				System.out.print((char)(alphabets+j));
			for(int k=1;k<=i*2-1;k++)
				System.out.print(" ");
			for(int l=6-i;l>=0;l--)
				if(l!=6)
					System.out.print((char)(alphabets+l));
			System.out.println(" ");
		}
	}
}