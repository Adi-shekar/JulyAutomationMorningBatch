package com.sgtesting.Selenium.Reflection;



public class StringBufferDemo {
	
	public void appendDemo()
	{
		StringBuffer s=new StringBuffer("Java");
		s.append(" Programming");
		System.out.println(s);
		System.out.println("++++++++++");
	}
	
	public void insertDemo()
	{
		StringBuffer s=new StringBuffer("It is a palace");
		s.insert(8, "new ");
		System.out.println("Insert Result:"+s);
		System.out.println("++++++++++");
	}
	
	public void deleteDemo()
	{
		StringBuffer s=new StringBuffer("It is a new palace");
		s.delete(8, 12);
		System.out.println("Deleted Result:"+s);
		System.out.println("++++++++++");
	}
	
	public void reverseStr()
	{
		StringBuffer s=new StringBuffer("It is a new palace");
		s.reverse();
		System.out.println(s);
		System.out.println("++++++++++");
	}

}
