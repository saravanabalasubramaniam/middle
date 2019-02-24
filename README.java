import java.io.*;
import java.util.*;
class Evenindex
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	String a=input.nextLine();
	int c=a.length();
	int temp=c;
	char ch[]=a.toCharArray();
	if(c%2==0)
	{
		int d=c/2;
		for(int i=0;i<a.length();i++)
		{
			if(i==d)
			{
				ch[i-1]='*';
				ch[i]='*';
			}
		}
		for(int j=0;j<a.length();j++)
		{
			System.out.print(ch[j]);
		}	
	}
	else
	{
		int x=temp/2;
		for(int k=0;k<temp;k++)
		{
			if(k==x)
			{
				ch[x]='*';
			}
		}
		for(int l=0;l<a.length();l++)
		{
			System.out.print(ch[l]);
		}
	}
  }
}
