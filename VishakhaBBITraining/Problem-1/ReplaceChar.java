import java.io.*;
import java.util.*;
//class for replace the string
class ReplaceChar
{
	public static void main(String v[])
	{
		String acceptFromUser;
		
		//Accepting String from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string which you want to replace:");
		acceptFromUser=sc.nextLine();
		char replace[]=acceptFromUser.toCharArray();//converting  string to char array
		
		for(int i=0;i<replace.length;i++)
		{
			//replace string
			if(replace[i]=='a')
			{
				replace[i]='l';
			}
		}
		System.out.println(replace);
	}
}	
