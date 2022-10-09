package constructor_package1;

public class Priyanka1 
{
	public Priyanka1()
	{
		this(6,7,8);
		System.out.println("Default parameterized Constructor");
	}
	public Priyanka1(int a)
	{
		this(6,7);
		System.out.println("one parameterized Constructor");
	}
	public Priyanka1(int a,int b)
	{
		this();
		System.out.println("Two parameterized Constructor");
	}
	public Priyanka1(int a,int b,int c)
	{
		System.out.println("Three parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		Priyanka1 obj=new Priyanka1(6);
	}
}
