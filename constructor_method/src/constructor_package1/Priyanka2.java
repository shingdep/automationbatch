package constructor_package1;

public class Priyanka2 
{
	public void method()
	{
		this.method3(17,28,39);
		System.out.println("default method of the class");
		this.method1(3);
	}
	public void method1(int a)
	{
		System.out.println("First method of the class");
		this.method2(2,4);
	}
	public void method2(int a,int b)
	{
		System.out.println("Second method of the class");
		this.method4(1,2,3,4);
	}
	public void method3(int a,int b,int c)
	{
		System.out.println("Third method of the class");
	}
	public void method4(int a,int b,int c,int d)
	{
		System.out.println("Fourth method of the class");
	}
	public static void main(String[] args) 
	{
		Priyanka2 m=new Priyanka2();
		m.method();
	}
}
