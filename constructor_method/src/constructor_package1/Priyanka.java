package constructor_package1;

public class Priyanka 
{
	public Priyanka() 
	{
		System.out.println("default constructor");
	}
	public Priyanka(int a) 
	{
		System.out.println("one parameterized constructor");
	}
	public Priyanka(int a,int b) 
	{
		System.out.println("Two parameterized constructor");
	}
	public static void main(String[] args) 
	{
		Priyanka obj=new Priyanka();
		Priyanka obj2=new Priyanka(12);
		Priyanka obj3=new Priyanka(12,13);
		
	}
}
