package org.Sample;

public class Sample1 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before swapping value of a is:"+a);
		System.out.println("Before swapping value of b is:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping value of a is:"+a );
		System.out.println("After swapping value of b is:"+b);
}
}