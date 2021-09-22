package com.sgtesting.Selenium.Reflection;



public class StringDemo1 {
	
	public void displayLength()
	{
		String s="Java";
		int a=s.length();
		System.out.println("# of Chars :"+a);
		System.out.println("++++++++++++");
	}

	public void verifyEmpty()
	{
		String s=new String();
		boolean b=s.isEmpty();
		System.out.println("Is String s Empty?:"+b);
		System.out.println("++++++++++++");
	}
	
	public void showCharacter()
	{
		String s="ORACLE";
		char ch=s.charAt(2);
		System.out.println("Character :"+ch);
		System.out.println("++++++++++++");
	}
	
	public void lowerCase()
	{
		String s="ORACLE";
		System.out.println("Lower Case :"+s.toLowerCase());
		System.out.println("++++++++++++");
	}
	
	public void upperCase()
	{
		String s="oracle";
		System.out.println("Upper Case :"+s.toUpperCase());
		System.out.println("++++++++++++");
	}
	
	public void extractString1()
	{
		String s="Programming";
		System.out.println("Extract 1:"+s.substring(3));
		System.out.println("Extract 2:"+s.substring(3,7));
		System.out.println("++++++++++++");
	}
	
	public void existanceOfString()
	{
		String s="Bangalore is a garden city";
		System.out.println("Starts With :"+s.startsWith("Bangalore"));
		System.out.println("Ends With :"+s.endsWith("city"));
		System.out.println("Contains :"+s.contains("garden"));
		System.out.println("++++++++++++");
	}
	
	public void compareStrings1()
	{
		String s1="JavaScript";
		String s2="JAVASCRIPT";
		System.out.println("s1 and s2 are equal without ignoring Case?"+s1.equals(s2));
		System.out.println("s1 and s2 are equal by ignoring Case?"+s1.equalsIgnoreCase(s2));
		System.out.println("++++++++++++");
	}
	
	public void compareStrings2()
	{
		String s1="JavaScript";
		String s2="JAVASCRIPT";
		System.out.println("s1 and s2 are equal without ignoring Case?"+s1.compareTo(s2));
		System.out.println("s1 and s2 are equal by ignoring Case?"+s1.compareToIgnoreCase(s2));
		System.out.println("++++++++++++");
	}
	
	public void splitString()
	{
		String s="Apple,Mango,Orange,Banana";
		String s1[]=s.split(",");
		for(String kk:s1)
		{
			System.out.println(kk);
		}
		System.out.println("++++++++++++");
	}
	
	public void positionOfString()
	{
		String s="xxaxxaxxaXXAXXA";
		System.out.println("Position of 'A' from Left:"+s.indexOf('A'));
		System.out.println("Position of 'A' from Right:"+s.lastIndexOf('A'));
		System.out.println("++++++++++++");
	}
	
	public void getCharArray()
	{
		String s="Oracle";
		char ch[]=s.toCharArray();
		for(char ch1:ch)
		{
			System.out.println(ch1+"  ");
		}
		System.out.println("++++++++++++");
	}
	
	public void replaceDemo()
	{
		String s="It is a palace";
		System.out.println("Replaced Result:"+s.replace("is","was"));
		System.out.println("++++++++++++");
	}
	
	public void convertToString()
	{
		int a=125;
		String s=String.valueOf(a);
		System.out.println(s);
		
		double d=12.75;
		String s1=String.valueOf(d);
		System.out.println(s1);
		System.out.println("++++++++++++");
	}
}
