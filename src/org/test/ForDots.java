package org.test;

public class ForDots {
	private void test(Object... a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		

	}
	public static void main(String[] args) {
		ForDots d = new ForDots();
		d.test("ABINASH",10,20,30,40,50,60,70,80);
	}

}
