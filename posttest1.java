import java.util.Scanner;
class Dupe
{
	String s;
	int count;
	char[] inp;
	public static void main(String arg[])
	{
		
		Dupe d=new Dupe();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the String:");
		d.s=scan.nextLine();
		d.s=d.s.toLowerCase();
		char[] input=d.s.toCharArray();
		System.out.println("The duplicate charachters in the given String are:");
		for (int i=0;i<d.s.length();i++)
		{
			for(int j=i+1;i<d.s.length();j++)
			{
				if(input[i]==input[j])
				{
					System.out.println(input[j]);
					d.count++;
					break;
				}
			}
		}
		
	}
}