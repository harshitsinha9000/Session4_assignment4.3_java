//assignment 4.3
//ans b. super.test();
package java_session4;


class c
{
	public void test()
	{
		System.out.println("Class C Test");
	}
}

class b extends c
{
	public void test()
	{
		super.test();
		System.out.println("Class B Test");

	}
}

public class A extends b 
{

	public void test()
	{
		super.test();
		System.out.println("Class A Test");

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		A a_obj = new A();
		a_obj.test();
	}

}


//Output =  (b) super.test();