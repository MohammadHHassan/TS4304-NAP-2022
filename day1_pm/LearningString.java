package day1_pm;

public class LearningString
{
	public static void main(String[] args)
	{
		String a = "ABC123";
		System.out.println("a = " + a);
		
		String b = "abc123";
		System.out.println("b = " + b);
		
		boolean c = a.equals(b);
		System.out.println("c = " + c);
		
		boolean d = a.equalsIgnoreCase(b);
		System.out.println("d = " + d);
		
		String e = "Telecommunications";
		String f = "TELECOMMUNICATIONS";
		
		int g = e.indexOf(f);
		System.out.println("g = " + g);
		
		if(g==-1)
		{
			System.out.println(f + " is not included in " + e);
		}
		else
		{
			System.out.println(f + " is included in " + e);
		}
	}
}
