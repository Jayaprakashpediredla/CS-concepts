interface InterfaceEx {
	static int x=10;
	static void m1() {
		System.out.print("interface");
	}
}
class A1 implements InterfaceEx
{
	public void m1()
	{
		System.out.print("class");
		
	}
}